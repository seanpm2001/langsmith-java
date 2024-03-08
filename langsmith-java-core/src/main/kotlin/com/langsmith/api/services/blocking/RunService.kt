// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.RunBatchParams
import com.langsmith.api.models.RunBatchResponse
import com.langsmith.api.models.RunCreateParams
import com.langsmith.api.models.RunCreateResponse
import com.langsmith.api.models.RunRetrieveParams
import com.langsmith.api.models.RunSchema
import com.langsmith.api.models.RunUpdateParams
import com.langsmith.api.models.RunUpdateResponse
import com.langsmith.api.services.blocking.runs.GenerateQueryService
import com.langsmith.api.services.blocking.runs.MonitorService
import com.langsmith.api.services.blocking.runs.QueryService
import com.langsmith.api.services.blocking.runs.ShareService
import com.langsmith.api.services.blocking.runs.StatService

interface RunService { // templates/JavaSDK/services.ts:55:15 // templates/JavaSDK/services.ts:55:15
    // // templates/JavaSDK/services.ts:55:15

    fun share(): ShareService // templates/JavaSDK/services.ts:55:15

    fun query(): QueryService

    fun generateQuery(): GenerateQueryService

    fun stats(): StatService

    fun monitor(): MonitorService

    /** Create a new run. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RunCreateResponse

    /** Get a specific run. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RunSchema

    /** Update a run. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RunUpdateResponse

    /** Batch ingest runs. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun batch(
        params: RunBatchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RunBatchResponse
}
