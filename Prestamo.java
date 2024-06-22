/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

public class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private String fechaPrestamo;
    private String fechaDevolucionEstimada;

    public Prestamo(Usuario usuario, Libro libro, String fechaPrestamo, String fechaDevolucionEstimada) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    //Getters y Setters
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Libro getLibro() { return libro; }
    public void setLibro(Libro libro) { this.libro = libro; }

    public String getFechaPrestamo() { return fechaPrestamo; }
    public void setFechaPrestamo(String fechaPrestamo) { this.fechaPrestamo = fechaPrestamo; }

    public String getFechaDevolucionEstimada() { return fechaDevolucionEstimada; }
    public void setFechaDevolucionEstimada(String fechaDevolucionEstimada) { this.fechaDevolucionEstimada = fechaDevolucionEstimada; }

    @Override
    public String toString() {
        return "Usuario: " + usuario.getNombre() + " " + usuario.getApellido() + ", Libro: " + libro.getTitulo() + ", Fecha de Préstamo: " + fechaPrestamo + ", Fecha de Devolución Estimada: " + fechaDevolucionEstimada;
    }
}
