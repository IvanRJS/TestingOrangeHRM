#language:es
#Autor: Ivan Jimenez
@Tag0
Característica: Aplicativo orangehr
  como usuario quiero ingresar al sitio de orangehr
  a agregar un empleado.

  @Tag1
  Escenario: Agregar un empleado
    Dado que Ivan quiere ingresar al sitio de orangehr
    Cuando el realiza el ingreso del registro en la aplicacion
      | first_name | middle_name | last_name | location           | other_id | date_of_birth | marital_status | gender | nacionality | driver_license | license_expiry | nick_name | military_service | smoker | blood_group | hobbies | region   | fte  | temporary_region |
      | Jhon       | will        | Hayes     | German Regional HQ | 123      | 1900-02-08    | Single         | Male   | Afghan      | 0001           | 2020-02-08     | wick      | no               | Smoker | AB          | Movies  | Region-2 | 0.75 | Sub unit-2       |

    Entonces el visualiza el nuevo empleado en el aplicativo
      | salida          |
      | Jhon will Hayes |

