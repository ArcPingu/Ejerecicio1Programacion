package Ejercicio1Programación;

import java.util.ArrayList;
import java.util.Scanner;

import java.lang.Thread;

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
            System.out.println("5: . ");
            System.out.println("6: . ");
            System.out.println("7: . ");
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
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 9:
                
                break;
            case 10:
                //Opcion añadida para salir del programa
                System.out.println("Has salido del programa.");
                break;
            default :
                System.out.println("Opcion Invalida");
                break;
            }
        
        }
        scanner.close();
    }
        
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
            for (int i= 0; i>=numeros.size(); i--){
                System.out.print(numeros.get(i)+" ");
            }
            System.out.println("");
            scanner.close();
        }
    
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
        scanner.close();
    
    }
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
        scanner.close();

        //Calcular la media positiva
        int suma= 0;
        for (int i =0; i<numeros.size(); i++){
            suma += numeros.get(i);
        }
        int media = suma  / numeros.size();
        System.out.println("La media es: "+media);
        
        //Contar 0 introducidos
        int ceros= 0;
        for (int i =0; i<numeros.size(); i++){
            if (numeros.get(i)==0){
                ceros++;
            }else if(i == numeros.size()){
                System.out.println("Ya se han contado todos los 0");
            }
        }
        System.out.println("Hay un total de "+ceros);
        
    }

    //Funcion para contar caracteres de un texto
    public static void ContarCaracteres() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        
        int contador=0;
        System.out.println("Introduce el texto que desees, te devolvermos el numero de caractes de el mismo: ");
        String str= scanner.nextLine();
        for(int i=0; i< str.length();i++){
            if(str.charAt(i) != ' '){
                contador++;
            }
        }
        System.out.println("Tu texto tiene una cantidad de "+contador+" caracteres");
        Thread.sleep(500);
        scanner.close();
    }
    
}
