package com.company;

public class Main {

    public static void main(String[] args) {

        PrimeraParte ejercicio=new PrimeraParte();
        System.out.println(" [ EJERCICIO UNO ]");
        System.out.println(" [ El resultado es: "+ejercicio.SumarTresNumeros(10,10,10)+ " ] ");


        Coche nuevoCoche=new Coche(2);

        System.out.println("El coche fue creado con dos puertas.");
        System.out.println(nuevoCoche.toString());

        nuevoCoche.AgregarUnaPuerta();
        nuevoCoche.AgregarUnaPuerta();

        System.out.println("El numero de puertas es incrementado.");
        System.out.println(nuevoCoche.toString());
    }


}

/*Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.*/
