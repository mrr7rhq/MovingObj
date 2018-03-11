/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingobj;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author bellia_2
 */
public class UserInterface implements Runnable {
    
    private JFrame frame;
    private Avatar avatar;
    
    public UserInterface(Avatar avatar){
        this.avatar=avatar;
        
    }
    public void createComponents(Container container){
        DrawingBoard drawingBoard = new DrawingBoard(avatar);
        container.add(drawingBoard);
    }

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200, 100));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
}
