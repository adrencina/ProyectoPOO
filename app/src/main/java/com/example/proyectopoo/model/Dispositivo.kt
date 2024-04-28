package com.example.proyectopoo.model

open class Dispositivo(
    open var marca: String,
    open var modelo: String,
    open var estado: Estado) {

    override fun toString(): String {
        return "Dispositivo(marca='$marca'," +
                "modelo='$modelo'," +
                "estado=$estado)"
    }

}