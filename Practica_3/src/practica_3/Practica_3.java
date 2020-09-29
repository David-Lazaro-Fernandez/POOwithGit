/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_3;
import java.util.Scanner;
/**
 *
 * @author David Lazaro
 */
public class Practica_3 {
  
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        final Dispositivo_Electronico dp = new Dispositivo_Electronico();
        final Television tv = new Television();
        int op,op2=0,canal,nivel;//Declaracion de las variables que utilizaremos para controlar el menú de opciones 
                               //Y las variables canal y nivel que seran las que modificaran el canal y el nivel los cuales
                               //El usuario desee cambiar
        String marca, modelo, color; //Propiedades de la television
        //Ingresamos las propiedades de la television
        System.out.print("Ingrese la marca de la tv: ");
        marca = input.nextLine();
        System.out.print("\nIngrese el modelo de la tv: ");
        modelo = input.nextLine();
        System.out.print("\nIngrese el color de la tv: ");
        color = input.nextLine();
        
      do{
          do{
              //Mostramos el menu de opciones y le pedimos al usuario que eliga una opcion
             System.out.print("Ingrese una de las siguientes opciones:\n\n 1.-Encender Dispositivo\n\n"); 
             System.out.print("2.-Apagar Dispositivo\n\n 3.-Cambiar de canal\n\n");
             System.out.print(" 4.- Modificar el volumen \n\n 5.- Mostrar los datos de la tv"); 
             op = input.nextInt(); 
        }while(op!=1 && op!=2 && op!=3 && op!=4 && op!=5);//Si la opcion no existe, el menu se seguira mostrando
          
        switch(op){//Vemos cada uno de los casos
            case 1: dp.Encender();
                    break;        //En caso de que el usuario eliga la opcion 1 la tv se Encendera
            case 2: dp.Apagar(); //En caso de que el usuario eliga la opcion 1 la tv se apagara
                    break;
            case 3: System.out.print("Ingrese el canal al cual desee cambiar: ");//Si el usuario elige la opcion numero
                    canal = input.nextInt();             //3, le pediremos que inserte el canal al cual desea cambiar
                    tv.Cambiar_canal(canal);            //Y mandamos a llamar a la funcion Cambiar_canal();
                    break;
            case 4: System.out.print("Ingrese el volumen al cual desea que la tv este:");//Si el usuario elige la 
                    nivel = input.nextInt();  //Opcion 4, le pediremos que inserte el nivel al desee
                    tv.Volumen(nivel);        //que se cambie el volumen de la television
                    break;
            case  5: tv.mconfig(marca,modelo,color); //Si el usuario elige la opcion 5, se mandara a llamar la
                    break;                           //funcion mconfig
        }           
        
        if(op!=2){  //Si la television no esta apagada, preguntaremos al usuario si desea realizar otra accion
        System.out.print("\n\n ¿Desea realizar otra accion? [1.- SI / 2.- NO]");
        op2 = input.nextInt();
        }
        else
            break;// Si la television esta apagada, entonces el programa termina
            
      }while(op2!=2);// Mientras el usuario no desee no seguir realizando acciones, el menu se volvera a mostrar. 
    }
    
}
