package jpu2017.dogfight.view;
import java.awt.event.KeyEvent;

import jpu2017.dogfight.controller.*;
import jpu2017.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {

	private IOrderPerformer orderPerformer;
	UserOrder userOrder;
	
	
	public EventPerformer (IOrderPerformer orderPerformer){
		
	}

	public void eventPerform (KeyEvent keyCode){
		
	}
	
	private UserOrder KeyCodeToUserOrder (int keyCode){
		final UserOrder KeyCodeToUserOrder = null;
		return KeyCodeToUserOrder;
	}
	
	
	
}
