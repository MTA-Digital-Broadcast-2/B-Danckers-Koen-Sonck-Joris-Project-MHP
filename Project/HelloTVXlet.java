package hellotvxlet;

import javax.tv.xlet.*;
import org.havi.ui.*;
import org.dvb.ui.*;
import java.awt.event.*;
import org.havi.ui.event.*;

public class HelloTVXlet implements Xlet, HActionListener{
    private XletContext actueleXletContext;
    private HScene scene;
    private boolean debug = true;
    
    private HStaticText tekstLabel, GameOverLabel;
    private Kikker kikker;
    private Bus bus;
    private int busXPos = 0, busYPos = 450, kikkerXPos = 300, kikkerYPos = 450;
        
    public void actionPerformed(ActionEvent e){
     //System.out.println(e.getActionCommand());
    
    }
    
    public HelloTVXlet() {
      
    }

    public void initXlet(XletContext context) throws XletStateChangeException {
        
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

      kikker = new Kikker();
      bus = new Bus();
      bus.setLocation(busXPos,busYPos);
      kikker.setLocation(kikkerXPos,kikkerYPos);
      scene.add(kikker);
      scene.add(bus);      
      scene.add(tekstLabel);
      scene.add(GameOverLabel);
      
      
    }

    public void startXlet() {
        if(debug) System.out.println("Xlet Starten");
        scene.validate(); 
        scene.setVisible(true);
        boolean Gameover = false;
        while(!Gameover){
        for(int i=0;i<10000002;i++){
            if(i>10000000){
                bus.setLocation(busXPos++, busYPos);
            }
        }
        
        if(bus.getLocation().x+100 == kikker.getLocation().x){
                Gameover = true;
                System.out.println("GameOver");
                GameOverLabel.setVisible(true);
            }
        }
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
}

