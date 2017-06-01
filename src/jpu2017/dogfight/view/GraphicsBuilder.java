package jpu2017.dogfight.view;
import java.awt.Graphics;
import java.awt.image.*;

import jpu2017.dogfight.model.IDogfightModel;
import jpu2017.dogfight.model.IMobile;
import jpu2017.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder { //classe
	private IDogfightModel dogfightModel; 
	private BufferedImage emptySky;
	
	public GraphicsBuilder (IDogfightModel dogfightModel){
		
	}
	
	public void applyModelToGraphic (Graphics graphics , ImageObserver observer){
		
	}

	private void buildEmptySky(){
		
	}
	
	private void drawMobile (IMobile mobile , Graphics graphics , ImageObserver observer){
		
	}
	
	public int getGlobalWidth(){
		return 1;
	}
	
	public int getGlobalHeight(){
		return 1;
	}
	
}
