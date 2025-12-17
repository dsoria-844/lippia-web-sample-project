Feature: Login

@Smoke @LoginExitosoConCincoUsuarios
  Scenario Outline: Login Exitoso con credenciales correctas
    Given el usuario se encuentra en la pagina de Swag Labs
    When ingresa el user <username>
    And ingresa la pass secret_sauce
    And hace click en el boton "Login"
    Then visualiza que la página cargada tiene el título "Products"

    Examples:
      | username                    |
      | standard_user               |
      | problem_user                |
      | performance_glitch_user     |
      | error_user                  |
      | visual_user                 |


@Smoke @LoginFallido
  Scenario Outline: Login fallido con credenciales incorrectas
  Given el usuario se encuentra en la pagina de Swag Labs
    When ingresa el user <username>
    And ingresa la pass <password>
    And hace click en el boton "Login"
    Then visualiza el mensaje de error <mnsgError>

    Examples:
      | username          | password        | mnsgError |
      | locked_out_user   | secret_sauce    |Epic sadface: Sorry, this user has been locked out.|
      | test              | test            |Epic sadface: Username and password do not match any user in this service|



