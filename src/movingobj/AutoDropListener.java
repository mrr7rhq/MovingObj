/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingobj;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author feihua
 */
public class AutoDropListener implements ActionListener{
    
    private Avatar avatar;
    private Component component;
    
    public AutoDropListener(Avatar avatar, Component component){
        this.avatar= avatar;
        this.component=component;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        avatar.move(0, 5);
        component.repaint();
        

    }
    
}
