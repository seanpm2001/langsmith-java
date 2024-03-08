// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class SessionUpdateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val sessionId: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val defaultDatasetId: String?,
    private val description: String?,
    private val endTime: OffsetDateTime?,
    private val extra: JsonValue?,
    private val name: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun sessionId(): String = sessionId // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun defaultDatasetId(): Optional<String> = Optional.ofNullable(defaultDatasetId)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime)

    fun extra(): Optional<JsonValue> = Optional.ofNullable(extra)

    fun name(): Optional<String> = Optional.ofNullable(name)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody(): SessionUpdateBody { // templates/JavaSDK/entities/params.ts:165:16
        return SessionUpdateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            defaultDatasetId, // templates/JavaSDK/entities/params.ts:180:26
            description,
            endTime,
            extra,
            name,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String { // templates/JavaSDK/entities/params.ts:555:13
        return when (index) { // templates/JavaSDK/entities/params.ts:560:26
            0 -> sessionId // templates/JavaSDK/entities/params.ts:560:26 //
            // templates/JavaSDK/entities/params.ts:560:26
            else -> ""
        }
    }

    /** Update class for TracerSession. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = SessionUpdateBody.Builder::class)
    @NoAutoDetect
    class SessionUpdateBody
    internal constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val defaultDatasetId: String?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val description: String?,
        private val endTime: OffsetDateTime?,
        private val extra: JsonValue?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("default_dataset_id") // templates/JavaSDK/entities/objects.ts:113:14
        fun defaultDatasetId(): String? = defaultDatasetId

        @JsonProperty("description") // templates/JavaSDK/entities/objects.ts:113:14
        fun description(): String? = description

        @JsonProperty("end_time") // templates/JavaSDK/entities/objects.ts:113:14
        fun endTime(): OffsetDateTime? = endTime

        @JsonProperty("extra") // templates/JavaSDK/entities/objects.ts:113:14
        fun extra(): JsonValue? = extra

        @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:113:14
        fun name(): String? = name

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is SessionUpdateBody && // templates/JavaSDK/entities/fields.ts:143:33
                this.defaultDatasetId == other.defaultDatasetId &&
                this.description == other.description &&
                this.endTime == other.endTime &&
                this.extra == other.extra &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                // templates/JavaSDK/entities/fields.ts:174:16 //
                // templates/JavaSDK/entities/fields.ts:174:16
                hashCode =
                    Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                        // templates/JavaSDK/entities/fields.ts:175:16 //
                        // templates/JavaSDK/entities/fields.ts:175:16
                        defaultDatasetId, // templates/JavaSDK/entities/fields.ts:163:19
                        description,
                        endTime,
                        extra,
                        name,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SessionUpdateBody{defaultDatasetId=$defaultDatasetId, description=$description, endTime=$endTime, extra=$extra, name=$name, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var defaultDatasetId: String? =
                null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var description: String? = null
            private var endTime: OffsetDateTime? = null
            private var extra: JsonValue? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(sessionUpdateBody: SessionUpdateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.defaultDatasetId =
                        sessionUpdateBody
                            .defaultDatasetId // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.description = sessionUpdateBody.description
                    this.endTime = sessionUpdateBody.endTime
                    this.extra = sessionUpdateBody.extra
                    this.name = sessionUpdateBody.name
                    additionalProperties(sessionUpdateBody.additionalProperties)
                }

            @JsonProperty("default_dataset_id") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun defaultDatasetId(defaultDatasetId: String) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.defaultDatasetId = defaultDatasetId
                }

            @JsonProperty("description") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun description(description: String) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.description = description
                }

            @JsonProperty("end_time") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun endTime(endTime: OffsetDateTime) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.endTime = endTime
                }

            @JsonProperty("extra") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun extra(extra: JsonValue) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.extra = extra
            }

            @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun name(name: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.name = name
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                    // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:304:30
                    this.additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:316:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): SessionUpdateBody =
                SessionUpdateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    defaultDatasetId, // templates/JavaSDK/entities/objects.ts:326:30
                    description,
                    endTime,
                    extra,
                    name,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is SessionUpdateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.sessionId == other.sessionId &&
            this.defaultDatasetId == other.defaultDatasetId &&
            this.description == other.description &&
            this.endTime == other.endTime &&
            this.extra == other.extra &&
            this.name == other.name &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            sessionId, // templates/JavaSDK/entities/fields.ts:163:19
            defaultDatasetId,
            description,
            endTime,
            extra,
            name,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SessionUpdateParams{sessionId=$sessionId, defaultDatasetId=$defaultDatasetId, description=$description, endTime=$endTime, extra=$extra, name=$name, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var defaultDatasetId: String? = null
        private var description: String? = null
        private var endTime: OffsetDateTime? = null
        private var extra: JsonValue? = null
        private var name: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(sessionUpdateParams: SessionUpdateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.sessionId =
                    sessionUpdateParams.sessionId // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.defaultDatasetId = sessionUpdateParams.defaultDatasetId
                this.description = sessionUpdateParams.description
                this.endTime = sessionUpdateParams.endTime
                this.extra = sessionUpdateParams.extra
                this.name = sessionUpdateParams.name
                additionalQueryParams(sessionUpdateParams.additionalQueryParams)
                additionalHeaders(sessionUpdateParams.additionalHeaders)
                additionalBodyProperties(sessionUpdateParams.additionalBodyProperties)
            }

        fun sessionId(sessionId: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.sessionId = sessionId
        }

        fun defaultDatasetId(defaultDatasetId: String) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.defaultDatasetId = defaultDatasetId
            }

        fun description(description: String) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.description = description
            }

        fun endTime(endTime: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.endTime = endTime
            }

        fun extra(extra: JsonValue) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.extra = extra
        }

        fun name(name: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.name = name
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/params.ts:809:28
                this.additionalBodyProperties
                    .clear() // templates/JavaSDK/entities/params.ts:809:28 //
                // templates/JavaSDK/entities/params.ts:809:28
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/params.ts:822:28
                this.additionalBodyProperties.put(key, value)
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/params.ts:832:28
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SessionUpdateParams =
            SessionUpdateParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(sessionId) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`sessionId` is required but was not set"
                },
                defaultDatasetId,
                description,
                endTime,
                extra,
                name,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
