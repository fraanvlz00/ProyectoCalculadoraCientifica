package org.example;

public class EcuacionesCuadraticas {
    public static OperacionesBasicas op = new OperacionesBasicas();
    public static double discriminante(double numero1, double numero2, double numero3){
        return op.resta(op.potencia(numero2,2),op.multiplicacion(op.multiplicacion(numero1,numero2),4));
    }
    public static void operacionCuadratica(double numero1, double numero2, double numero3){
        double raiz = discriminante(numero1, numero2, numero3);
        if (raiz <= 0){
            double solucion1 = (-numero2 + Math.sqrt(raiz) )/(2 * numero1);
            double solucion2 = (-numero2 - Math.sqrt(raiz) )/(2 * numero1);
        }else{
            System.out.println();
        }

    }
}
