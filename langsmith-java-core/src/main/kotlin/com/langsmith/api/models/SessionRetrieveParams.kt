// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class SessionRetrieveParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val sessionId: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val includeStats: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun sessionId(): String = sessionId // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun includeStats(): Optional<Boolean> = Optional.ofNullable(includeStats)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams():
        Map<String, List<String>> { // templates/JavaSDK/entities/params.ts:201:14
        val params =
            mutableMapOf<String, List<String>>() // templates/JavaSDK/entities/params.ts:210:30 //
        // templates/JavaSDK/entities/params.ts:210:30
        this.includeStats?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("include_stats", listOf(it.toString()))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String { // templates/JavaSDK/entities/params.ts:555:13
        return when (index) { // templates/JavaSDK/entities/params.ts:560:26
            0 -> sessionId // templates/JavaSDK/entities/params.ts:560:26 //
            // templates/JavaSDK/entities/params.ts:560:26
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is SessionRetrieveParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.sessionId == other.sessionId &&
            this.includeStats == other.includeStats &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            sessionId, // templates/JavaSDK/entities/fields.ts:163:19
            includeStats,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "SessionRetrieveParams{sessionId=$sessionId, includeStats=$includeStats, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var sessionId: String? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var includeStats: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(sessionRetrieveParams: SessionRetrieveParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.sessionId =
                    sessionRetrieveParams
                        .sessionId // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.includeStats = sessionRetrieveParams.includeStats
                additionalQueryParams(sessionRetrieveParams.additionalQueryParams)
                additionalHeaders(sessionRetrieveParams.additionalHeaders)
            }

        fun sessionId(sessionId: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.sessionId = sessionId
        }

        fun includeStats(includeStats: Boolean) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.includeStats = includeStats
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:703:24
                this.additionalQueryParams.clear() // templates/JavaSDK/entities/params.ts:703:24 //
                // templates/JavaSDK/entities/params.ts:703:24
                putAllQueryParams(additionalQueryParams)
            }

        fun putQueryParam(name: String, value: String) =
            apply { // templates/JavaSDK/entities/params.ts:713:24
                this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
            }

        fun putQueryParams(name: String, values: Iterable<String>) =
            apply { // templates/JavaSDK/entities/params.ts:723:24
                this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
            }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:733:24
                additionalQueryParams.forEach(this::putQueryParams)
            }

        fun removeQueryParam(name: String) = apply { // templates/JavaSDK/entities/params.ts:743:24
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:755:24
                this.additionalHeaders.clear() // templates/JavaSDK/entities/params.ts:755:24 //
                // templates/JavaSDK/entities/params.ts:755:24
                putAllHeaders(additionalHeaders)
            }

        fun putHeader(name: String, value: String) =
            apply { // templates/JavaSDK/entities/params.ts:765:24
                this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
            }

        fun putHeaders(name: String, values: Iterable<String>) =
            apply { // templates/JavaSDK/entities/params.ts:775:24
                this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
            }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:785:24
                additionalHeaders.forEach(this::putHeaders)
            }

        fun removeHeader(name: String) = apply { // templates/JavaSDK/entities/params.ts:795:24
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun build(): SessionRetrieveParams =
            SessionRetrieveParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(sessionId) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`sessionId` is required but was not set"
                },
                includeStats,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
