package com.example.proyectopoo.model

data class Ordenador(
    val tipoCPU: String,
    val ram: Int,
    override var marca: String,
    override var modelo: String,
    override var estado: Estado
) : Dispositivo(marca, modelo, estado), Especificaciones{
    override fun obtenerEspecificaciones(): String {
        return "CPU: $tipoCPU," +
                "RAM: $ram GB"
    }
    override fun mostrarDetalle() {
        println("Detalles del Ordenador:")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Estado: $estado")
        println("Especificaciones: ${obtenerEspecificaciones()}")
    }
}

