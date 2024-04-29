package com.example.proyectopoo.model

class Smartphone(
    var esDualSIM: Boolean,
    var ram: String,
    var almacenamiento: String,
    var pantalla: String,
    override var marca: String,
    override var modelo: String,
    override var estado: Estado
) : Dispositivo(marca, modelo, estado), Especificaciones{
    override fun obtenerEspecificaciones(): String {

        val dualSim = if (esDualSIM) "Dual SIM" else "SIM único"

        return "Tamaño de Pantalla: ${pantalla} pulgadas," +
                "Almacenamiento: ${almacenamiento}" +
                "RAM: $ram GB," + dualSim
    }
    override fun mostrarDetalle() {
        println("Detalles del Smartphone:")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Estado: $estado")
        println("Especificaciones: ${obtenerEspecificaciones()}")
    }
}