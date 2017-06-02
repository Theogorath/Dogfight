import jpu2017.dogfight.controller.DogfightController;
import jpu2017.dogfight.model.DogfightModel;
import jpu2017.dogfight.view.DogfightView;

public class DogfightMain {

	public static void main(String[] args) {
		final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();
		
	}
	
}
