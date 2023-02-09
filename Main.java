package Ejercicio1Programación.Ejerecicio1Programacion;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Thread;
import java.net.PortUnreachableException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner= new Scanner(System.in);// Inicio del scanner
        int opcion= 0; // int para el funcionamiento del programa principal
        while (opcion !=10 ){
            
            // Impresion de todas las opciones
            System.out.println("1: Lee 5 numeros y se te pasaran tal cual los has introducido. ");
            System.out.println("2: Lee 5 numeros y se te pasaran en el orden invertido. ");
            System.out.println("3: Lee 5 numeros y se te calculara la media, la media de los negativos y te contara cuantos 0 se han introducido. ");
            System.out.println("4: Pasa un texto y se contaran la cantidad de caracteres. ");
            System.out.println("5: Pasa un texto y este se invertira. ");
            System.out.println("6: Pasa un texto y se eliminaran los espacios en blanco. ");
            System.out.println("7: Pasa dos frases y se uniran en una. ");
            System.out.println("8: . ");
            System.out.println("9: . ");
            System.out.println("10: Salir. ");

            System.out.print("Elige: ");
            opcion= scanner.nextInt();//Entrada de la opción
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
                
                break;
            case 9:
                
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
                
                System.out.println("Introduce 5 numeros, llevas "+contador);
                Integer numero= scanner.nextInt();
                
                // array en la posicion que tenga el contador se le introduce el valor que se ha pasado
                numeros.add(numero);
                contador++; //suma para aumentar el contador
                Thread.sleep(500);
                
            }
            
            // bucle para imprimir los numeros introducidos en orden
            System.out.println("Estos son los numero introducidos: ");
            for (int i= 0; i>=numeros.size(); i++){
                System.out.print(numeros.get(i)+" ");
            }
            System.out.println("");
        }
    
        //metodo para Imprimir de forma inversa 5 numeros enteros pasado por parametros
    public static void OrdenInverso() throws InterruptedException{
        Integer contador= 0; //variable para asegurarnos de un bucle con 5 numeros
        ArrayList<Integer> numeros= new ArrayList<>();//Declaracion de la array
        Scanner scanner = new Scanner(System.in);

        while(contador<5){
            
            System.out.println("Introduce 5 numeros, llevas "+contador);
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
            
            System.out.println("Introduce 5 numeros, llevas "+contador);
            Integer numero= scanner.nextInt();
            
            // array en la posicion que tenga el contador se le introduce el valor que se ha pasado
            numeros.add(numero);
            contador++; //suma para aumentar el contador
            Thread.sleep(500);
        }    

        //Calcular la media positiva
        int suma= 0;
        for (int i =0; i<numeros.size(); i++){ //bucle para sumar los enteros de la lista
            suma += numeros.get(i);
        }
        int media = suma  / numeros.size(); //tomamos la suma de los numeros y lo dividimos por el tamaño de la array para conseguir la media
        System.out.println("La media es: "+media);
        
        //Calcular la media de los negativos 







        //Contar 0 introducidos
        int ceros= 0; //contador de 0
        for (int i =0; i<numeros.size(); i++){
            if (numeros.get(i)==0){//Aqui si el algun entero es 0 se sumara al contador
                ceros++; 
            }
        }
        System.out.println("Hay un total de "+ceros);
        
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
    
}
