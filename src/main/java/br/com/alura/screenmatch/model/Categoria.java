package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action"),
    ROMANCE("Romance"),
    DRAMA("Drama"),
    COMEDIA("Comedy"),
    CRIME("Crime"),
    AVENTURA("Adventure"),  // Adicionando a categoria "Adventure"
    HISTORIA("History");    // Adicionando a categoria "History" para cobrir todos os gêneros do exemplo

    private final String categoriaOmdb;

    Categoria(String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
