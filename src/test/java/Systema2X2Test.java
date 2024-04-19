import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Systema2X2Test {

    @Test
    public void resolver_CalculaXCorrectamente() {
        // Definimos los coeficientes de las ecuaciones
        double A = 1;
        double B = 2;
        double C = 3;
        double D = -1;
        double E = 2;
        double F = 4;

        // Definimos el valor esperado de x
        double expectedX = -0.5;

        // Ejecutamos el método a probar para calcular x
        double calculatedX = Systema2X2.resolver(A, B, C, D, E, F, true);

        // Verificamos si el resultado es correcto
        assertEquals(expectedX, calculatedX);
    }

    @Test
    public void resolver_CalculaYCorrectamente() {
        // Definimos los coeficientes de las ecuaciones
        double A = 1;
        double B = 2;
        double C = 3;
        double D = -1;
        double E = 2;
        double F = 4;

        // Definimos el valor esperado de y
        double expectedY = 1.75;

        // Ejecutamos el método a probar para calcular y
        double calculatedY = Systema2X2.resolver(A, B, C, D, E, F, false);

        // Verificamos si el resultado es correcto
        assertEquals(expectedY, calculatedY);
    }

    @Test
    public void resolver_InfinitasSoluciones_LanzaExcepcion() {
        // Definimos los coeficientes de las ecuaciones para un sistema con infinitas soluciones
        double A = 1;
        double B = 2;
        double C = 3;
        double D = 2;
        double E = 4;
        double F = 6;

        // Verificamos que lance la excepción adecuada
        assertThrows(ArithmeticException.class, () -> Systema2X2.resolver(A, B, C, D, E, F, true));
    }

    @Test
    public void resolver_SinSolucion_LanzaExcepcion() {
        // Definimos los coeficientes de las ecuaciones para un sistema sin solución
        double A = 1;
        double B = 2;
        double C = 3;
        double D = 2;
        double E = 4;
        double F = 5;

        // Verificamos que lance la excepción adecuada
        assertThrows(ArithmeticException.class, () -> Systema2X2.resolver(A, B, C, D, E, F, true));
    }
}

