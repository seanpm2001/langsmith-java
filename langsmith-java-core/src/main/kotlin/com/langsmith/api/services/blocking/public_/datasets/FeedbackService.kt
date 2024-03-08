// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public_.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.FeedbackSchema
import com.langsmith.api.models.PublicDatasetFeedbackRetrieveParams

interface FeedbackService { // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15 //
    // templates/JavaSDK/services.ts:55:15

    /** Get feedback for runs in projects run over a dataset that has been shared. */
    // templates/JavaSDK/services.ts:55:15
    @JvmOverloads // templates/JavaSDK/services.ts:738:15
    fun retrieve(
        params: PublicDatasetFeedbackRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<FeedbackSchema>
}