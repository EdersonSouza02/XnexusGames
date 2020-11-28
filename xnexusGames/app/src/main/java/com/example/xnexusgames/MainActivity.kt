package com.example.xnexusgames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_atualizar.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = getSharedPreferences("sharedPreferencesProdutos", MODE_PRIVATE)

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

        btnCadastrar.setOnClickListener { v: View? ->
            var ultimoId = sharedPreferences.getString("ultimoId", "");

            if(ultimoId == ""){

                sharedPreferences.edit().putString("ultimoId", "1").apply();

                sharedPreferences.edit().putString("1id", "1").apply();
                sharedPreferences.edit().putString("1Nome", txtIdDeletar.text.toString()).apply();
                sharedPreferences.edit().putString("1Preco", txtPreco.text.toString()).apply();
                sharedPreferences.edit().putString("1Plataforma", txtPlataforma.text.toString()).apply();
                Toast.makeText(this, "Produto Cadastrado com sucesso!! Id: 1", Toast.LENGTH_SHORT).show();
            }else{
                val ultimoIdInt = ultimoId!!.toInt() + 1;
                sharedPreferences.edit().putString("ultimoId", ultimoId.toString()).apply();

                sharedPreferences.edit().putString(ultimoIdInt.toString() + "id", ultimoIdInt.toString()).apply();
                sharedPreferences.edit().putString(ultimoIdInt.toString() + "Nome", txtIdDeletar.text.toString()).apply();
                sharedPreferences.edit().putString(ultimoIdInt.toString() + "Preco", txtPreco.text.toString()).apply();
                sharedPreferences.edit().putString(ultimoIdInt.toString() + "Plataforma", txtPlataforma.text.toString()).apply();
                Toast.makeText(this, "Produto Cadastrado com sucesso!! Id: "+ ultimoIdInt.toString(), Toast.LENGTH_SHORT).show();
            }

            txtIdDeletar.setText("")
            txtPreco.setText("")
            txtPlataforma.setText("")
        }

        btnLimpar.setOnClickListener { v: View? ->
            txtIdDeletar.setText("")
            txtPreco.setText("")
            txtPlataforma.setText("")
        }

    }
}