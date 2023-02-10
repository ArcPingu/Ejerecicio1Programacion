package Ejercicio1Programación.Ejerecicio1Programacion;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Thread;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner= new Scanner(System.in);// Inicio del scanner
        int opcion= 0; // int para el funcionamiento del programa principal
        while (opcion !=10 ){
            
            // Impresion de todas las opciones
            System.out.println("");
            System.out.println("1: Lee 5 numeros y se te pasaran tal cual los has introducido. ");
            System.out.println("2: Lee 5 numeros y se te pasaran en el orden invertido. ");
            System.out.println("3: Lee 5 numeros y se te calculara la media, la media de los negativos y te contara cuantos 0 se han introducido. ");
            System.out.println("4: Pasa un texto y se contaran la cantidad de caracteres. ");
            System.out.println("5: Pasa un texto y este texto se invertira. ");
            System.out.println("6: Pasa un texto y se eliminaran los espacios en blanco. ");
            System.out.println("7: Pasa dos frases y se uniran en una unica frase. ");
            System.out.println("8: Pasa una frase y una vocal. Se substituiran todas las vocales por la indicada. ");
            System.out.println("9: Pasa una frase y se te devolvera el codigo ASCII de cada uno de los caracteres de la frase. ");
            System.out.println("10: Salir. ");
            System.out.println("");

            System.out.print("Elige: ");
            opcion= scanner.nextInt();//Entrada de la opción
            System.out.println("");
            Thread.sleep(1000);

            //creacion de el switch case
            switch (opcion){
            case 1:
                mostrarEnOrden();
                Thread.sleep(1000);
                break;
            case 2:
                OrdenInverso();
                Thread.sleep(1000);
                break; 
            case 3:
                MediaYCeros();
                Thread.sleep(1000);
                break;
            case 4: 
                ContarCaracteres();
                Thread.sleep(1000);
                break;
            case 5:
                InvertirTexto();
                Thread.sleep(1000);
                break;
            case 6:
                EliminarEspaciosBlancos();
                Thread.sleep(1000);
                break;
            case 7:
                ConcatenarCadenas();
                Thread.sleep(1000);
                break;
            case 8:
                SubstituirVocales();
                Thread.sleep(1000);
                break;
            case 9:
                PasarEnAsci();
                Thread.sleep(1000);
                break;
            case 10:
                //Opcion añadida para salir del programa
                System.out.println("Has salido del programa.");
                scanner.close();
                break;
            default :
                //Opcion que saltara si pones cualquier cosa que no sea un valor del case
                System.out.println("Opcion Invalida");
                break;
            }
        
        }
        scanner.close();
    }
        
    //metodo para Imprimir de forma ordeada 5 numeros enteros pasado por parametros
    public static void mostrarEnOrden() throws InterruptedException {
            Integer contador= 0; //variable para asegurarnos de un bucle con 5 numeros
            ArrayList<Integer> numeros= new ArrayList<>();//Declaracion de la array
            Scanner scanner = new Scanner(System.in);

            while(contador<5){
                
                System.out.println("Introduce 5 numeros, numeris: "+(contador+1));
                Integer numero= scanner.nextInt();
                
                // array en la posicion que tenga el contador se le introduce el valor que se ha pasado
                numeros.add(numero);
                contador++; //suma para aumentar el contador
                Thread.sleep(500);
                
            }
            
            // bucle para imprimir los numeros introducidos en orden
            System.out.println("Estos son los numero introducidos: ");
            for (int i= 0; i<numeros.size(); i++){
                System.out.print(numeros.get(i)+" ");
            }
        System.out.println("");
        Thread.sleep(1000);
    }
    
    //metodo para Imprimir de forma inversa 5 numeros enteros pasado por parametros
    public static void OrdenInverso() throws InterruptedException{
        Integer contador= 0; //variable para asegurarnos de un bucle con 5 numeros
        ArrayList<Integer> numeros= new ArrayList<>();//Declaracion de la array
        Scanner scanner = new Scanner(System.in);

        while(contador<5){
            
            System.out.println("Introduce 5 numeros, numero: "+(contador+1));
            Integer numero= scanner.nextInt();
            
            // array en la posicion que tenga el contador se le introduce el valor que se ha pasado
            numeros.add(numero);
            contador++; //suma para aumentar el contador
            Thread.sleep(500);
            
        }        
        // bucle para imprimir los numeros introducidos en orden invertido
        System.out.println("Estos son los numero introducidos: ");
        for (int i= numeros.size()-1; i>=0; i--){
            System.out.print(numeros.get(i)+" ");
        }
        System.out.println("");
    
    }

    // metodo para hacer media y contar los 0 introducidos
    public static void MediaYCeros() throws InterruptedException{
        Integer contador= 0; //variable para asegurarnos de un bucle con 5 numeros
        ArrayList<Integer> numeros= new ArrayList<>();//Declaracion de la array
        Scanner scanner = new Scanner(System.in);

        while(contador<5){
            
            System.out.println("Introduce 5 numeros, numero: "+(contador+1));
            Integer numero= scanner.nextInt();
            
            // array en la posicion que tenga el contador se le introduce el valor que se ha pasado
            numeros.add(numero);
            contador++; //suma para aumentar el contador
            Thread.sleep(500);
        }    
        //Contar 0 introducidos
        int ceros= 0; //contador de 0
        for (int i =0; i<numeros.size(); i++){
            if (numeros.get(i)== 0){//Aqui si el algun entero es 0 se sumara al contador
                ceros++; 
            }
        }
        System.out.println("La cantidad de ceros es de "+ceros);

        //Calcular la media positiva
        int sumaPositivos= 0;
        int positivos= 0;

        for (int i =0; i<numeros.size(); i++){
            if (numeros.get(i)>=0){
                sumaPositivos += numeros.get(i);
                positivos++;
            }
        }
        int mediaPositivos = 0;
        if (positivos > 0) {
            mediaPositivos = sumaPositivos / positivos; 
        }
        System.out.println("La media de los positivos es: "+mediaPositivos);

        //Calcular la media de los negativos
        int sumaNegativos= 0;
        int negativos= 0;
        for (int i =0; i<numeros.size(); i++){
            if (numeros.get(i)<0){
                sumaNegativos += numeros.get(i);
                negativos++;
            }
        }
        int mediaNegativos = 0;
        if (negativos > 0) {
            mediaNegativos = sumaNegativos / negativos;
        }
        System.out.println("La media de los negativos es: "+mediaNegativos);
    }

    //Metodo para contar caracteres de un texto
    public static void ContarCaracteres() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        
        int contador=0;
        System.out.println("Introduce el texto que desees, te devolvermos el numero de caractes de el mismo: ");
        String str= scanner.nextLine();

        for(int i=0; i< str.length();i++){
            if(str.charAt(i) != ' '){//charat nos permite comprobar un caracter en una string
                contador++;//si el caracter no es espacio se sumara 1 al contador
            }
        }
        System.out.println("Tu texto tiene una cantidad de "+contador+" caracteres");
        Thread.sleep(500);
    }

    //Metodo para invertir un texto 
    public static void InvertirTexto()throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el texto que desees, te devolvermos el texto invertido: ");
        String str= scanner.nextLine();
        StringBuilder sb = new StringBuilder();// permite construir objetos de tipo String 

        for (int i=str.length() -1 ; i>=0; i--){//bucle para que empieze el string hacia atras
            sb.append(str.charAt(i));//esto añadira el caracter al stringBuilder
        }
        System.out.println("El texto es: "+sb.toString());

        Thread.sleep(1000);
    }
    
    //Metodo para eliminar espacios en blanco
    public static void EliminarEspaciosBlancos()throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el texto que desees, te devolvermos el texto sin espacios en blanco: ");
        String str= scanner.nextLine();
        StringBuilder sb = new StringBuilder();// permite construir objetos de tipo String 


        for(int i=0; i< str.length();i++){
            if(str.charAt(i) != ' '){// mira que el caracter no sea un espacio en blanco y si es asi
                sb.append(str.charAt(i)); //Añade el caracter al strinbuilder creado
            }
        }
        System.out.println("La frase es: "+sb);
        Thread.sleep(1000);
    }

    //Metodo para concatenar 2 cadenas pasadas por parametros
    public static void ConcatenarCadenas()throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Introduce dos cadenas, después te las devolveremos en una cadena: ");
        Thread.sleep(500);

        System.out.println("Escribe la primera cadena: ");
        String str1= scanner.nextLine();
        Thread.sleep(200);
        sb.append(str1);
        sb.append(" ");
        System.out.println("Escribe la segunda cadena: ");
        String str2= scanner.nextLine();
        sb.append(str2);

        System.out.println("La nueva frase es: "+sb);
        Thread.sleep(1000);
    }

    //Metodo para substituir las vocales de una cadena
    public static void SubstituirVocales() throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Introduce una frase, después una vocal y te cambiare las vocales de la frase por la introducida: ");
        Thread.sleep(500);
    
        System.out.println("Escribe la frase: ");
        String str1= scanner.nextLine();
        Thread.sleep(200);
    
        System.out.println("Escribe la vocal: ");
        String str2= scanner.nextLine();
        char replaceVowel = str2.toLowerCase().charAt(0);
    
        //comprueba si la letra introducida es una vocal
        if (replaceVowel == 'a' || replaceVowel == 'e' || replaceVowel == 'i' || replaceVowel == 'o' || replaceVowel == 'u') {
            // recorre el string caracter a caracter
            for (int i = 0; i < str1.length(); i++) {
                char currentChar = str1.charAt(i);
                //Comprueba si la vocal en la frase esta en miniscula y la cambia por la vocal en miniscula
                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                    sb.append(replaceVowel);
                } 
                //Comprueba si la vocal en la frase esta en mayuscula y la cambia por la vocal en mayuscula
                else if (currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                    sb.append(Character.toUpperCase(replaceVowel));
                } else {
                    sb.append(currentChar);
                }
            }
        }
        System.out.println("La nueva frase es: " + sb);
        Thread.sleep(1000);
    }
    
    //Metodo para Introducir un texto y devolverlo en su valor en el codigo Ascii
    public static void PasarEnAsci() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una frase y te devolvere el codigo ascii de cada caracter: ");
        String str = scanner.nextLine();
        StringBuilder asciiValues = new StringBuilder();

        //bucle para recorrer el string y cambiar la letra por su valor Ascii
        for (int i = 0; i < str.length(); i++) {
            int asciiValue = (int) str.charAt(i);
            asciiValues.append(asciiValue).append(" ");
        }

        Thread.sleep(1000);
        System.out.println("La frase era: "+str);
        System.out.println("La nueva frase es: "+asciiValues);
        Thread.sleep(1000);
    }
}
