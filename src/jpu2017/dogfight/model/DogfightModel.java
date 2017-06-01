package jpu2017.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel{
	private Sky sky;
	private ArrayList<IMobile> mobiles;
	
	public DogfightModel(){
		
	}
	public IArea getArea(){
		return null;
	}
	public void buildArea(Dimension dimension){
		
	}
	public void addMobile(Mobile mobile){
		
	}
	public void remove(Mobile mobile){
		
	}
	public ArrayList<IMobile> getMobiles() {
		return mobiles;
	}
	public void setMobilesHavesMoved(){
		
	}
	
}