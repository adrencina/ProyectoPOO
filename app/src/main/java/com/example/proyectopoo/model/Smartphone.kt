package com.example.proyectopoo.model

class Smartphone(
    var esDualSim: String,
    var ram: String,
    var almacenamiento: String,
    var pantalla: String,
    override var marca: String,
    override var modelo: String,
    override var estado: Estado
) : Dispositivo(marca, modelo, estado) {
    override fun toString(): String {
        return "Ordenador(marca='$marca'," +
                "modelo='$modelo'," +
                "estado=$estado," +
                "pantalla='$pantalla'," +
                "esDualSim='$esDualSim'," +
                "almacenamiento='$almacenamiento'," +
                "ram=$ram)"
    }
}