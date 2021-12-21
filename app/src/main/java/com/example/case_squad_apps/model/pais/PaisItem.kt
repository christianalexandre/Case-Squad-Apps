package com.example.case_squad_apps.model.pais

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
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
) : Parcelable