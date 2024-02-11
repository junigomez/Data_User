package com.example.data_user.model

import android.os.Build.VERSION

class Constantes {

    companion object{
        const val NAME_BD = "BDUser"
        const val VERSION_BD = 3

        const val TABLA = "create table user(cod int, nombre text, telefono text, direccion text, cedula text, profesion text, ciudad text)"
    }
}