package br.unisanta.listafilmes.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.listafilmes.R
import br.unisanta.listafilmes.model.FilmeAdapter
import br.unisanta.listafilmes.model.FilmeDAO

class ListaFilmesActivity : AppCompatActivity(R.layout.activity_lista_filmes) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dao = FilmeDAO()

        val recyclerViewFilmes = findViewById<RecyclerView>(R.id.rv_filmes)

        val filmes = dao.getFilmes()

        recyclerViewFilmes.layoutManager = LinearLayoutManager(this)
        recyclerViewFilmes.adapter = FilmeAdapter(filmes)
    }
}