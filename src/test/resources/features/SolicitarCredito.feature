# language: es

    Característica: Solicitud de credito de libre inversion en sucursal virtual personas Bancolombia
        Como cliente de Bancolombia
        Necesito ingresar al portafolio de creditos de la sucursal virtual personas
        Para solicitar un credito de libre inversion

    Antecedentes:
        Dado que el cliente navego hasta la seccion de solicitud de creditos

    Escenario: Solicitar credito libre inversion fallida
        Cuando el cliente suministre la informacion incompleta para credito de libre inversion y presione solicitar
        Entonces se mostrara advertencia de que falta informacion para solicitar el credito

    Escenario: Solicitar credito de libre inversion existoso
        Cuando el cliente suministre la informacion necesaria para credito de libre inversion y presione solicitar
        Entonces se mostrara solicitud de credito enviada exitosamente