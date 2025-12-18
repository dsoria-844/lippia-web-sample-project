Feature: Compra de productos

  @Smoke @CompraExitosa
  Scenario Outline: Compra exitosa
    Given el usuario se encuentra logueado con user <username> y pass secret_sauce
    And tiene agregado al carrito el producto Sauce Labs Backpack y Sauce Labs Bike Light
    When hace click en el icono del carrito
    And hace click en el boton Checkout
    And completa los datos personales con Nombre <nombre>, Apellido <apellido> y Código Postal <codigoPostal>
    And hace click en el boton Continue
    Then visualiza la página de Overview con los productos agregados al carrito
    When hace click en el boton Finish
    Then visualiza la página de confirmación de la compra con el mensaje "Thank you for your order!"

    Examples:
      | username      | producto1           | producto2             | nombre | apellido | codigoPostal |
      | standard_user | Sauce Labs Backpack | Sauce Labs Bike Light | Diego  | Soria    | 4400         |