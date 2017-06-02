package jpu2017.dogfight.controller;

import jpu2017.dogfight.model.IDogfightModel;
import jpu2017.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {
	private static int TIME_SLEEP = 30;
	private IViewSystem viewSystem;
	private IDogfightModel dogfightModel;
	
	public DogfightController(IDogfightModel dogfightModel){
		this.dogfightModel = dogfightModel;
		
	}
	public void play(){
		
	}
	public void setViewSystem(IViewSystem viewSystem){
		this.viewSystem = viewSystem;
		
	}
	private void lauchMissile(int player){
		
	}
	private void gameLoop(){
		
	}
	@Override
	public void orderPerformer(UserOrder userOrder) {
		 UserOrder userOrder1 = userOrder;
		
	}
	
}
