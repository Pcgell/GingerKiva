package com.example.lecture.gingerkiva.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LoanResponse {

    @SerializedName("paging")
    @Expose
    var paging: Paging? = null
    @SerializedName("loans")
    @Expose
    var loans: List<Loan>? = null

}