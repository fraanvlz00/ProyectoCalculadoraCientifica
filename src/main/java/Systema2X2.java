import java.util.Scanner;

public class Systema2X2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        resolverSistemaDeEcuaciones(scanner);
    }

    public static void resolverSistemaDeEcuaciones(Scanner scanner) {
        double[] coeficientesPrimeraEcuacion = obtenerCoeficientesEcuacion(scanner, "primera");
        double[] coeficientesSegundaEcuacion = obtenerCoeficientesEcuacion(scanner, "segunda");

        try {
            double solucionX = resolver(coeficientesPrimeraEcuacion[0], coeficientesPrimeraEcuacion[1], coeficientesPrimeraEcuacion[2],
                    coeficientesSegundaEcuacion[0], coeficientesSegundaEcuacion[1], coeficientesSegundaEcuacion[2], true);
            double solucionY = resolver(coeficientesPrimeraEcuacion[0], coeficientesPrimeraEcuacion[1], coeficientesPrimeraEcuacion[2],
                    coeficientesSegundaEcuacion[0], coeficientesSegundaEcuacion[1], coeficientesSegundaEcuacion[2], false);

            System.out.println("Solución:");
            System.out.println("x = " + solucionX);
            System.out.println("y = " + solucionY);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static double[] obtenerCoeficientesEcuacion(Scanner scanner, String nombreEcuacion) {
        System.out.println("Ingrese los coeficientes para la " + nombreEcuacion + " ecuación (Ax + By = C): ");
        System.out.print("A: ");
        double A = scanner.nextDouble();
        System.out.print("B: ");
        double B = scanner.nextDouble();
        System.out.print("C: ");
        double C = scanner.nextDouble();
        return new double[]{A, B, C};
    }

    private static final double TOLERANCIA = 1e-10;

    static double resolver(double A, double B, double C, double D, double E, double F, boolean buscarX) {
        double det = D * B - A * E;
        boolean determinante = Math.abs(det) > TOLERANCIA;

        if (!determinante) {
            if (Math.abs(C * D - A * F) < TOLERANCIA && Math.abs(A) + Math.abs(B) + Math.abs(C) + Math.abs(D) + Math.abs(E) + Math.abs(F) > TOLERANCIA) {
                throw new ArithmeticException("El sistema tiene infinitas soluciones");
            } else {
                throw new ArithmeticException("El sistema no tiene solución");
            }
        }

        if (buscarX) {
            return (F * B - C * E) / det;
        } else {
            return (D * C - F * A) / det;
        }
    }
}
