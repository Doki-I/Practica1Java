/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

public class Libro {
    private String titulo;
    private Autor autor;
    private String fechaPublicacion;
    private String genero;
    private boolean disponibilidad;

    public Libro(String titulo, Autor autor, String fechaPublicacion, String genero, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
        this.disponibilidad = disponibilidad;
    }

    //Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }

    public String getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(String fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public boolean isDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }
    
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor.getNombre() + " " + autor.getApellido() + ", Fecha de Publicación: " + fechaPublicacion + ", Género: " + genero + ", Disponibilidad: " + (disponibilidad ? "Disponible" : "Prestado");
    }
}
