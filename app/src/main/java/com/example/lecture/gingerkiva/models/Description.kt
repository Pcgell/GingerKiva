package com.example.lecture.gingerkiva.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Description {

    @SerializedName("languages")
    @Expose
    var languages: List<String>? = null

}