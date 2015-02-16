package hellotvxlet;

import javax.tv.xlet.*;
import org.havi.ui.*;
import org.dvb.ui.*;
import java.awt.event.*;
import org.havi.ui.event.*;
import java.util.Timer;

public class HelloTVXlet implements Xlet, HActionListener
{
    private XletContext actueleXletContext;
    private HScene scene;
    private boolean debug = true;
    
    private HStaticText tekstLabel, GameOverLabel;
    private MijnTimerTask objTimerTask; 

    
    public void actionPerformed(ActionEvent e){
     //System.out.println(e.getActionCommand());
    
    }
    
    public HelloTVXlet() {
      
    }

    public void initXlet(XletContext context) throws XletStateChangeException
    {
        
      if(debug) System.out.println("Xlet Initialiseren");
      this.actueleXletContext = context;
      
      
      HSceneTemplate sceneTemplate = new HSceneTemplate();
      
      sceneTemplate.setPreference(org.havi.ui.HSceneTemplate.SCENE_SCREEN_DIMENSION, 
              new HScreenDimension(1.0f, 1.0f), org.havi.ui.HSceneTemplate.REQUIRED);
      
      sceneTemplate.setPreference(org.havi.ui.HSceneTemplate.SCENE_SCREEN_LOCATION, 
              new HScreenPoint(0.0f, 0.0f), org.havi.ui.HSceneTemplate.REQUIRED);
     
    
      scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
            
      tekstLabel = new HStaticText("Frog Crossing");
      
      tekstLabel.setLocation(150,-50);
      tekstLabel.setSize(400,250);
      //tekstLabel.setBackground(new DVBColor(255,255,255,179));
      tekstLabel.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      
      GameOverLabel = new HStaticText("Game Over!");
      
      GameOverLabel.setLocation(150,50);
      GameOverLabel.setSize(400,250);
      //tekstLabel.setBackground(new DVBColor(255,255,255,179));
      GameOverLabel.setBackgroundMode(HVisible.BACKGROUND_FILL);
      GameOverLabel.setVisible(false);

      objTimerTask = new MijnTimerTask();
      
      objTimerTask.game.CreateObjects();
      
        scene.add(objTimerTask.game.DisplayBusses());
        scene.add(objTimerTask.game.DisplayKikker());      
        scene.add(tekstLabel);
        scene.add(GameOverLabel);
      
        
        
        
      
    }

    public void startXlet() 
    {
        if(debug) System.out.println("Xlet Starten");
        scene.validate(); 
        scene.setVisible(true);
        Timer timer = new Timer();
        
        timer.scheduleAtFixedRate(objTimerTask, 0, 200);
        
     
        
    
        
    }



    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
}

