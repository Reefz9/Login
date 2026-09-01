package cl.empresa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoginServiceTest {

    @Test
    void deberiaAutenticarUsuarioConCredencialesValidas() {

        LoginService loginService = new LoginService();

        boolean resultado =
                loginService.autenticar("admin", "123456");

        assertTrue(resultado);
    }

    @Test
    void deberiaRechazarPasswordIncorrecta() {

        LoginService loginService = new LoginService();

        boolean resultado =
                loginService.autenticar("admin", "incorrecta");

        assertFalse(resultado);
    }

    @Test
    void deberiaRechazarUsuarioIncorrecto() {

        LoginService loginService = new LoginService();

        boolean resultado =
                loginService.autenticar("usuario", "123456");

        assertFalse(resultado);
    }

    @Test
    void deberiaRechazarCredencialesNulas() {

        LoginService loginService = new LoginService();

        boolean resultado =
                loginService.autenticar(null, null);

        assertFalse(resultado);
    }
}