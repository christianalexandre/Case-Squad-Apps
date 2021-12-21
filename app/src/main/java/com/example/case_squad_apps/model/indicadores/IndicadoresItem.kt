package com.example.case_squad_apps.model.indicadores

data class IndicadoresItem(
    val id: Int,
    val indicador: String,
    val series: List<Sery>,
    val unidade: Unidade
)