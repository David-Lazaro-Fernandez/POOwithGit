/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2;

/**
 *
 * @author David Lazaro
 */
public class Calculadora {
    int c;
    float d,a2,b2;
    public Calculadora(int a,int b){
        
        c=a+b;
        System.out.println("Suma:"+c);
        c=a-b;
        System.out.println("Resta:"+c);
        c=a*b;
        System.out.println("Multiplicacion:"+c);
        a2=a;
        b2=b;
        d=a2/b2;
        System.out.println("Division:"+d);
    }
}


