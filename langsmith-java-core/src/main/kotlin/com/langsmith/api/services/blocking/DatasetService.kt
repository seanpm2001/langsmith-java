// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.Dataset
import com.langsmith.api.models.DatasetCreateParams
import com.langsmith.api.models.DatasetDeleteParams
import com.langsmith.api.models.DatasetDeleteResponse
import com.langsmith.api.models.DatasetListParams
import com.langsmith.api.models.DatasetRetrieveParams
import com.langsmith.api.models.DatasetSchemaForUpdate
import com.langsmith.api.models.DatasetUpdateParams
import com.langsmith.api.models.DatasetUploadParams
import com.langsmith.api.services.blocking.datasets.CsvService
import com.langsmith.api.services.blocking.datasets.OpenAIFtService
import com.langsmith.api.services.blocking.datasets.OpenAIService
import com.langsmith.api.services.blocking.datasets.RunService
import com.langsmith.api.services.blocking.datasets.ShareService

interface DatasetService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    fun openai(): OpenAIService // templates/JavaSDK/services.ts:55:15

    fun openaiFt(): OpenAIFtService

    fun csv(): CsvService

    fun runs(): RunService

    fun share(): ShareService

    /** Create a new dataset. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dataset

    /** Get a specific dataset. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dataset

    /** Update a specific dataset. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetSchemaForUpdate

    /** Get all datasets by query params and owner. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<Dataset>

    /** Delete a specific dataset. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetDeleteResponse

    /** Create a new dataset from a CSV file. */
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun upload(
        params: DatasetUploadParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dataset
}
