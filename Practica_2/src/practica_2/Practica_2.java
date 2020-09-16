/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2;
import java.util.Scanner; //Importamos la libreria Scanner 
/**
 *
 * @author David Lazaro
 */
public class Practica_2 {
    public static void main(String[] args) {
        int a,b;                                            //Declaracion de los 2 datos a ingresar
        Scanner input = new Scanner(System.in);             //Inicializacion de la variable tipo Scanner
        System.out.println("Ingrese 2 numeros a operar:");  
        a = input.nextInt();                                //Lectura del primer dato                                    
        b = input.nextInt();                                //Lectura del segundo dato
        Calculadora cs = new Calculadora(a,b);              //Llamado de la funcion calculadora
        
        
    }
    
}
