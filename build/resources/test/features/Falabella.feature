# Author : Cristian López
# Language: es

  Feature: Luisa desea comprar un producto en la pagina de falabella

    Scenario Outline: Compra de un producto determinado
      Given "<Actor>" desea poder comprar un televisor
      When "<Actor>" busca un "<Producto>"
      And Agrega a la bolsa de compras
      Then El sistema debe permitir realizar el proceso de compra
      And Ofrecerle a "<Actor>" diferentes opciones de pago
    Examples:
      |Actor| Producto  |
      |Luisa| Televisor |


