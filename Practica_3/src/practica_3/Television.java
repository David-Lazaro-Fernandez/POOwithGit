/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_3;

/**
 *
 * @author David Lazaro
 */
public class Television extends Dispositivo_Electronico implements Componentes_Electronicos{ //Heredamos las funciones
    //de la interfaz Componentes_Electronicos, y en esta clase las sobre escribimos.
    //Inicio de encapsulamiento de las variables privadas de la clase
    private String Color;
    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
    //Fin del encapsulamiento
   
    @Override //Sobre escribimos la funcion
    public String Cambiar_canal(int canal){
        System.out.println("Cambiando canal al canal numero: " + canal);//Mostramos en pantalla el canal al cual 
        return "Listo el canal ha sido cambiado!";                      //Al cual estamos cambiando
    }
    @Override //Sobre escribimos la funcion
    public String Volumen(int nivel){
        System.out.println("Volumen establecido a: " + nivel + "dB"); //Mostramos el volumen que se establecio en la tv
        return "Listo su volumen ha sido cambidado!";
    }
    
    public void mconfig(String marca, String modelo, String color){
        System.out.print("\n\t\t Datos de la televison \n\n Marca: "+ marca); //Mostramos en pantalla 
        System.out.print("\n\n Modelo: " + modelo);                           //Cada uno de las propiedades  
        System.out.print("\n\n Color: " + color);                             //De la television  
    }
}
