/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.util.TimerTask;

public class MijnTimerTask extends TimerTask {
    public Game game = new Game();
    public void run()
    {
        System.out.println("Timer Tick");
        
        game.MoveBusses();
        game.mBus.DrawBus();
        
        
    }
}

