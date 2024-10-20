package com.carrasco.andres.usolayoutsv4

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.carrasco.andres.usolayoutsv4.databinding.ActivityEjercicio01Binding

class Ejercicio01 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enlazamos el layout con la actividad usando DataBinding
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configuramos el botón "Mostrar" para hacer visible la vista verde
        binding.btnMostrar.setOnClickListener {
            binding.viewVerde.visibility = View.VISIBLE
        }

        // Configuramos el botón "Ocultar" para ocultar la vista verde
        binding.btnOcultar.setOnClickListener {
            binding.viewVerde.visibility = View.GONE
        }
    }
}
