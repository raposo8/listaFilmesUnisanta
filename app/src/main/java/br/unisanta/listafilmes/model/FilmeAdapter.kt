package br.unisanta.listafilmes.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.listafilmes.R

class FilmeAdapter(private val filmes: List<Filme>) : RecyclerView.Adapter<FilmeAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txvTitulo = itemView.findViewById<TextView>(R.id.txv_titulo)
        val txvAutor = itemView.findViewById<TextView>(R.id.txv_autor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_filme, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val filme = filmes[position]

        holder.txvTitulo.text = filme.titulo
        holder.txvAutor.text = filme.autor
    }

    override fun getItemCount(): Int {
        return filmes.size
    }
}