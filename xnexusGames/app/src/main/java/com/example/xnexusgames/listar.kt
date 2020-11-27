package com.example.xnexusgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_listar.*

class listar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)

        val sharedPreferences = getSharedPreferences("sharedPreferencesProdutos", MODE_PRIVATE)

        val arrayAdapter: ArrayAdapter<*>
        val personas = mutableListOf<String>()

        for (nomes in sharedPreferences.all) {
            val result = nomes.toString()
            if(result.substring(1, 5) == "Nome")
                personas.add(result.substring(6, result.length))
        }

        val dados = findViewById<ListView>(R.id.listagem)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, personas)
        dados.adapter = arrayAdapter
    }
}