import java.io.IOException;

import javax.imageio.ImageIO;



public class DoorOpen extends Obstacle{
	public DoorOpen() throws IOException {
		super(ImageIO.read(DoorOpen.class.getClass().getResource("/images/gate_open.png").openStream()));
	}

}
