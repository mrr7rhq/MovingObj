/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingobj;
import java.awt.Graphics;

/**
 *
 * @author bellia_2
 */
public class Avatar {
    
    private int x;
    private int y;
    
    public Avatar(int x, int y){
        this.x=x;
        this.y=y;
        
    }
    
    public int getX(){
        return x;
        
    }
    
    public int getY(){
        return y;
    }
    
    public void move(int x, int y){
        this.x+=x;
        this.y+=y;
    }
    
    public void draw(Graphics graphics){
        graphics.fillOval(x, y, 10, 10);
    }
}
