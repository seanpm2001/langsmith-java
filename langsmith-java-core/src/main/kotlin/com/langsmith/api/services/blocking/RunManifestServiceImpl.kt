// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.blocking

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.RunManifestRetrieveParams
import com.langsmith.api.models.RunManifestSchema
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class RunManifestServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RunManifestService { // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15

    private val errorHandler: Handler<LangSmithError> =
        errorHandler(clientOptions.jsonMapper) // templates/JavaSDK/services.ts:76:15

    private val retrieveHandler:
        Handler<
            RunManifestSchema
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<RunManifestSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a specific run manifest. */
    override fun retrieve(
        params: RunManifestRetrieveParams,
        requestOptions: RequestOptions
    ): RunManifestSchema { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.GET
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
                .addPathSegments("run-manifests", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response
                .use { // templates/JavaSDK/services.ts:166:8 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                    retrieveHandler.handle(it)
                }
                .apply { // templates/JavaSDK/services.ts:176:10
                    if (
                        requestOptions.responseValidation ?: clientOptions.responseValidation
                    ) { // templates/JavaSDK/services.ts:179:14 //
                        // templates/JavaSDK/services.ts:176:10 //
                        // templates/JavaSDK/services.ts:176:10
                        validate()
                    }
                }
        }
    }
}
