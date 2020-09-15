/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2;
import java.util.Scanner;
/**
 *
 * @author David Lazaro
 */
public class Practica_2 {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros a operar:"); 
        a = input.nextInt();
        b = input.nextInt();
        Calculadora cs = new Calculadora(a,b); 
        
    }
    
}
