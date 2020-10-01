@tag
Feature: realice un flujo automatizado para advantage online shopping (Crear Usuario, iniciar sesión y adicionar un elemento al carrito de compras).
    Se necesita comprar un producto en advantage online shopping

  @Exitoso
  Scenario Outline: Crear, iniciar sesión y Explorar la opcion en advantage online shopping para realizar una compra
    Given que el usuario ingresa a la pagina
    And se registrar con "<UserName>","<Email>","<PassWord>","<FirstName>","<LastName>","<PhoneNumber>","<Country>","<City>","<Address>","<State>" y "<PostalCode>"
    When ingresa a la barra de menu y adicionar el elemento "HP Elite x2 1011 G1 Tablet" al carrito de compras
    Then el carrito de compras debe tener el elemento "HP ELITE X2 1011 G1 TABLET"
    Examples:
      |  UserName    |Email            |PassWord  |FirstName|LastName |PhoneNumber|Country|City|Address|State|PostalCode|
      |Manuel5537|mfnoriega@hotmail.com|Abc12345|Manuel |Noriega|3022674499 |Colombia|Medellin|Calle 23|PruebaQA|68990|
