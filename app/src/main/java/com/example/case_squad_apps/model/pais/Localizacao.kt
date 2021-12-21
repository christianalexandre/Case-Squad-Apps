package com.example.case_squad_apps.model.pais

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Localizacao(
    val regiao: Regiao,
    @SerializedName("regiao-intermediaria")
    val regiao_intermediaria: RegiaoIntermediaria,
    @SerializedName("sub-regiao")
    val sub_regiao: SubRegiao
) : Parcelable