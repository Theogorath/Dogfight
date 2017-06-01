package jpu2017.gameframe;
import java.awt.event.*;
import java.util.Observable;

import javax.swing.JFrame;


public class GameFrame extends JFrame implements KeyListener {
	private IEventPerformer eventPerformer;
	GamePanel gamePanel;
	
	public GameFrame (String title , IEventPerformer performer , IGraphicsBuilder graphicBuilder , Observable observable){
		
		this.gamePanel = new GamePanel(graphicBuilder);
	}
	
	public void keyPressed (KeyEvent keyEvent){
		
	}
	
	public void keyReleased (KeyEvent keyEvent){
		
	}
	
	public void keyTyped (KeyEvent keyEvent){
		
	}

}
