
package cadenas;

import java.util.Scanner;

public class Cadenas {
static Scanner leer = new Scanner (System.in);
static String nombre1;
static int opcion;
    public static void main(String[] args) {
        
        char resp='s';
        while (resp=='s' || resp=='S'){
            menu();
          
            switch (opcion){
                case 1:
                    comparacion();
                break; 
                
                case 2:
                  letras();
                break;
                
                case 3:
                    reves();
                break;
                
                case 4:
                    dos_en_dos();
                break;
                
                case 5:
                    arbol();
                break;
                
                case 6:
                    suma();
                break;
                
                case 7:
                    ascii();
                break;
                
                case 8:
                    digitos();
                break;
                
                case 9:
                    formula();
                break;
                
                default: System.out.println("Saliendo...");
                
            }//fin switch
            
            System.out.print("Continua con el programa? [s/n]: ");
            resp = leer.next().charAt(0);
        }//fin while respuesta    
     
    }//fin del main
    
    public static void comparacion(){
        String nombre2;
            System.out.print("Ingrese cadena 1: ");
            nombre1 = leer.next();
            System.out.print("Ingrese cadena 2: ");
            nombre2 = leer.next();
            if (nombre1.equals(nombre2)){
                System.out.println("Iguales");
            }else{ 
                System.out.println("Diferentes");
            }
    }//fin static comparacion
    
    public static void letras(){
          System.out.print("Ingrese cadena: ");
            nombre1 = leer.next();
            String palabra;
            palabra = nombre1.toLowerCase();
            int vocales=0;
            int cons=0;
            for (int i=0; i<palabra.length(); i++){
                 char x = palabra.charAt(i);
                 System.out.println(x+" Posicion: "+i);
                 switch (x){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u': 
                        vocales++;
                    break;
                    default: cons++;
                }//fin del switch interno
            }//fin del for
            System.out.println("En la palabra "+nombre1+" hay "+vocales+" vocales y "+cons+" consonantes.");
    }//fin letras
    
    public static void reves(){
        System.out.print("Ingrese cadena: ");
            nombre1 = leer.next();
            String invertida = "";
            String nombre4=nombre1.toLowerCase();
            for (int j = nombre4.length()-1; j>=0; j--){
                invertida = invertida + nombre4.charAt(j);
            }//fin del for
            System.out.println(invertida);
    }//fin reves
    
    public static void dos_en_dos(){
        System.out.print("Ingrese cadena: ");
            nombre1 = leer.next();
            int letra1=0;
            int letra2=2;
            nombre1 = nombre1.toLowerCase();
            for (int c=0; c<nombre1.length(); c++){
                if (letra2 <= nombre1.length()){
                    System.out.println(nombre1.substring(letra1, letra2));
                    letra1 += 2;
                    letra2 += 2;
                }//fin if
            }//fin for 
            System.out.println();
    }// fin dos en dos 
    
    public static void arbol(){
        System.out.print("Ingrese cadena: ");
        nombre1 = leer.next();
        System.out.println();
        String nombre6=nombre1.toLowerCase();
        for (int i=0; i<nombre6.length(); i++){
            for (int x=0; x<=i; x++){
                char y = nombre6.charAt(x);
                System.out.print(y);
            }//fin for letras
            System.out.println();
        }//fin for externo
        System.out.println();    
    }//fin arbol
    
    public static void suma(){
        System.out.print("Ingrese cadena: ");
        nombre1 = leer.next();
        String digitos="";
        int num;
        int suma=0;
        String caso6=nombre1.toLowerCase();
        for (int x=0; x<caso6.length(); x++){
            if (Character.isDigit(caso6.charAt(x))){
                digitos += caso6.charAt(x);
            }//fin if digitos
        }//fin for externo
        System.out.println("Los digitos son: "+digitos);
        num = Integer.parseInt(digitos);
        while (num !=0){
            suma += (num%10);
            num = num/10;
        }//fin while suma
        System.out.println("La suma de los digitos es: "+suma);
        System.out.println();    
    }//fin suma
    
    public static void ascii(){
        System.out.print("Ingrese cadena: ");
        nombre1 = leer.next();
        for (int c=0; c<nombre1.length();c++){
            int cod_ascii = (int) nombre1.charAt(c);
            System.out.print(cod_ascii+"  ");
        }//fin del for
        System.out.println();
    }//fin ascii
    
    public static void digitos(){
        System.out.print("Ingrese cadena: ");
        nombre1 = leer.next();
        String numeros="", letras="";
        String caso8=nombre1.toLowerCase();
        for (int j=0; j<caso8.length(); j++){
            if (Character.isDigit(caso8.charAt(j))){
                numeros += caso8.charAt(j);
            }else {
                letras += caso8.charAt(j);
            }
        }//fin for externo
        System.out.println(numeros+letras);
    }//fin digitos
    
    public static void formula(){
        int x;
        int b;
        int n1;
        int n2;
        int total = 0;
        System.out.print("Ingrese la formula(por ejemplo 2x+5b): ");
        nombre1 = leer.next();
        System.out.print("Ingrese el valor de x: ");
        x = leer.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = leer.nextInt();
        if(nombre1.length()<6){
            String num1="", num2="";
            num1 = num1 + nombre1.charAt(0);
            num2 = num2 + nombre1.charAt(3);
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
            for (int k=0; k<nombre1.length(); k++){
                if (nombre1.charAt(k)=='+'){
                    total = (n1*x) + (n2*b);
                }else if (nombre1.charAt(k)=='-'){
                    total = (n1*x) - (n2*b);
                }//fin decision anidada      
            }//fin del for
            System.out.println("El resultado de la ecuacion es: "+total);
            System.out.println(); 
        }else {
            System.out.println("La fomula esta mal escrita");
        }
    }//fin formula
    
    public static void menu(){
      System.out.println("****MENU****");
      System.out.println("1. Comparar cadenas");
      System.out.println("2. Posicion Letras");
      System.out.println("3. Al Reves");
      System.out.println("4. Dos en Dos");
      System.out.println("5. Arbol");
      System.out.println("6. Suma de Digitos");
      System.out.println("7. Codigo Ascii");
      System.out.println("8. Digitos y Letras");
      System.out.println("9. Formula");
      System.out.println("10. Salir");
      System.out.println();
      System.out.print("Ingrese la opcion: ");
      opcion = leer.nextInt();
      System.out.println();
    }//fin menu
    
}//fin class
