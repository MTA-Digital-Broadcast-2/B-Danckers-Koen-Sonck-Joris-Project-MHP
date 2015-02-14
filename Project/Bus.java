package hellotvxlet;

import org.havi.ui.*;
import org.dvb.ui.*;
import java.awt.*;


public class Bus extends HComponent{
    
    public Bus(){
        this.setBounds(0, 0, 100, 100);
        
    }
    
    public void paint(Graphics g){
        g.setColor(new DVBColor(200,200,200,200));
        g.fillRect(0, 0, 100, 50);

    }
    
}
