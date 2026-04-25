package com.uniajc.modelo;

public class Materia {
    private int id;
    private String nombre;
    private int creditos;

    // Constructor vacío
    public Materia() {}

    // Constructor con parámetros
    public Materia(int id, String nombre, int creditos) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }
}
