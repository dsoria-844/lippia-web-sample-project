Feature: Login

  @Smoke @LoginExitoso
  Scenario: Login Exitoso
    Given el usuario se encuentra en la pagina de Swag Labs
    When ingresa el user "standard_user"
    And ingresa la pass "secret_sauce"
    And hace click en el boton "Login"
    Then visualiza que la página cargada tiene el título "Products"


  @Smoke @LoginFallidoUsuarioIncorrecto
  Scenario: Login fallido por usuario incorrecto
    Given el usuario se encuentra en la pagina de Swag Labs
    When ingresa el user "locked_out_user"
    And ingresa la pass "secret_sauce"
    And hace click en el boton "Login"
    Then visualiza el mensaje de error "Epic sadface: Sorry, this user has been locked out."


