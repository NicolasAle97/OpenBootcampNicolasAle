package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente=new Cliente(25,"Nicolas","223555333",1000);
        System.out.println(cliente.toString());

        Trabajador trabajador=new Trabajador(25,"Nicolas","223123123",2000);
        System.out.println(trabajador.toString());
    }
}
