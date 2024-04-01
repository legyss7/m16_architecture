package com.hw16.data

import com.hw16.entity.UsefulActivity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import javax.inject.Inject

@JsonClass(generateAdapter = true)
class UsefulActivityDto @Inject constructor(
    @Json(name = "activity") override val activity: String,
    @Json(name = "type") override val type: String,
    @Json(name = "participants") override val participants: Int,
    @Json(name = "price") override val price: Double,
    @Json(name = "link") override val link: String,
    @Json(name = "key") override val key: Int,
    @Json(name = "accessibility") override val accessibility: Double
) : UsefulActivity
