package cl.empresa;

/**
 * Servicio encargado de validar las credenciales de un usuario.
 *
 * Para este proyecto académico se utiliza un usuario en memoria.
 * En un sistema real las credenciales deberían validarse contra
 * una fuente de datos y la contraseña debería almacenarse de forma segura.
 */
public class LoginService {

    private static final String USUARIO_VALIDO = "admin";
    private static final String PASSWORD_VALIDO = "123456";

    /**
     * Valida las credenciales ingresadas por el usuario.
     *
     * @param usuario nombre de usuario
     * @param password contraseña ingresada
     * @return true si las credenciales son válidas, false en caso contrario
     */
    public boolean autenticar(String usuario, String password) {

        if (usuario == null || password == null) {
            return false;
        }

        return USUARIO_VALIDO.equals(usuario)
                && PASSWORD_VALIDO.equals(password);
    }
}