package com.example.lecture.gingerkiva.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Geo {

    @SerializedName("level")
    @Expose
    var level: String? = null
    @SerializedName("pairs")
    @Expose
    var pairs: String? = null
    @SerializedName("type")
    @Expose
    var type: String? = null

}