package com.example.xnexusgames

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_listar.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnListar.setOnClickListener { v: View? ->

            var intent = Intent(this, listar::class.java);
            startActivity(intent);

        }

        btnDeletar.setOnClickListener { v: View? ->

            var intent = Intent(this, deletar::class.java);
            startActivity(intent);

        }
        btnAtualizar.setOnClickListener { v: View? ->

            var intent = Intent(this, atualizar::class.java);
            startActivity(intent);

        }






    }
}