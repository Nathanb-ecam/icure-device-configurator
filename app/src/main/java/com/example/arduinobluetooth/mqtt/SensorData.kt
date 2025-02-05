package com.example.arduinobluetooth.mqtt

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.UUID

data class DevicePacket(
    @JsonProperty("uid") val uid: String,
    @JsonProperty("cid") val cid: String,
    @JsonProperty("token") val token: String,
    @JsonProperty("data") val data: String
    /*@JsonProperty("data") val data: SensorDataContent*/
)

data class SensorDataContent(
    @JsonProperty("content") val content: Content
)

data class Content(
    @JsonProperty("*") val measures: MeasureValue
)

data class MeasureValue(
    @JsonProperty("measureValue") val value: MeasureDetails
)

data class MeasureDetails(
    @JsonProperty("value") val value: String?,
    @JsonProperty("unit") val unit: String?,
    @JsonProperty("comment") val comment: String?,
)