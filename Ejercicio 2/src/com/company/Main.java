package com.company;

public class Main {

    public static void main(String[] args) {
        Ejercicio sistema=new Ejercicio();

        System.out.println(" [ Ejercicio 1 ]");
        sistema.FuncionUno(-2);
        sistema.FuncionUno(4);
        sistema.FuncionUno(0);

        System.out.println(" [ Ejercicio 2 ]");
        sistema.FuncionDos(-5);
        sistema.FuncionDos(4);

        System.out.println(" [ Ejercicio 3 ]");
        sistema.FuncionTres(-5);
        sistema.FuncionTres(4);

        System.out.println(" [ Ejercicio 4 ]");
        sistema.FuncionCuatro();

        System.out.println(" [ Ejercicio 5 ]");
        String estacion=sistema.FuncionCinco();
        System.out.println("La estacion elegida es "+estacion);
    }
}

