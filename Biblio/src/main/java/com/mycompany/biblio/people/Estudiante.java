package com.mycompany.biblio.people;

public class Estudiante extends Usuario{
    private static final int MAX_LIBROS_PRESTADOS = 3;
    private static final int DIAS_PRESTAMO = 14;

    public Estudiante(String id, String nombreCompleto, String direccion) {
        super(id, nombreCompleto, direccion);
    }

    @Override
    public int getMaxLibrosPrestados() {
        return MAX_LIBROS_PRESTADOS;
    }

    @Override
    public int getDiasPrestamo() {
        return DIAS_PRESTAMO;
    }
    
}
