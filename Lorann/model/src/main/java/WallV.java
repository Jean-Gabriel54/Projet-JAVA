import java.io.IOException;

import javax.imageio.ImageIO;



public class WallV extends Obstacle{
	public WallV() throws IOException {
		super(ImageIO.read(WallV.class.getClass().getResource("/images/vertical_bone.png").openStream()));
	}

}
