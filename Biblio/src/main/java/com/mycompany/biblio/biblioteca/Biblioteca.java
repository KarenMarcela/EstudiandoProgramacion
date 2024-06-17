package com.mycompany.biblio.biblioteca;

import com.mycompany.biblio.people.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private Map<String, Libro> libros;
    private Map<String, Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        libros = new HashMap<>();
        usuarios = new HashMap<>();
        prestamos = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.put(libro.getId(), libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public void prestarLibro(String userId, String libroId) throws Exception {
        Usuario usuario = usuarios.get(userId);
        Libro libro = libros.get(libroId);

        if (usuario == null) {
            throw new Exception("Usuario no encontrado.");
        }

        if (libro == null) {
            throw new Exception("Libro no encontrado.");
        }

        long librosPrestados = prestamos.stream()
                .filter(p -> p.getUsuario().getId().equals(userId) && p.getFechaDevolucion().isAfter(LocalDate.now()))
                .count();

        if (librosPrestados >= usuario.getMaxLibrosPrestados()) {
            throw new Exception("No se pueden prestar más libros a este usuario.");
        }
        prestamos.add(new Prestamo(usuario, libro));
    }

    public void devolverLibro(String userId, String libroId) throws Exception {
        Prestamo prestamo = prestamos.stream()
                .filter(p -> p.getUsuario().getId().equals(userId) && p.getLibro().getId().equals(libroId))
                .findFirst()
                .orElse(null);

        if (prestamo == null) {
            throw new Exception("No se encontró el préstamo.");
        }

        prestamos.remove(prestamo);
    }

    public List<Libro> listarLibrosDisponibles() {
        List<Libro> disponibles = new ArrayList<>(libros.values());
        prestamos.forEach(p -> disponibles.remove(p.getLibro()));
        return disponibles;
    }

    public List<Prestamo> listarLibrosPrestados() {
        return new ArrayList<>(prestamos);
    }

    public List<Usuario> listarUsuarios() {
        return new ArrayList<>(usuarios.values());
    }

    public List<Prestamo> consultarHistorialUsuario(String userId) {
        List<Prestamo> historial = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getUsuario().getId().equals(userId)) {
                historial.add(prestamo);
            }
        }
        return historial;
    }
}
