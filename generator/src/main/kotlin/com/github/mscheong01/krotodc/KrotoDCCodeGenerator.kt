// Copyright 2023 Minsoo Cheong
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.github.mscheong01.krotodc

import com.github.mscheong01.krotodc.specgenerators.FileSpecGenerator
import com.github.mscheong01.krotodc.specgenerators.file.ConverterGenerator
import com.github.mscheong01.krotodc.specgenerators.file.DataClassGenerator
import com.github.mscheong01.krotodc.specgenerators.file.GrpcKrotoGenerator
import com.google.protobuf.Descriptors
import com.google.protobuf.compiler.PluginProtos
import com.squareup.kotlinpoet.FileSpec

object KrotoDCCodeGenerator {

    val subGenerators = listOf<FileSpecGenerator>(
        DataClassGenerator(),
        GrpcKrotoGenerator(),
//        com.github.mscheong01.krotodc.subgenerators.WrappedStubGenerator(),
        ConverterGenerator()
    )

    fun generateCode(request: PluginProtos.CodeGeneratorRequest): PluginProtos.CodeGeneratorResponse {
        val fileNameToDescriptor = mutableMapOf<String, Descriptors.FileDescriptor>()
        request.protoFileList.toList()
            .forEach { file ->
                val deps = file.dependencyList.map { dep ->
                    fileNameToDescriptor[dep]
                        ?: throw IllegalStateException("Dependency $dep not found for file ${file.name}")
                }
                fileNameToDescriptor[file.name] =
                    Descriptors.FileDescriptor.buildFrom(file, deps.toTypedArray())
            }

        val generatedFileSpecs = generateFilesFromDescriptors(fileNameToDescriptor)

        return PluginProtos.CodeGeneratorResponse.newBuilder().apply {
            this.setSupportedFeatures(PluginProtos.CodeGeneratorResponse.Feature.FEATURE_PROTO3_OPTIONAL_VALUE.toLong())
                .addAllFile(kotlinPoetFileSpecToCodeGeneratorResponseFile(generatedFileSpecs))
        }.build()
    }

    fun kotlinPoetFileSpecToCodeGeneratorResponseFile(
        fileSpecs: List<FileSpec>
    ): List<PluginProtos.CodeGeneratorResponse.File> {
        return fileSpecs.map { fileSpec ->
            PluginProtos.CodeGeneratorResponse.File.newBuilder().also {
                it.name = fileSpec.packageName.replace('.', '/') + "/" + fileSpec.name
                it.content = fileSpec.toString()
            }.build()
        }
    }

    fun generateFilesFromDescriptors(
        fileNameToDescriptor: Map<String, Descriptors.FileDescriptor>
    ): List<FileSpec> {
        return subGenerators.map {
            it.generate(
                fileNameToDescriptor.filterNot { (fileName, _) ->
                    fileName.startsWith("google/")
                }
            )
        }.flatten()
    }
}