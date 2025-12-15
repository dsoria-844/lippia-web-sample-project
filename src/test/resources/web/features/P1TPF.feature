Feature: Login

@Smoke @LoginExitosoConCincoUsuarios
  Scenario Outline: Login Exitoso con cinco usuarios diferentes
    Given el usuario se encuentra en la pagina de Swag Labs
    When ingresa el user <username>
    And ingresa la pass secret_sauce
    And hace click en el boton "Login"
    Then visualiza que la página cargada tiene el título "Products"

    Examples:
      | username          |
      | standard_user     |
      | locked_out_user      |
      | problem_user |
      | performance_glitch_user     |
      | error_user     |







