package org.example;

import java.util.Scanner;

public class Menus {
    OperacionesBasicas op = new OperacionesBasicas();
    Scanner sc = new Scanner(System.in);
    int opcion;
    public void menu() {
        System.out.println("1. Operaciones aritméticas");
        System.out.println("2. Ecuación cuadrática");
        System.out.println("3. Figuras geométricas");
        System.out.println("4. Sistema ecuaciones lineales");
        System.out.println("5. Ecuación de la recta");
        System.out.println("6. Salir");
    }
    public void menu2(){
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Potencia");
        System.out.println("6.Porcentaje");
        System.out.println("7.Numero mayor");
        System.out.println("8.Numero menor");
    }
    public double datosNulos(double numero){
        do{
            if (numero == null){

                return numero;
            }
        }while ()
    }

    public void elegirMenu(double numero1, double nuemero2){
        int opcion;

        do{
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    double resultadoSuma = op.suma(sc.nextDouble(),sc.nextDouble());
                    System.out.println("El resultado de la suma es: " + resultadoSuma);
                    break;

                case 2:
                    double resultadoResta = op.resta(sc.nextDouble(),sc.nextDouble());
                    System.out.println("El resultado de la resta es: " + resultadoResta);
                    break;

                case 3:
                    double resultadoMultiplicacion = op.multiplicacion(sc.nextDouble(),sc.nextDouble());
                    System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);
                    break;

                case 4:
                    double resultadoDivision = op.division(sc.nextDouble(),sc.nextDouble());
                    System.out.println("El resultado de la division es: " + resultadoDivision);
                    break;
                case 5:
                    double resultadoPotencia = op.potencia(sc.nextDouble(),sc.nextDouble());
                    System.out.println("El resultado de la potencia es: " + resultadoPotencia);
                    break;
                case 6:
                    double resultadoPorcentaje = op.porcentaje(sc.nextDouble(),sc.nextDouble());
                    System.out.println("El resultado de el porcentaje es: " + resultadoPorcentaje);
                    break;
                case 7:
                    double resultadoMayor = op.numeroMayor(sc.nextDouble(),sc.nextDouble());
                    System.out.println("El numero mayor es: " + resultadoMayor);
                    break;
                case 8:
                    double resultadoMenor = op.numeroMenor(sc.nextDouble(),sc.nextDouble());
                    System.out.println("El numero menor es: " + resultadoMenor);
                    break;

                default: System.out.println("El comando ingresado no existe, intente nuevamente.");
                    break;

            }       }while(opcion > 0 && opcion < 9);
        sc.close();

        
    }
}
