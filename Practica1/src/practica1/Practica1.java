package practica1;
import java.util.Scanner; // importamos la libreria scanner para poder leer datos 

/**
 *
 * @author David Lazaro
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 0; // Variable que valida el fin del ciclo
        Scanner input = new Scanner(System.in); //Inicializamos el tipo de dato input
        do{ 
        System.out.println("Ingresa la operacion que desees realizar");
        System.out.printf(" 1.-Suma \n 2.- Resta \n 3.- Multiplicacion \n 4.- Division\n\n"); 
        int n = input.nextInt(); // Lectura de la operacion a realizar
        int a,b,c; //Variables de entrada de tipo entero
        float d,e,f; //Variables de entrada de tipo float
        switch(n){ //Comparacion de operacion que el usuario desee realizar
            case 1:
                    System.out.println("Ingrese el valor del primer numero a sumar: ");
                    a= input.nextInt(); //Lectura del primer dato
                    System.out.println("Ingrese el valor del segundo numero a sumar: ");
                    b= input.nextInt(); //Lectura del segundo dato
                    c= a+b; // Suma de los 2 datos
                    System.out.println("La suma total de los 2 numeros es: " + c); //Muestra del resultado en pantalla
                    break;
            case 2:
                    System.out.println("Ingrese el valor del primer numero a restar: ");
                    a= input.nextInt();//Lectura del primer dato
                    System.out.println("Ingrese el valor del segundo numero a restar: ");
                    b= input.nextInt();//Lectura del segundo dato
                    c= a-b;// Resta de los 2 datos
                    System.out.println("La resta total de los 2 numeros es: " + c);//Muestra del resultado en pantalla
                    break;
            case 3:
                    System.out.println("Ingrese el valor del primer numero a multiplicar: ");
                    a= input.nextInt();//Lectura del primer dato
                    System.out.println("Ingrese el valor del segundo numero a multiplicar: ");
                    b= input.nextInt();//Lectura del segundo dato
                    c= a*b;// Multiplicacion de los datos
                    System.out.println("La multiplicacion total de los 2 numeros es: " + c);//Resultado en pantalla
                    break;
            case 4:
                    System.out.println("Ingrese el valor del primer numero a dividir: ");
                    d= input.nextFloat();//Lectura del primer dato
                    System.out.println("Ingrese el valor del segundo numero a dividir: ");
                    e= input.nextFloat();//Lectura del segundo dato
                    f= d/e;//Division de los datos
                    System.out.println("La multiplicacion total de los 2 numeros es: " + f);//Resultados en pantalla
                    break;        
            }        
        System.out.println("¿Desea seguir realizando operaciones? [1.-Si | 2.- No]");
        number = input.nextInt(); //Lectura de la variable de control de ciclo
        }while(number != 2); //Fin del ciclo
        //Fin del programa
    }
}
                
    

