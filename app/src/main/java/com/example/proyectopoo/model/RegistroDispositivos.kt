package com.example.proyectopoo.model

object RegistroDispositivos {
    private val dispositivos = mutableListOf<Dispositivo>()
    fun agregarDispositivo(dispositivo: Dispositivo){
        dispositivos.add(dispositivo)
    }
    fun removerDispositivo(dispositivo: Dispositivo){
        dispositivos.remove(dispositivo)
    }
    fun buscarDispositivo(marca: String, modelo: String): Dispositivo? {
        return dispositivos.find { it.marca == marca && it.modelo == modelo }
    }
}