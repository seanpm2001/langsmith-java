// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExampleCreateParamsTest { // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:907:13
    fun createExampleCreateParams() { // templates/JavaSDK/entities/testing.ts:18:13
        ExampleCreateParams.builder() // templates/JavaSDK/entities/params.ts:916:21 //
            // templates/JavaSDK/entities/params.ts:916:16 //
            // templates/JavaSDK/entities/params.ts:916:16
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .inputs(JsonValue.from(mapOf<String, Any>()))
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .outputs(JsonValue.from(mapOf<String, Any>()))
            .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:1011:17
    fun getBody() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            ExampleCreateParams.builder() // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1042:16 //
                // templates/JavaSDK/entities/params.ts:1042:16
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.outputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.sourceRunId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getBodyWithoutOptionalFields() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            ExampleCreateParams.builder() // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1042:16 //
                // templates/JavaSDK/entities/params.ts:1042:16
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
