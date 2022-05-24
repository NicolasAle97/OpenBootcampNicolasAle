package com.company;

public class Coche {
        private int puertas;

    public Coche(int puertas) {
        this.puertas=puertas;
    }

    public void AgregarUnaPuerta()
    {
        this.puertas=puertas+1;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "puertas=" + puertas +
                '}';
    }
}
