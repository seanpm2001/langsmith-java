// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunSchemaTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createRunSchema() { // templates/JavaSDK/entities/testing.ts:18:13
        val runSchema =
            RunSchema.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .appPath("string")
                .dottedOrder("string")
                .name("string")
                .runType(RunSchema.RunType.TOOL)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status("string")
                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .childRunIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .completionCost(42.23)
                .completionTokens(123L)
                .directChildRunIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("string")
                .events(listOf(JsonValue.from(mapOf<String, Any>())))
                .executionOrder(123L)
                .extra(JsonValue.from(mapOf<String, Any>()))
                .feedbackStats(RunSchema.FeedbackStats.builder().build())
                .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .inDataset(true)
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .inputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                .lastQueuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .outputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .parentRunIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .promptCost(42.23)
                .promptTokens(123L)
                .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .serialized(JsonValue.from(mapOf<String, Any>()))
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tags(listOf("string"))
                .totalCost(42.23)
                .totalTokens(123L)
                .build()
        assertThat(runSchema).isNotNull
        assertThat(runSchema.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runSchema.appPath()).isEqualTo("string")
        assertThat(runSchema.dottedOrder()).isEqualTo("string")
        assertThat(runSchema.name()).isEqualTo("string")
        assertThat(runSchema.runType()).isEqualTo(RunSchema.RunType.TOOL)
        assertThat(runSchema.sessionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runSchema.status()).isEqualTo("string")
        assertThat(runSchema.traceId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runSchema.childRunIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runSchema.completionCost()).contains(42.23)
        assertThat(runSchema.completionTokens()).contains(123L)
        assertThat(runSchema.directChildRunIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runSchema.endTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runSchema.error()).contains("string")
        assertThat(runSchema.events().get()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(runSchema.executionOrder()).contains(123L)
        assertThat(runSchema._extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runSchema.feedbackStats()).contains(RunSchema.FeedbackStats.builder().build())
        assertThat(runSchema.firstTokenTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runSchema.inDataset()).contains(true)
        assertThat(runSchema._inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runSchema._inputsS3Urls()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runSchema.lastQueuedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runSchema.manifestId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runSchema.manifestS3Id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runSchema._outputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runSchema._outputsS3Urls()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runSchema.parentRunId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runSchema.parentRunIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runSchema.promptCost()).contains(42.23)
        assertThat(runSchema.promptTokens()).contains(123L)
        assertThat(runSchema.referenceExampleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runSchema._serialized()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runSchema.shareToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runSchema.startTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runSchema.tags().get()).containsExactly("string")
        assertThat(runSchema.totalCost()).contains(42.23)
        assertThat(runSchema.totalTokens()).contains(123L)
    }
}
