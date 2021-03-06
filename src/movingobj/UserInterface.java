/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingobj;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;

/**
 *
 * @author bellia_2
 */
public class UserInterface implements Runnable {
    
    private JFrame frame;
    private Avatar avatar;
    private Timer timer;
    
    public UserInterface(Avatar avatar){
        this.avatar=avatar;
        
    }
    public void createComponents(Container container){
        DrawingBoard drawingBoard = new DrawingBoard(avatar);
        container.add(drawingBoard);
        KeyboardListener keyListener= new KeyboardListener(avatar,drawingBoard);
        frame.addKeyListener(keyListener);
        AutoDropListener autodrop= new AutoDropListener(avatar,drawingBoard);
        timer= new Timer(500,autodrop);
        timer.start();
    }

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(800, 800));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
}
