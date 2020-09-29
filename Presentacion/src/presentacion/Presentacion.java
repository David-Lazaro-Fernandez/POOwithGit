package presentacion;
import java.util.Scanner;
/**
 *
 * @author David Lazaro
 */
public class Presentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int op=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("\n\n\n\t\t Ingresa el ejemplo que deseas enseñarle a la clase\n\n");
            System.out.print("\t 1.- Contar del 1 al 50 'while'\n\n");
            System.out.print("\t 2.- Mostrar la diferencia en la posicion del incrementador\n\n");
            System.out.print("\t 3.- Calcular los primeros 10 multiplos de 6 'for'\n\n");
            System.out.print("\t 4.- Mostrar los multiplos de 5 hasta que el usuario desee finalizar 'do while'\n\n");
            System.out.print("\t 5.- Mostrar los numeros pares entre 1 y 20 'continue'\n\n");
            System.out.print("\t 6.- Mostrar como funciona la funcion 'break'\n\n");
            System.out.print("\t 7.- Mostrar como funcionan los operadores logicos\n\n");
            System.out.print("\t 8.- Salir\n\n");
            op = input.nextInt();
            
            switch(op){
                case 1: 
                        cien.contar();
                        break;
                case 2: 
                        cien.diferencia();
                        break;        
                case 3: cien.funcionfor();
                        break; 
                case 4: cien.funciondowhile();
                        break;              
                case 5: cien.funcioncontinue();
                        break;
                case 6: cien.funcionBreak();
                        break;    
                case 7: cien.seguridad();
                        break;
                case 8: 
                        break;                   

            }
        }while(op!=8);
        input.close();
        System.out.print("\n\n\n\t\t\t\t¡Gracias por su atencion!\n\n ¡Asistan a nuestro WorkShop este martes a las 16:00H para conocer Github y ganarse una mochila virtual con muchas licensias! \n (El valor del contenido dentro de la mochila ronda entre los $200,000)\n\n\n\n");
        System.out.print("Para mayor informacion del evento, accede al link que aparecera en el chat, crea tu cuenta, confirmala y listo.");
    }
    
    
}
