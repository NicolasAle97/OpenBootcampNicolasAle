package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(" [ Objeto persona ] ");
        Persona unaPersona=new Persona(25,"Nicolas Ale","2236229005");
        System.out.println("Nombre completo: "+unaPersona.getNombre()+ " Telefono: "+unaPersona.getTelefono()+" Edad: "+ unaPersona.getEdad());

        System.out.println(" [ Objeto persona modificado con setter ]");
        unaPersona.setNombre("Mario Buono");
        unaPersona.setTelefono("223223223");
        unaPersona.setEdad(55);
        System.out.println("Nombre completo: "+unaPersona.getNombre()+ " Telefono: "+unaPersona.getTelefono()+" Edad: "+ unaPersona.getEdad());
    }
}
