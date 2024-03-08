// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(
    builder = DatasetShareSchema.Builder::class
) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@NoAutoDetect
class DatasetShareSchema
private constructor(
    private val datasetId: JsonField<String>,
    private val shareToken: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun datasetId(): String = datasetId.getRequired("dataset_id")

    fun shareToken(): String = shareToken.getRequired("share_token")

    @JsonProperty("dataset_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _datasetId() = datasetId

    @JsonProperty("share_token") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _shareToken() = shareToken

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DatasetShareSchema = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            datasetId() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            shareToken()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is DatasetShareSchema && // templates/JavaSDK/entities/fields.ts:143:33
            this.datasetId == other.datasetId &&
            this.shareToken == other.shareToken &&
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
                    datasetId, // templates/JavaSDK/entities/fields.ts:163:19
                    shareToken,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "DatasetShareSchema{datasetId=$datasetId, shareToken=$shareToken, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var datasetId: JsonField<String> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var shareToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(datasetShareSchema: DatasetShareSchema) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.datasetId =
                    datasetShareSchema.datasetId // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.shareToken = datasetShareSchema.shareToken
                additionalProperties(datasetShareSchema.additionalProperties)
            }

        fun datasetId(datasetId: String) =
            datasetId(JsonField.of(datasetId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("dataset_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun datasetId(datasetId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.datasetId = datasetId
            }

        fun shareToken(shareToken: String) =
            shareToken(JsonField.of(shareToken)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("share_token") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun shareToken(shareToken: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.shareToken = shareToken
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.clear() // templates/JavaSDK/entities/objects.ts:290:30 //
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

        fun build(): DatasetShareSchema =
            DatasetShareSchema( // templates/JavaSDK/entities/objects.ts:326:30
                datasetId, // templates/JavaSDK/entities/objects.ts:326:30
                shareToken,
                additionalProperties.toUnmodifiable(),
            )
    }
}
