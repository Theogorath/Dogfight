package jpu2017.dogfight.view;
import java.lang.*;
import java.util.Observable;

import jpu2017.dogfight.controller.IOrderPerformer;
import jpu2017.dogfight.model.IDogfightModel;
import jpu2017.gameframe.GameFrame;


public class DogfightView implements IViewSystem , Runnable{
	private GraphicsBuilder graphicsBuilder;
	private EventPerformer eventPerformer;
	private GameFrame gameFrame;
	
	

	public DogfightView (IOrderPerformer orderPerformer , IDogfightModel dogfightModel ,Observable observable ){
		
	}
	
	public void run(){
		
	}
	
	public void displayMessage (String message){
		
	}
	
	public void closeAll(){
		
	}
	
}
