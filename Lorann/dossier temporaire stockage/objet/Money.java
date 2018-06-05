import java.io.IOException;

import javax.imageio.ImageIO;



public class Money extends Obstacle{
	public Money() throws IOException {
		super(ImageIO.read(Money.class.getClass().getResource("/images/purse.png").openStream()));
	}

}
