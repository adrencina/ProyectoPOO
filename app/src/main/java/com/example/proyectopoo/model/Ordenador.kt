package com.example.proyectopoo.model

data class Ordenador(
    val tipoCPU: String,
    val ram: Int,
    override var marca: String,
    override var modelo: String,
    override var estado: Estado
) : Dispositivo(marca, modelo, estado) {
    override fun toString(): String {
        return "Ordenador(marca='$marca'," +
                "modelo='$modelo'," +
                "estado=$estado," +
                "tipoCPU='$tipoCPU'," +
                "ram=$ram)"
    }
}

