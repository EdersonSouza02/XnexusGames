package com.example.xnexusgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_atualizar.*
import kotlinx.android.synthetic.main.activity_deletar.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btnDeletar
import kotlinx.android.synthetic.main.activity_main.txtIdDeletar

class deletar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deletar)
        val sharedPreferences = getSharedPreferences("sharedPreferencesProdutos", MODE_PRIVATE)

        btnDeletar.setOnClickListener { v: View? ->

           var id = txtIdDeletar.text.toString();
           sharedPreferences.edit().remove(id).commit();
           sharedPreferences.edit().remove(id + "Nome").commit();
           sharedPreferences.edit().remove(id + "Preco").commit();
           sharedPreferences.edit().remove(id + "Plataforma").commit();

            txtIdDeletar.setText("")

           Toast.makeText(this, "Produto removido com sucesso", Toast.LENGTH_SHORT).show();
        }
    }
}