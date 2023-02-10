# Ejercicio 1 de Programación en JAVA

### Samuel Guindal Pérez

## Explicación del ejercicio
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

## Explicacion de los metodos creados

### Metodo para imprimir 5 numeros en Orden
Este método en Java imprime 5 números enteros que son pasados por parámetros y en orden. Se declara una variable "contador" para llevar un control de los números introducidos y una ArrayList para almacenarlos. Se usa Scanner para leer los números y un bucle while para pedir 5 números y almacenarlos en la ArrayList. Luego, se muestra un mensaje de confirmación y se imprimen los números almacenados en orden. El método también incluye una detención temporal de la ejecución.

### Metodo para imprimir 5 numeros en Orden Invertido.
Este método en Java llamado "OrdenInverso" que imprime 5 números enteros en orden inverso. La función utiliza una ArrayList para almacenar los números introducidos por el usuario, los cuales son leídos por un objeto Scanner. Un bucle "while" se utiliza para asegurarse de que se reciban solo 5 números. Después de recibir los 5 números, se muestra un mensaje en pantalla y se imprimen en orden inverso. La ejecución del método se detiene temporalmente antes de finalizar.

### Metodo para hacer la media de Positivos, la media de Negativos y contar los 0 introducidos
Este método lee 5 números enteros de la consola, conta los ceros introducidos, y calcula la media de los números positivos y negativos. Se usa un bucle while para leer 5 números, y bucles for para contar ceros y calcular las medias. Finalmente, se imprimen los resultados en la consola.

### Metodo para contar los caracteres de una frase
Este método cuenta el número de caracteres en un texto dado por el usuario. Se usa un objeto de la clase Scanner para leer la entrada, una variable "contador" para contar los caracteres (sin espacios), un bucle "for" para recorrer cada carácter en el texto, y el método "charAt" para verificar si es un espacio. Se imprime la cantidad de caracteres y se espera medio segundo antes de continuar.

### Metodo para invertir un texto 
Este método invierte un texto proporcionado por el usuario. Utiliza Scanner para leer el texto y guardarlo en una variable. Luego, crea un objeto StringBuilder y usa un bucle "for" para recorrer el texto al revés, agregando cada carácter al objeto StringBuilder. Finalmente, imprime el texto invertido y espera 1 segundo antes de continuar.

### Metodo para eliminar espacios
Este método elimina los espacios en blanco de un texto proporcionado por el usuario. Se lee la entrada del usuario a través de un objeto Scanner y se guarda en una variable "str". Se usa un objeto StringBuilder para construir el texto sin espacios en blanco, se verifica cada carácter de "str" con una condicional y si no es un espacio en blanco, se añade al objeto StringBuilder. Finalmente, se imprime el texto sin espacios en blanco en la consola y se usa el método "sleep" para esperar un segundo antes de continuar con el resto del programa.

### Metodo para concatenar 2 cadenas pasadas por parametros y unirlas en 1 sola
Este método concatena dos frases proporcionadas por el usuario en una sola. Se usa un objeto de la clase Scanner para leer la entrada del usuario, y se guardan las frases en variables "str1" y "str2". Un objeto de la clase StringBuilder se utiliza para construir la nueva frase a partir de las frases almacenadas. Se imprime la nueva frase 
en la consola y se espera un segundo antes de continuar con el resto del programa.

### Metodo para substituir las vocales de una cadena
El método "SubstituirVocales" cambia las vocales de una frase proporcionada por el usuario por una vocal específica proporcionada por el usuario. Para ello, se usa un objeto de la clase Scanner para leer la frase y la vocal del usuario, se convierte la vocal a minúsculas y se comprueba si es una vocal. Luego, se recorre la frase carácter a carácter y se sustituyen las vocales con la vocal proporcionada. Finalmente, se muestra la frase con las vocales cambiadas en la consola.

### Metodo para convertir texto en ASCII.
Este método utiliza la clase Scanner de Java para leer una línea de texto escrita por el usuario. Luego, usa un bucle for para recorrer cada carácter en la cadena y convertirlo en su valor ASCII. Se utiliza el método charAt (i) para obtener el carácter en la posición i y el casting (int) para convertirlo en un valor entero. Finalmente, se utiliza la clase StringBuilder para construir una nueva cadena con los valores ASCII separados por un espacio. Finalmente, se muestran en consola la frase original y la nueva frase con los valores ASCII. El método también contiene una llamada a Thread.sleep (1000), lo que hace que el programa se detenga por 1000 milisegundos antes de imprimir en consola.

## Ejecución
Para ejecutar el programa, simplemente compile y ejecute la clase Main.