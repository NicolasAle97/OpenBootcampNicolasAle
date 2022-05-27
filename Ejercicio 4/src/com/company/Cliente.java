package com.company;

public class Cliente extends Persona{

    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    @Override
    public String toString() {
        return '[' + super.toString() + " [Cliente] " +
                " | Credito: $" + credito +
                ']';
    }
}
