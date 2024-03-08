// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TenantForUserTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createTenantForUser() { // templates/JavaSDK/entities/testing.ts:18:13
        val tenantForUser =
            TenantForUser.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    TenantForUser.Config.builder()
                        .flags(TenantForUser.Config.Flags.builder().build())
                        .isPersonal(true)
                        .maxHourlyTracingBytes(123L)
                        .maxHourlyTracingRequests(123L)
                        .maxIdentities(123L)
                        .maxMonthlyTotalUniqueTraces(123L)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("string")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .readOnly(true)
                .tenantHandle("string")
                .build()
        assertThat(tenantForUser).isNotNull
        assertThat(tenantForUser.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tenantForUser.config())
            .isEqualTo(
                TenantForUser.Config.builder() // templates/JavaSDK/entities/objects.ts:717:13
                    .flags(TenantForUser.Config.Flags.builder().build())
                    .isPersonal(true)
                    .maxHourlyTracingBytes(123L)
                    .maxHourlyTracingRequests(123L)
                    .maxIdentities(123L)
                    .maxMonthlyTotalUniqueTraces(123L)
                    .build()
            )
        assertThat(tenantForUser.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tenantForUser.displayName()).isEqualTo("string")
        assertThat(tenantForUser.organizationId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tenantForUser.readOnly()).contains(true)
        assertThat(tenantForUser.tenantHandle()).contains("string")
    }
}
