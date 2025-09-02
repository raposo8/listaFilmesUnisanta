package br.unisanta.listafilmes.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import br.unisanta.listafilmes.R
import br.unisanta.listafilmes.model.Filme
import br.unisanta.listafilmes.model.FilmeDAO
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dao = FilmeDAO()

        val edtTitulo = findViewById<EditText>(R.id.edt_titulo)
        val edtAutor = findViewById<EditText>(R.id.edt_autor)
        val btnAdd = findViewById<Button>(R.id.btn_add)
        val btnGet = findViewById<FloatingActionButton>(R.id.fab_get)

        btnAdd.setOnClickListener {
            val titulo = edtTitulo.text.toString()
            val autor = edtAutor.text.toString()

            val filme = Filme(titulo, autor)
            dao.addFilme(filme)

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sucesso!")
            builder.setMessage("Filme adicionado com sucesso!")
            val dialog = builder.create()
            dialog.show()

            edtTitulo.text.clear()
            edtAutor.text.clear()
        }

        btnGet.setOnClickListener {
            val intent = Intent(this, ListaFilmesActivity::class.java)
            startActivity(intent)
        }
    }
}