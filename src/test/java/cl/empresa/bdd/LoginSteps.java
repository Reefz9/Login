package cl.empresa.bdd;

import cl.empresa.LoginService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {

    private LoginService loginService;
    private boolean resultadoLogin;

    @Given("que existe un usuario registrado con usuario {string} y contraseña {string}")
    public void existeUsuarioRegistrado(String usuario, String password) {
        loginService = new LoginService();
    }

    @When("ingreso el usuario {string} y la contraseña {string}")
    public void ingresoCredenciales(String usuario, String password) {
        resultadoLogin = loginService.autenticar(usuario, password);
    }

    @Then("el inicio de sesión debe ser exitoso")
    public void inicioSesionExitoso() {
        assertTrue(resultadoLogin);
    }

    @Then("el inicio de sesión debe ser rechazado")
    public void inicioSesionRechazado() {
        assertFalse(resultadoLogin);
    }
}