package presentacion;
import java.util.Scanner;
public class cien {
    
    public static void contar(){
        int contador=1, salto=1; 
        while(contador<101){
            System.out.print(contador + " ");
            contador++;
            if(salto == 10)
            {
                System.out.print("\n\n");
                salto=1;
            }
            else
                salto++;

        }
    }

    public static void diferencia(){
        int n1=10,n2=10;
        System.out.print("Numeros en su valor original\n " + n1 + "\n " + n2 + "\n\n");
        System.out.print("Numeros en despues del incremento\n " + n1++ + "\n " + ++n2 + "\n\n");
    }
    
    public static void funcionfor(){
        int multiplo=6, resultado=0;
        for(int i=1;i<=10;i++){
            resultado = multiplo * i;
            System.out.print("Elemento "+i+" de la tabla de multiplicar de "+multiplo+" es: "+resultado+"\n\n");
        }
    }

    public static void funciondowhile(){
        Scanner input = new Scanner(System.in);
        int opcion=0,cont=1;
        System.out.println("Mostrando los multiplos de 5 hasta que el usario desee parar\n\n");
        do{
            System.out.println("5 x "+cont+" es: "+cont*5);
            System.out.println("Si desea dejar de mostrar muliplos ingrese el numero '100'");
            opcion = input.nextInt();
            cont++;

        }while(opcion != 100);
        
    }

    public static void funcioncontinue(){
        for(int i=0;i<=20;i++){
            if(i%2==0)
                System.out.println(i);
            else
                continue;
        
        }
    }

    public static void funcionBreak(){
        for(int i=0;i<100;i++){
            System.out.println(i+" ");
            if(i== 30)
                break;
        }
    }

    public static void seguridad(){
        Scanner input = new Scanner(System.in);
        int op,op2,op3,op4;
        do{
            do{
                do{
                    do{
                        System.out.println("¿Desea salir de esta funcion? [1.-Si |||| 2.- No]");
                        op4 = input.nextInt();
                        if(op4 == 2)
                            System.out.println("¿Que tal ahora?");
                    }while(op4!=1);
                    System.out.println("¿Esta seguro? [1.-Si |||| 2.- No]");
                        op3 = input.nextInt();
                        if(op3 == 2)
                            System.out.println("¿Que tal ahora?");
                }while(op3!=1);     //Este condicional equivaldria a if(op3==1 && op4==1)
                System.out.println("¿Seguro seguro? [1.-Si |||| 2.- No]");
                        op2 = input.nextInt();
                        if(op2 == 2)
                            System.out.println("¿Que tal ahora?");
            }while(op2!=1); //Este condicional equivaldria a if(op3==1 && op4==1 && op2==1)   
            System.out.println("¿Seguro seguro al 1001%? [1.-Si |||| 2.- No, regresemos al inicio que tengo muchas dudas]");
                        op = input.nextInt();
        }while(op!=1);
        
    }
}
