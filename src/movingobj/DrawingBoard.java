/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingobj;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author bellia_2
 */
public class DrawingBoard extends JPanel{
    
    private Avatar avatar;
    
    public DrawingBoard(Avatar avatar){
        super.setBackground(Color.white);
        this.avatar=avatar;
    }
    
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        avatar.draw(graphics);
    }
}
