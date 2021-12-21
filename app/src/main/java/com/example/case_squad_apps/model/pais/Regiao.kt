package com.example.case_squad_apps.model.pais

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Regiao(
    val id: IdXX,
    val nome: String
) : Parcelable