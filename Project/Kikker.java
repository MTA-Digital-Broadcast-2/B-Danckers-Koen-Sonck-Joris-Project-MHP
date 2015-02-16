package hellotvxlet;

import org.havi.ui.*;
import org.dvb.ui.*;
import java.awt.*;


public class Kikker extends HComponent{
    
    public int mXPos, mYPos, mWidth, mHeight;
 
    public Kikker(int xpos, int ypos, int width, int height)
    {
        mXPos = xpos;
        mYPos = ypos;
        mWidth= width;
        mHeight = height;
        
        this.setBounds(mXPos, mYPos, mWidth, mHeight);
        
    }
    
    public void paint(Graphics g){
        g.setColor(new DVBColor(100,200,100,179));
        g.fillRect(0, 0, 25, 50);

    }
    
}
