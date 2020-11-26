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

        val sharedPreferences = getSharedPreferences("sharedPreferencesProdutos", MODE_PRIVATE)

        val produtos = arrayOf(sharedPreferences.all)

        listagem.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,produtos)

        listagem.setOnItemClickListener { parent, view, position, id ->
            for (value in sharedPreferences.all)
            Toast.makeText(this,sharedPreferences.getString("1"+"Nome",""),Toast.LENGTH_SHORT).show()
        }


    }
}
