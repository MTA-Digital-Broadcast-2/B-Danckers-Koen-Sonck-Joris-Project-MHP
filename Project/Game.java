/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

/**
 *
 * @author student
 */
public class Game 
{
    public Kikker mKikker;
    public Bus mBus;
    public boolean mGameOver = false;
    
    public void CreateObjects()
    {
        mBus = new Bus(0, 450, 100, 100);
        mKikker = new Kikker(300, 450, 100, 100);
    }
    
    public void CheckHit()
    {
        //ARRAY VAN BUSSEN (LATER)
//        for(int i = 0; i < mBussen.length; i++)
//        {
//            if(mBussen[i].getLocation().x+100 == mKikker.getLocation().x)
//            {
//                mGameOver = true;
//                System.out.println("GameOver");        
//            }
//        }        
        
        if(mBus.getLocation().x + 100 == mKikker.getLocation().x)
         {
                mGameOver = true;
                System.out.println("GameOver");        
          }
    }
    public void MoveBusses()
    {
        //ARRAY VAN BUSSEN (LATER)
//        for(int i = 0; i < mBussen.length; i++)
//        {
//             if(mBussen[i] != null)
//             {
//                mBussen[i].mXPos++;
//             }            
//        }   
        mBus.MoveBus();
    }
    public Bus DisplayBusses() //geeft de bussen terug om te kunnen tekenen
    {
        return mBus;
    }
    public Kikker DisplayKikker() //geeft de kikker terug om te kunnen tekenen
    {
        return mKikker;
    }


}




