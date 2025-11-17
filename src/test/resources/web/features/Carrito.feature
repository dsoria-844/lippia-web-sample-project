Feature: Carrito de compras

@Smoke @AgregarProducto
Scenario: Agregar un producto al carrito
Given el usuario se encuentra en la pagina de Swag Labs
And el inicio de sesion exito del usuario con "standard_user" y "secret_sauce"
And el usuario presiona el boton "Add to car" para agrega el producto "Sauce Labs Backpack" al carrito
Then el carrito de compras debe mostrar el numero "1"

@Smoke @EliminarProducto
Scenario: Eliminar un producto del carrito
Given el usuario se encuentra en la pagina de Swag Labs
And el inicio de sesion exito del usuario con "standard_user" y "secret_sauce"
And el usuario presiona el boton "Add to car" para agrega el producto "Sauce Labs Backpack" al carrito
And el carrito de compras debe mostrar el numero "1"
And el usuario presiona el boton "Remove" para eliminar el producto "Sauce Labs Backpack" del carrito
Then el carrito de compras debe mostrarse vacio


