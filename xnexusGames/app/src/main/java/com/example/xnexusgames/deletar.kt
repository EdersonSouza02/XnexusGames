package com.example.xnexusgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class deletar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deletar)
        val sharedPreferences = getSharedPreferences("sharedPreferencesProdutos", MODE_PRIVATE)

        btnDeletar.setOnClickListener { v: View? ->

           var id = txtIdDeletar.text.toString();
           sharedPreferences.edit().remove(id).commit();
           sharedPreferences.edit().remove(id + "nome").commit();
           sharedPreferences.edit().remove(id + "preco").commit();
           sharedPreferences.edit().remove(id + "plataforma").commit();

           Toast.makeText(this, "Produto removido com sucesso", Toast.LENGTH_SHORT).show();
        }
    }
}