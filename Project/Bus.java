package hellotvxlet;

import org.havi.ui.*;
import org.dvb.ui.*;
import java.awt.*;


public class Bus extends HComponent
{
    int mXPos, mYPos, mWidth, mHeight;
 
    public Bus(int xpos, int ypos, int width, int height)
    {
        mXPos = xpos;
        mYPos = ypos;
        mWidth= width;
        mHeight = height;
        
        this.setBounds(mXPos, mYPos, mWidth, mHeight);
        
    }
    
    public void paint(Graphics g)
    {
        g.setColor(new DVBColor(200,200,200,200));
        g.fillRect(0, 0, 100, 50);

    }
    public void MoveBus()
    {
        mXPos++;
    }
    public void DeleteBus(Bus b)
    {
        b = null;
    }
    public void DrawBus()
    {
        this.setLocation(mXPos, mYPos);
    }
  }
    

