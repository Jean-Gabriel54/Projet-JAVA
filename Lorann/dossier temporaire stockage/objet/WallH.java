import java.io.IOException;

import javax.imageio.ImageIO;



public class WallH extends Obstacle{
	public WallH() throws IOException {
		super(ImageIO.read(WallH.class.getClass().getResource("/images/horizontal_bone.png").openStream()));
	}

}
