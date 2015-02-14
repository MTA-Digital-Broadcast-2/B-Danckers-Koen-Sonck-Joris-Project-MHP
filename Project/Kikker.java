package hellotvxlet;

import org.havi.ui.*;
import org.dvb.ui.*;
import java.awt.*;


public class Kikker extends HComponent{
    
    public Kikker(){
        this.setBounds(0, 0, 100, 100);
        
    }
    
    public void paint(Graphics g){
        g.setColor(new DVBColor(100,200,100,179));
        g.fillRect(0, 0, 25, 50);

    }
    
}
