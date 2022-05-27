package com.company;

public abstract class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return '[' + " [Persona]" +
                " | Edad:" + edad +
                " | Nombre: " + nombre +
                " | Telefono: " + telefono +
                ']';
    }
}
