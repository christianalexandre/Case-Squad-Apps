package com.example.case_squad_apps.model.pais

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Unidade(
    val multiplicador: Int,
    val nome: String,
    val símbolo: String
) : Parcelable