package com.example.case_squad_apps.model.pais

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Nome(
    val abreviado: String
) : Parcelable