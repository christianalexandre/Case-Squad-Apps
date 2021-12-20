package com.example.case_squad_apps.model.pais

import com.google.gson.annotations.SerializedName

data class PaisItem(
    val area: Area,
    val governo: Governo,
    val historico: String,
    val id: Id,
    val linguas: List<Lingua>,
    val localizacao: Localizacao,
    val nome: Nome,
    @SerializedName("unidades-monetarias")
    val unidades_monetarias: List<UnidadesMonetaria>
)