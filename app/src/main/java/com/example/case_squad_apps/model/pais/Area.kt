package com.example.case_squad_apps.model.pais

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Area(
    val total: String,
    val unidade: Unidade
) : Parcelable