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
public class Television extends Dispositivos_Electronicos implements Componentes_Electronicos{
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
    
    public String Config_Menu(){
        return "Menu Config";
    }
}
