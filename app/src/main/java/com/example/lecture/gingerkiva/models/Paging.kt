package com.example.lecture.gingerkiva.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Paging {

    @SerializedName("page")
    @Expose
    var page: Int? = null
    @SerializedName("total")
    @Expose
    var total: Int? = null
    @SerializedName("page_size")
    @Expose
    var pageSize: Int? = null
    @SerializedName("pages")
    @Expose
    var pages: Int? = null

}
