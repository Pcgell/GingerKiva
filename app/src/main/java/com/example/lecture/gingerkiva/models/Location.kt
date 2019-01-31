package com.example.lecture.gingerkiva.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Location {

    @SerializedName("country_code")
    @Expose
    var countryCode: String? = null
    @SerializedName("country")
    @Expose
    var country: String? = null
    @SerializedName("town")
    @Expose
    var town: String? = null
    @SerializedName("geo")
    @Expose
    var geo: Geo? = null

}