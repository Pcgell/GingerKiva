package com.example.lecture.gingerkiva.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Loan {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("description")
    @Expose
    var description: Description? = null
    @SerializedName("status")
    @Expose
    var status: String? = null
    @SerializedName("funded_amount")
    @Expose
    var fundedAmount: Int? = null
    @SerializedName("basket_amount")
    @Expose
    var basketAmount: Int? = null
    @SerializedName("image")
    @Expose
    var image: Image? = null
    @SerializedName("activity")
    @Expose
    var activity: String? = null
    @SerializedName("sector")
    @Expose
    var sector: String? = null
    @SerializedName("themes")
    @Expose
    var themes: List<String>? = null
    @SerializedName("use")
    @Expose
    var use: String? = null
    @SerializedName("location")
    @Expose
    var location: Location? = null
    @SerializedName("partner_id")
    @Expose
    var partnerId: Int? = null
    @SerializedName("posted_date")
    @Expose
    var postedDate: String? = null
    @SerializedName("planned_expiration_date")
    @Expose
    var plannedExpirationDate: String? = null
    @SerializedName("loan_amount")
    @Expose
    var loanAmount: Int? = null
    @SerializedName("borrower_count")
    @Expose
    var borrowerCount: Int? = null
    @SerializedName("lender_count")
    @Expose
    var lenderCount: Int? = null
    @SerializedName("bonus_credit_eligibility")
    @Expose
    var bonusCreditEligibility: Boolean? = null
    @SerializedName("tags")
    @Expose
    var tags: List<Tag>? = null

}