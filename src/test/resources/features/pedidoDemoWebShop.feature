#language: es

  Característica: añadir productos al carrito de compra y comprarlos

    Escenario: pedido exitoso de los productos agregados al carrito
      Dado que el usuario esta en la landing page
      Cuando se dirige a la pagina de books añadiendo productos al carrito
      Y finaliza la compra llenando el formulario de detalles de pago
      Entonces el sistema mostrara un resumen del pedido


    Escenario: pedido fallido de los productos formulario con campos obligatorios vacios
      Dado que el usuario esta en la landing page
      Cuando se dirige a la pagina de books añadiendo productos al carrito
      Y finaliza la compra llenando algunos campos del formulario de detalles de pago
      Entonces el sistema mostrara un mensaje en los campos obligatorios vacios

