package com.example.case_squad_apps.model.pais

import com.google.gson.annotations.SerializedName

data class Localizacao(
    val regiao: Regiao,
    @SerializedName("regiao-intermediaria")
    val regiao_intermediaria: RegiaoIntermediaria,
    @SerializedName("sub-regiao")
    val sub_regiao: SubRegiao
)