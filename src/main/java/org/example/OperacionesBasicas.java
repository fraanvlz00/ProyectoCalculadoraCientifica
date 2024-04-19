package org.example;

public class OperacionesBasicas {
    public double suma(double nuemro1, double numero2){
        return nuemro1 + numero2;

    }
    public double resta(double numero1, double numero2){

        return numero1 - numero2;
    }
    public double division(double numero1, double numero2) {
        boolean correcto = false;
        do {
            try {
                double resultado;
                correcto = true;
                return resultado = numero1 / numero2;
            } catch (ArithmeticException e) {
                System.out.println("Error, division por cero:  " + "\"" + e.getMessage() + "\"");
            }
        } while (correcto == true);
    }
    public double multiplicacion(double numero1, double numero2){
        return numero1 * numero2;

    }
    public double numeroMayor (double nuemro1, double numero2){
        return Math.max(nuemro1, numero2);

    }
    public double numeroMenor (double numero1, double numero2){

        return Math.min(numero1, numero2);
    }
    public double potencia (double numero1, double numero2){

        return Math.pow(numero1,numero2);
    }
    public double porcentaje(double numero1, double numero2){

        return (numero1*numero2)/100;
    }
}
