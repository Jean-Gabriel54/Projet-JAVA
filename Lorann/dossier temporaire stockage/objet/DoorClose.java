import java.io.IOException;

import javax.imageio.ImageIO;



public class DoorClose extends Obstacle{
	public DoorClose() throws IOException {
		super(ImageIO.read(DoorClose.class.getClass().getResource("/images/gate_closed.png").openStream()));
	}

}
