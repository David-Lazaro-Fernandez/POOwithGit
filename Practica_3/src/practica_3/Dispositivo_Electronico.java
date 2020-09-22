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
public class Dispositivo_Electronico implements Componentes_Electronicos{

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    private String marca,modelo;;
     
    
    public void Encender(){
        System.out.println("Dispositivo Encendido");
    }
    
    @Override 
    public String Cambiar_Canal(){
        return "Canal cambiado";
    }
}
