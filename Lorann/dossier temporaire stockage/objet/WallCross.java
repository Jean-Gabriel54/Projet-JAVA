import java.io.IOException;

import javax.imageio.ImageIO;



public class WallCross extends Obstacle{
	public WallCross() throws IOException {
		super(ImageIO.read(WallCross.class.getClass().getResource("/images/bone.png").openStream()));
	}

}
