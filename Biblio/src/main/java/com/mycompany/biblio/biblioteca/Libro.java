package com.mycompany.biblio.biblioteca;

public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String categoria;

    public Libro(String id, String titulo, String autor, int anioPublicacion, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getCategoria() {
        return categoria;
    }
    
}
