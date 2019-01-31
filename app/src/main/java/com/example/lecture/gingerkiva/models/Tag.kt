package com.example.lecture.gingerkiva.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Tag {

    @SerializedName("name")
    @Expose
    var name: String? = null

}