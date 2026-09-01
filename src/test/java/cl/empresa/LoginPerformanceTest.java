package cl.empresa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Prueba básica de rendimiento del componente de autenticación.
 *
 * La prueba mide la cantidad de operaciones de login que pueden
 * ejecutarse durante un período determinado.
 */
class LoginPerformanceTest {

    @Test
    void deberiaSoportarCargaBasicaDeAutenticacion() {

        LoginService loginService = new LoginService();

        int cantidadOperaciones = 10_000;
        int operacionesExitosas = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < cantidadOperaciones; i++) {

            boolean resultado =
                    loginService.autenticar("admin", "123456");

            if (resultado) {
                operacionesExitosas++;
            }
        }

        long fin = System.nanoTime();

        long tiempoTotalNanos = fin - inicio;

        double tiempoTotalSegundos =
                tiempoTotalNanos / 1_000_000_000.0;

        double tps =
                cantidadOperaciones / tiempoTotalSegundos;

        double latenciaPromedioMs =
                (tiempoTotalNanos / 1_000_000.0)
                        / cantidadOperaciones;

        int errores =
                cantidadOperaciones - operacionesExitosas;

        double porcentajeErrores =
                (errores * 100.0) / cantidadOperaciones;

        System.out.println("======================================");
        System.out.println("     REPORTE DE PERFORMANCE - LOGIN");
        System.out.println("======================================");
        System.out.println("Operaciones: " + cantidadOperaciones);
        System.out.println("Exitosas: " + operacionesExitosas);
        System.out.println("Errores: " + errores);
        System.out.printf("Tasa de errores: %.2f%%%n",
                porcentajeErrores);
        System.out.printf("Tiempo total: %.4f segundos%n",
                tiempoTotalSegundos);
        System.out.printf("TPS: %.2f%n", tps);
        System.out.printf("Latencia promedio: %.6f ms%n",
                latenciaPromedioMs);
        System.out.println("======================================");

        // Quality Gate básico:
        // Todas las operaciones deberían ejecutarse correctamente.
        assertTrue(
                porcentajeErrores < 1.0,
                "La tasa de errores supera el 1%"
        );
    }
}