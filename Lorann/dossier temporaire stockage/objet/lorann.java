

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class lorann extends MobileElement{
	public lorann(int X, int Y) throws IOException {
		super(ImageIO.read(lorann.class.getClass().getResource("/picture/lorann_u.png").openStream()),false,false,X,Y);
	}
}
