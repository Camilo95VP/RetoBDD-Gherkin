# language: es

  Característica:Inicio de sesion en sucursal virtual personas Bancolombia
      Como cliente de Bancolombia
      Necesito iniciar sesion en la sucursal virtual personas de Bancolombia
      Para validar el portafolio de creditos de libre inversion

  Antecedentes:
    Dado que el cliente navego hasta el inicio de sesion de la sucursal virtual

  Escenario: Inicio de sesion fallido
    Cuando el cliente suministra credenciales incorrectas y confirma
    Entonces se mostrara mensaje de error de inicio de sesion fallida


  Escenario: Inicio de sesion exitoso
    Cuando el cliente suministra credenciales correctas y confirma
    Entonces se ingresara a la sucursal virtual personas de manera exitosa






