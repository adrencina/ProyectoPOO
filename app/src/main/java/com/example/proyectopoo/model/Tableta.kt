package com.example.proyectopoo.model

class Tableta (
    var pantalla: String,
    var ram: String,
    var almacenamiento: String,
    override var marca: String,
    override var modelo: String,
    override var estado: Estado
) : Dispositivo(marca, modelo, estado), Especificaciones{
    override fun obtenerEspecificaciones(): String {
        return  "Tamaño de Pantalla: ${pantalla} pulgadas," +
                "Almacenamiento: ${almacenamiento}" +
                "RAM: $ram GB,"
    }

    override fun mostrarDetalle() {
        println("Detalles de la Tableta:")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Estado: $estado")
        println("Especificaciones: ${obtenerEspecificaciones()}")
    }
}
