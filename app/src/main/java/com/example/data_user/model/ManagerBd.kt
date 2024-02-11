package com.example.data_user.model

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

data class ManagerBd (val context: Context){
    lateinit var bd: SQLiteDatabase
    val bdHelper = BdHelper(context)

    fun openBDWr(){
        bd = bdHelper.writableDatabase
    }

    fun openBdRd(){
        bd = bdHelper.readableDatabase
    }

    fun insertDataUser(codigo: String, nombre: String, telefono: String, direccion: String, cedula: String, profesion: String, ciudad: String): Long {

        openBDWr()

        val values = ContentValues()
        values.put("cod", codigo)
        values.put("nombre", nombre)
        values.put("telefono", telefono)
        values.put("direccion", direccion)
        values.put("cedula", cedula)
        values.put("profesion", profesion)
        values.put("ciudad", ciudad)

        val resul = bd.insert("user", null, values)
        return resul
    }


}