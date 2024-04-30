package com.example.proyectopoo.model

import android.util.Log


object RegistroDispositivos {
    fun agregarDispositivo(dispositivo: Dispositivo) {
        DispositivoProvider.dispositivoListData.add(dispositivo)
    }

    fun removerDispositivo(dispositivo: Dispositivo) {
        DispositivoProvider.dispositivoListData.remove(dispositivo)
    }

    fun buscarDispositivo(marca: String, modelo: String): Dispositivo? {
        return DispositivoProvider.dispositivoListData.find { it.marca == marca && it.modelo == modelo }
    }
}














//object RegistroDispositivos {
//    private val dispositivos = mutableListOf<Dispositivo>()
//    fun agregarDispositivo(dispositivo: Dispositivo){
//        dispositivos.add(dispositivo)
//    }
//    fun removerDispositivo(dispositivo: Dispositivo){
//        dispositivos.remove(dispositivo)
//    }
//    fun buscarDispositivo(marca: String, modelo: String): Dispositivo? {
//        return dispositivos.find { it.marca == marca && it.modelo == modelo }
//    }
//}
