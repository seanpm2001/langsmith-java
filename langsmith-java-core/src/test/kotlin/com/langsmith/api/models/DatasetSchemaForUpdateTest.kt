// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetSchemaForUpdateTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createDatasetSchemaForUpdate() { // templates/JavaSDK/entities/testing.ts:18:13
        val datasetSchemaForUpdate =
            DatasetSchemaForUpdate.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataType(DatasetSchemaForUpdate.DataType.KV)
                .description("string")
                .build()
        assertThat(datasetSchemaForUpdate).isNotNull
        assertThat(datasetSchemaForUpdate.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetSchemaForUpdate.name()).isEqualTo("string")
        assertThat(datasetSchemaForUpdate.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetSchemaForUpdate.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetSchemaForUpdate.dataType()).contains(DatasetSchemaForUpdate.DataType.KV)
        assertThat(datasetSchemaForUpdate.description()).contains("string")
    }
}
