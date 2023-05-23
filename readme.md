# Calculadora Microservicio

Este es un microservicio de calculadora que expone un API para realizar operaciones aritméticas básicas.

## Compilación

Para compilar el microservicio, asegúrese de tener Maven instalado y ejecute el siguiente comando:

```mvn clean package```

Esto generará un archivo JAR en el directorio `target`.

## Ejecución

Para ejecutar el microservicio, asegúrese de tener Java instalado y ejecute el siguiente comando:

```java -jar .\target\calculadora-1.0-SNAPSHOT.jar```

El microservicio estará disponible en `http://localhost:8080`. Se podrá probar con curl y postman

## API Endpoints

### Sumar

Realiza la suma de dos números enteros.

- URL: `/sumar`
- Método: `GET`
- Parámetros de consulta:
  - `a`: primer número (entero)
  - `b`: segundo número (entero)
- Ejemplo de solicitud: `http://localhost:8080/sumar?a=5&b=3`

### Restar

Realiza la resta de dos números enteros.

- URL: `/restar`
- Método: `GET`
- Parámetros de consulta:
  - `a`: primer número (entero)
  - `b`: segundo número (entero)
- Ejemplo de solicitud: `http://localhost:8080/restar?a=8&b=2`
