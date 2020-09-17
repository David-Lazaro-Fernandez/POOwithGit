package practica_2;
/**
 *
 * @author David Lazaro
 */
public class Calculadora {
    /**
     *  
        c->Variable que almacena el resultado de las operaciones
        d->Variable que almacena la division flotante de a2 / b2
        a2-> Variable de tipo float que almacena el valor de a 
        b2-> Variable de tipo float que almacena el valor de b
     */
    int c;
    float d,a2,b2;
    public Calculadora(int a,int b){
        
        c=a+b; //Suma de a y b
        System.out.println("Suma:"+c); //Impresion en pantalla del valor de c
        c=a-b; //Resta de a y b
        System.out.println("Resta:"+c);//Impresion en pantalla del valor de c
        c=a*b; //Multiplicacion de a y b
        System.out.println("Multiplicacion:"+c);//Impresion en pantalla del valor de c
        a2=a; //a2 almacena el valor de a
        b2=b; //b2 almacena el valor de b
        d=a2/b2; //Division con decimal de a2 y b2
        System.out.println("Division:"+d); //Impresion en pantalla del valor de d
    }
}


