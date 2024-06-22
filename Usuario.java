/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

public class Usuario {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String numeroIdentificacion;

    public Usuario(String nombre, String apellido, String direccion, String telefono, String numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    //Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getNumeroIdentificacion() { return numeroIdentificacion; }
    public void setNumeroIdentificacion(String numeroIdentificacion) { this.numeroIdentificacion = numeroIdentificacion; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + ", Dirección: " + direccion + ", Teléfono: " + telefono + ", Identificación: " + numeroIdentificacion;
    }
}
