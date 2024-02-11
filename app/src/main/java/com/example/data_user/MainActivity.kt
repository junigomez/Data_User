package com.example.data_user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.data_user.model.ManagerBd

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editcodigo = findViewById<EditText>(R.id.editTextText)
        val editnombre = findViewById<EditText>(R.id.editTextText2)
        val edittelefono = findViewById<EditText>(R.id.editTextText3)
        val editdireccion = findViewById<EditText>(R.id.editTextText4)
        val editcedula = findViewById<EditText>(R.id.editTextText5)
        val editprofesion = findViewById<EditText>(R.id.editTextText6)
        val editciudad = findViewById<EditText>(R.id.editTextText7)
        val btningresar = findViewById<Button>(R.id.button)

        btningresar.setOnClickListener {
            val codigo = editcodigo.text.toString()
            val nombre = editnombre.text.toString()
            val telefono = edittelefono.text.toString()
            val direccion = editdireccion.text.toString()
            val cedula = editcedula.text.toString()
            val profesion = editprofesion.text.toString()
            val ciudad = editciudad.text.toString()

            val managerBd = ManagerBd(this)
            val resul =
                managerBd.insertDataUser(codigo, nombre, telefono, direccion, cedula, profesion, ciudad)
            if (resul > 0 ){
                Toast.makeText(this, "DATOS INSERTADOS CORRECTAMENTE" + resul, Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "PROBLEMA AL INSERTAR LOS DATOS" + resul, Toast.LENGTH_SHORT).show()
            }
        }
    }
}