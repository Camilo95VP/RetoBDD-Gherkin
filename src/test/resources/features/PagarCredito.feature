# language: es

    Característica: Abono a credito de libre inversion en la sucursal virtual personas Bancolombia
        Como cliente de Bancolombia
        Necesito ingresar a la sucursal virtual personas
        Para abonar al credito de libre inversion

    Antecedentes:
        Dado que el cliente navego hasta el credito que tiene activo con el banco

    Escenario: Abono parcial a credito de libre inversion
        Cuando el cliente selecciona la opcion pagar, selecciona pago de cuota y confirma
        Entonces se mostrara el resultado de la transaccion

    Escenario: Abono total a credito de libre inversion
        Cuando el cliente selecciona la opcion pagar, selecciona pago total del credito y confirma
        Entonces se mostrara el resultado de la transaccion