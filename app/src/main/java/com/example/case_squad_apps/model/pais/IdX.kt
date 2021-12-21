package com.example.case_squad_apps.model.pais

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class IdX(
    @SerializedName("ISO-639-1")
    val ISO_639_1: String,
    @SerializedName("ISO_639_2")
    val ISO_639_2: String
) : Parcelable