Feature: Inicio de sesión

  Como usuario registrado
  quiero iniciar sesión
  para acceder al sistema

  Scenario: Inicio de sesión exitoso
    Given que existe un usuario registrado con usuario "admin" y contraseña "123456"
    When ingreso el usuario "admin" y la contraseña "123456"
    Then el inicio de sesión debe ser exitoso

  Scenario Outline: Inicio de sesión rechazado con credenciales inválidas
    Given que existe un usuario registrado con usuario "admin" y contraseña "123456"
    When ingreso el usuario "<usuario>" y la contraseña "<password>"
    Then el inicio de sesión debe ser rechazado

    Examples:
      | usuario | password   |
      | admin   | incorrecta |
      | usuario | 123456     |
      | prueba  | abc123     |