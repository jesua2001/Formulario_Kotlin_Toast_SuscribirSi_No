package com.example.formulario

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var nombrepersona: EditText = findViewById(R.id.textoNombre)
        var apellidopersona: EditText = findViewById(R.id.apellido)
        var telefonopersona: EditText = findViewById(R.id.Telefono)
        var correo: EditText = findViewById(R.id.correo)
        var suscribirse: Switch = findViewById(R.id.suscribirse)
        var botonaceptar: Button = findViewById(R.id.botonAceptar)
        botonaceptar.setOnClickListener{
            nombrepersona.text.toString()
            apellidopersona.text.toString()
            telefonopersona.text.toString()
            correo.text.toString()

            if (nombrepersona.text.isEmpty() || apellidopersona.text.isEmpty() || telefonopersona.text.isEmpty() || correo.text.isEmpty()){
                Toast.makeText(this, "Por favor llena todos los campos", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (suscribirse.isChecked){
                Toast.makeText(this, "Gracias por suscribirte", Toast.LENGTH_LONG).show()
            }


        }
    }
}