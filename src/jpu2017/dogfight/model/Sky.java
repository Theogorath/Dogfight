package jpu2017.dogfight.model;
import java.awt.Image;

public class Sky implements IArea{
	private Image image;
	private Dimension dimension;
	
	public Sky (Dimension dimension){
		this.dimension = dimension;
		//initialisation d'image
		
	}

	public Image getImage() {
		return image;
	}

	public Dimension getDimension() {
		return dimension;
	}
	
}
