package com.example.case_squad_apps.model.paisDAO

import com.example.case_squad_apps.model.pais.PaisItem

class PaisDAO {

    fun adiciona(pais: PaisItem){
        paises.add(pais)
    }

    fun buscarPaises() : List<PaisItem>{
        return paises.toList()
    }

    companion object {
        private val paises = mutableListOf<PaisItem>()
    }
}