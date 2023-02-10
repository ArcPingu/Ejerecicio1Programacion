# Ejercicio 1 de Programación en JAVA

### Samuel Guindal Pérez

## README
Este archivo README esta creado para el proyecto Ejercicio1Programación.

### Explicación del ejercicio
El proyecto consiste en un programa de consola que permite a un usuario elegir entre diferentes opciones y realizar diferentes acciones con números y cadenas de texto. El usuario puede elegir entre las siguientes opciones:

<ol>
<li>Lee 5 números y los muestra tal como fueron introducidos.</li>
<li>Lee 5 números y los muestra en orden inverso.</li>
<li>Lee 5 números y calcula la media, la media de los números negativos y cuenta la cantidad de ceros introducidos.</li>
<li>Pasa un texto y cuenta la cantidad de caracteres.</li>
<li>Pasa un texto y lo invierte.</li>
<li>Pasa un texto y elimina los espacios en blanco.</li>
<li>Pasa dos frases y las une en una unica frase.</li>
<li>Pasa una frase y una vocal. Reemplaza todas las vocales por la vocal indicada.</li>
<li>Pasa una frase y muestra el código ASCII de cada carácter de la frase.</li>
<li>Salir del programa.</li>
</ol>

El programa utiliza un bucle while y un switch case para llevar a cabo las diferentes acciones elegidas por el usuario. También utiliza la clase Scanner para leer la entrada del usuario, la clase ArrayList para almacenar los números introducidos y la clase Thread para parar el programa en ciertos puntos una mejor visualización.

### Explicacion de los metodos creados

#### Metodo para imprimir 5 numeros en Orden
Este método en Java imprime 5 números enteros que son pasados por parámetros y en orden. Se declara una variable "contador" para llevar un control de los números introducidos y una ArrayList para almacenarlos. Se usa Scanner para leer los números y un bucle while para pedir 5 números y almacenarlos en la ArrayList. Luego, se muestra un mensaje de confirmación y se imprimen los números almacenados en orden. El método también incluye una detención temporal de la ejecución.

#### Metodo para imprimir 5 numeros en Orden Invertido.
Este método en Java llamado "OrdenInverso" que imprime 5 números enteros en orden inverso. La función utiliza una ArrayList para almacenar los números introducidos por el usuario, los cuales son leídos por un objeto Scanner. Un bucle "while" se utiliza para asegurarse de que se reciban solo 5 números. Después de recibir los 5 números, se muestra un mensaje en pantalla y se imprimen en orden inverso. La ejecución del método se detiene temporalmente antes de finalizar.

#### Metodo Para convertir texto en ASCII.
Este método utiliza la clase Scanner de Java para leer una línea de texto escrita por el usuario. Luego, usa un bucle for para recorrer cada carácter en la cadena y convertirlo en su valor ASCII. Se utiliza el método charAt (i) para obtener el carácter en la posición i y el casting (int) para convertirlo en un valor entero. Finalmente, se utiliza la clase StringBuilder para construir una nueva cadena con los valores ASCII separados por un espacio. Finalmente, se muestran en consola la frase original y la nueva frase con los valores ASCII. El método también contiene una llamada a Thread.sleep (1000), lo que hace que el programa se detenga por 1000 milisegundos antes de imprimir en consola.

## Ejecución
Para ejecutar el programa, simplemente compile y ejecute la clase Main.