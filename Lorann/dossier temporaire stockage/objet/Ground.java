import java.io.IOException;

import javax.imageio.ImageIO;



public class Ground extends Obstacle{
	public Ground() throws IOException {
		super(ImageIO.read(Ground.class.getClass().getResource("/images/ground.png").openStream()));
	}

}
