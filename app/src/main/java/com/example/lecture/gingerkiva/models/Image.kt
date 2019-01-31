package com.example.lecture.gingerkiva.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Image {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("template_id")
    @Expose
    var templateId: Int? = null

}