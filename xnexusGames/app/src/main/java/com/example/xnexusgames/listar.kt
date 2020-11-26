package com.example.xnexusgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_listar.*

class listar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)

        val produtos = listOf("teste","teste2","teste3","teste4")

        listagem.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,produtos)

        listagem.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,produtos[position],Toast.LENGTH_SHORT)



        }


    }
}
