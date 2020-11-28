package com.example.xnexusgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_atualizar.*
import kotlinx.android.synthetic.main.activity_main.*

class atualizar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atualizar)

        val sharedPreferences = getSharedPreferences("sharedPreferencesProdutos", MODE_PRIVATE)

        btnLimparAlterar.setOnClickListener { v: View? ->
            txtIdAlterar.setText("")
            txtNomeAlterar.setText("")
            txtPrecoAlterar.setText("")
            txtPlataformaAlterar.setText("")
        }

        btnAlterar.setOnClickListener { v: View? ->
            sharedPreferences.edit().putString(txtIdAlterar.text.toString() + "Nome", txtNomeAlterar.text.toString()).apply();
            sharedPreferences.edit().putString(txtIdAlterar.text.toString() + "Preco", txtNomeAlterar.text.toString()).apply();
            sharedPreferences.edit().putString(txtIdAlterar.text.toString() + "Plataforma", txtNomeAlterar.text.toString()).apply();

            Toast.makeText(this, "produto alterado com sucesso! id:"+txtIdAlterar.text.toString(),Toast.LENGTH_SHORT).show();

            txtIdAlterar.setText("")
            txtNomeAlterar.setText("")
            txtPrecoAlterar.setText("")
            txtPlataformaAlterar.setText("")
        }
    }
}