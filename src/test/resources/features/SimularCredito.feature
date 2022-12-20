# language: es

    Característica: Simulacion credito de libre inversion en la sucursal virtual personas Bancolombia
        Como cliente de Bancolombia
        Necesito simular un credito de libre inversion
        Para identificar el plan de pagos

    Escenario: Validar ingreso al simulador de creditos
        Dado que el cliente navego en la sucursal virtual hasta el portafolio de creditos
        Cuando el cliente selecciona simular credito
        Entonces se mostrara el formulario para simular el credito


    Escenario: Simular credito de libre inversion
        Dado que el cliente navego hasta el simulador de creditos
        Cuando el cliente suministre la informacion necesaria para credito de libre inversion y presione simular
        Entonces se mostrara el resultado de la simulacion






