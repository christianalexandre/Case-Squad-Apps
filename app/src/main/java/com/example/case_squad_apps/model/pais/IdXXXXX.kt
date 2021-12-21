package com.example.case_squad_apps.model.pais

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class IdXXXXX(
    @SerializedName("ISO-4217-ALPHA")
    val ISO_4217_ALPHA: String,
    @SerializedName("ISO-4217-NUMERICO")
    val ISO_4217_NUMERICO: String
) : Parcelable