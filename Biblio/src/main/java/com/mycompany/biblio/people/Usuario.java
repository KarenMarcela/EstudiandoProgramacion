package com.mycompany.biblio.people;

public abstract class Usuario {
    private String id;
    private String nombreCompleto;
    private String direccion;

    public Usuario(String id, String nombreCompleto, String direccion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public abstract int getMaxLibrosPrestados();

    public abstract int getDiasPrestamo();
    
}
