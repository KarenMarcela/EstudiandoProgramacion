package com.mycompany.biblio.people;

public class Profesor extends Usuario{
    
    private static final int MAX_LIBROS_PRESTADOS = 5;
    private static final int DIAS_PRESTAMO = 28;

    public Profesor(String id, String nombreCompleto, String direccion) {
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
