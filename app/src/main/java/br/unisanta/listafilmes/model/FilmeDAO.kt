package br.unisanta.listafilmes.model

class FilmeDAO {
    companion object {
        val filmes = mutableListOf<Filme>()
    }

    fun getFilmes(): List<Filme> {
        return filmes
    }

    fun addFilme(filme: Filme) {
        filmes.add(filme)
    }
}