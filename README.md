# Programa de Validación Rut Chileno

## Descripción del Programa
<p align="justify">El programa ValidaRut es una aplicación de consola en Java diseñada para validar el RUT (Rol Único Tributario) chileno. El RUT es un número único e irrepetible que identifica a las personas y empresas en Chile. </p>

## Funcionamiento
<p align="justify">El programa solicita al usuario que ingrese un RUT. Luego, verifica si el RUT ingresado tiene el formato correcto utilizando el método validarDato. Si el formato es correcto, el programa procede a validar el RUT utilizando el método validarRut. Si el RUT es válido, el programa imprime “verdadero”. Si el RUT no es válido, el programa imprime “falso”. Si el formato del RUT ingresado no es correcto, el programa solicita al usuario que ingrese un número de RUT válido. </p>

## Métodos
El programa consta de tres métodos principales:

- <p align="justify"> <b>main.</b> Este es el método principal del programa. Solicita al usuario que ingrese un RUT, verifica el formato y valida el RUT.

- <p align="justify"><b>validarDato. </b> Este método toma como entrada una cadena de texto que representa el RUT ingresado por el usuario. Verifica si el RUT tiene el formato correcto. El formato correcto es un número de 1 a 8 dígitos seguido de un guión y luego un dígito o la letra K/k. </p>

- <p align="justify"><b> validarRut.</b> Este método toma como entrada dos cadenas de texto que representan el número de RUT y el dígito verificador, respectivamente. Realiza el cálculo del dígito verificador y compara el resultado con el dígito verificador ingresado. Si coinciden, el método devuelve verdadero. Si no coinciden, el método devuelve falso. </p>

## Cómo Ejecutar el Programa
<p align="justify">Para ejecutar el programa, necesitarás tener instalado Java en tu computadora. Luego, puedes compilar y ejecutar el programa utilizando el compilador de Java desde la línea de comandos.</p>

````
javac ValidaRut.java
java ValidaRut
````

<p align="justify"> Luego, sigue las instrucciones en pantalla para ingresar un RUT y validar su formato y dígito verificador.</p>

<hr>
<p align="right">marely</p>
