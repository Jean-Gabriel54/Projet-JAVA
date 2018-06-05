import java.io.IOException;

import javax.imageio.ImageIO;



public class Bubble extends Obstacle{
	public Bubble() throws IOException {
		super(ImageIO.read(Bubble.class.getClass().getResource("/images/crystal_ball.png").openStream()));
	}

}
