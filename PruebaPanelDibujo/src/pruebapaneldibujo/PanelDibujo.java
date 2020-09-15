/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapaneldibujo;

import java.awt.Graphics;
import javax.swing.JPanel;
public class PanelDibujo extends JPanel{
    // dibuja una x desde las esquinas del panel
    public void paintComponent( Graphics g )
    {
    // llama a paintComponent para asegurar que el panel se muestre correctamente
    super.paintComponent( g );
   
    int anchura = getWidth(); // anchura total
    int altura = getHeight(); // altura total
   
    // dibuja una línea de la esquina superior izquierda a la esquina inferior derecha
    g.drawLine( 0, 0, anchura, altura );
   
    // dibuja una línea de la esquina inferior izquierda a la esquina superior derecha
    g.drawLine( 0, altura, anchura, 0 );
    } // fin del método paintComponent
}