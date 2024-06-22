/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.biblioteca;

import javax.swing.*;

public class Biblioteca {
    private Libro[] libros;
    private Autor[] autores;
    private Usuario[] usuarios;
    private Prestamo[] prestamos;
    private int numLibros;
    private int numAutores;
    private int numUsuarios;
    private int numPrestamos;

    public Biblioteca(int maxLibros, int maxAutores, int maxUsuarios, int maxPrestamos) {
        this.libros = new Libro[maxLibros];
        this.autores = new Autor[maxAutores];
        this.usuarios = new Usuario[maxUsuarios];
        this.prestamos = new Prestamo[maxPrestamos];
        this.numLibros = 0;
        this.numAutores = 0;
        this.numUsuarios = 0;
        this.numPrestamos = 0;
    }

    //Métodos para añadir, eliminar y buscar libros, autores, usuarios y préstamos
    public void addLibro(Libro libro) {
        if (numLibros < libros.length) {
            libros[numLibros++] = libro;
        } else {
            JOptionPane.showMessageDialog(null,"No se pueden añadir más libros");
        }
    }

    public void addAutor(Autor autor) {
        if (numAutores < autores.length) {
            autores[numAutores++] = autor;
        } else {
            JOptionPane.showMessageDialog(null,"No se pueden añadir más autores");
        }
    }

    public void addUsuario(Usuario usuario) {
        if (numUsuarios < usuarios.length) {
            usuarios[numUsuarios++] = usuario;
        } else {
            JOptionPane.showMessageDialog(null,"No se pueden añadir más usuarios");
        }
    }

    public void addPrestamo(Prestamo prestamo) {
        if (numPrestamos < prestamos.length) {
            prestamos[numPrestamos++] = prestamo;
        } else {
            JOptionPane.showMessageDialog(null,"No se pueden añadir más préstamos");
        }
    }

    public String listarLibros() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numLibros; i++) {
            sb.append(libros[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public String listarAutores() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numAutores; i++) {
            sb.append(autores[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public String listarUsuarios() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numUsuarios; i++) {
            sb.append(usuarios[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public String listarPrestamos() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numPrestamos; i++) {
            sb.append(prestamos[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10, 10, 10, 10);

        //Crear autores
        Autor autor1 = new Autor("Gabriel", "García Márquez", "Colombiana", "1927-03-06");
        Autor autor2 = new Autor("Haruki", "Murakami", "Japonesa", "1949-01-12");

        //Añadir autores a la biblioteca
        biblioteca.addAutor(autor1);
        biblioteca.addAutor(autor2);

        //Crear libros
        Libro libro1 = new LibroLiteratura("Cien Años de Soledad", autor1, "1967", "Literatura", true);
        Libro libro2 = new Manga("Norwegian Wood", autor2, "1987", "Manga", true);

        //Añadir libros a la biblioteca
        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);

        //Crear usuarios
        Usuario usuario1 = new Usuario("Juan", "Pérez", "Calle Falsa 123", "555-1234", "0001");
        Usuario usuario2 = new Usuario("Ana", "García", "Avenida Siempre Viva 742", "555-5678", "0002");

        //Añadir usuarios a la biblioteca
        biblioteca.addUsuario(usuario1);
        biblioteca.addUsuario(usuario2);

        //Crear préstamos
        Prestamo prestamo1 = new Prestamo(usuario1, libro1, "2024-06-20", "2024-07-20");

        //Añadir préstamos a la biblioteca
        biblioteca.addPrestamo(prestamo1);

        //Interacción con el usuario mediante JOptionPane
        String[] opciones = {"Listar Libros", "Listar Autores", "Listar Usuarios", "Listar Préstamos", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Biblioteca",
                                                  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                                  null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, biblioteca.listarLibros());
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, biblioteca.listarAutores());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, biblioteca.listarUsuarios());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, biblioteca.listarPrestamos());
                    break;
            }
        } while (opcion != 4);
    }
}
