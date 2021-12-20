package com.example.case_squad_apps.model.pais

import com.google.gson.annotations.SerializedName

data class Id(
    @SerializedName("ISO-3166-1-ALPHA-2")
    val ISO_3166_1_ALPHA_2: String,
    @SerializedName("ISO-3166-1-ALPHA-3")
    val ISO_3166_1_ALPHA_3: String,
    val M49: Int
)