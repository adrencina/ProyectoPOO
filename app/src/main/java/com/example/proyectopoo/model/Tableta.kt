package com.example.proyectopoo.model

class Tableta (
    var pantalla: String,
    var ram: String,
    var almacenamiento: String,
    override var marca: String,
    override var modelo: String,
    override var estado: Estado
) : Dispositivo(marca, modelo, estado) {
    override fun toString(): String {
        return "Ordenador(marca='$marca'," +
                "modelo='$modelo'," +
                "estado=$estado," +
                "pantalla='$pantalla'," +
                "almacenamiento='$almacenamiento'," +
                "ram=$ram)"
    }
}