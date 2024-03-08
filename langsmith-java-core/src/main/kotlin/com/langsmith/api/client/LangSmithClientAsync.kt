// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.client

import com.langsmith.api.models.*
import com.langsmith.api.services.async.*

interface LangSmithClientAsync { // templates/JavaSDK/client.ts:29:13 //
    // templates/JavaSDK/client.ts:29:13 //
    // templates/JavaSDK/client.ts:29:13

    fun sync(): LangSmithClient // templates/JavaSDK/client.ts:29:13

    fun sessions(): SessionServiceAsync

    fun apiKeys(): ApiKeyServiceAsync

    fun examples(): ExampleServiceAsync

    fun datasets(): DatasetServiceAsync

    fun runs(): RunServiceAsync

    fun runManifests(): RunManifestServiceAsync

    fun feedback(): FeedbackServiceAsync

    fun public_(): PublicServiceAsync

    fun annotationQueues(): AnnotationQueueServiceAsync

    fun tenants(): TenantServiceAsync

    fun info(): InfoServiceAsync

    fun feedbackConfigs(): FeedbackConfigServiceAsync

    fun ok(): OkServiceAsync
}
