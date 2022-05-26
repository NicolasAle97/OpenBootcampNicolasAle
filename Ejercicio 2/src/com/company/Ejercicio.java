package com.company;

import java.util.Scanner;

public class Ejercicio {

    public void FuncionUno(int numero)
    {
        if(numero==0)
        {
            System.out.println("El numero es 0");
        }else if(numero>0)
        {
            System.out.println("El numero "+numero+" es positivo.");
        }
        else if(numero<0)
        {
            System.out.println("El numero "+numero+" es negativo.");
        }
    }


    public void FuncionDos(int numero)
    {
        if(numero<=3)
        {
            System.out.println("Numero: "+numero);
            while(numero<3)
            {
                numero++;
                System.out.println("Numero: "+numero);
            }
        }
        else
        {
            System.out.println("El numero ingresado por el usuario es "+numero+" , el cual ya es mayor a 3.");
        }
    }

    public void FuncionTres(int numero)
    {
        do {
            if(numero<3)
            {
                System.out.println("Numero: "+numero);
                numero++;
            }
            else if(numero<=4)
            {
                System.out.println("El numero ingresado por el usuario es "+numero+" , el cual ya es mayor a 3.");
            }
        }while(numero<3);
    }

    public void FuncionCuatro()
    {
        for(int numeroFor=0;numeroFor<=3;numeroFor++)
        {
            System.out.println("NumeroFor: "+numeroFor);
        }
    }

    public String FuncionCinco()
    {
        Scanner opc=new Scanner(System.in);
        String estacion = null;
        int opcion;

            System.out.println(" [ Opcion 1: Verano ] [ Opcion 2: Invierno ] [ Opcion 3: Otoño ] [ Opcion 4: Primavera ] ");
            System.out.println(" [ Ingresar Opcion ] : ");
            opcion = opc.nextInt();

            switch (opcion) {
                case 1: {
                    estacion = "Verano";
                    break;
                }
                case 2: {
                    estacion = "Invierno";
                    break;
                }
                case 3: {
                    estacion = "Otoño";
                    break;
                }
                case 4: {
                    estacion = "Primavera";
                    break;
                }
                default: {
                    System.out.println("Opcion Incorrecta.");
                    estacion=null;
                    break;
                }
            }
            return estacion;
        }

    }
