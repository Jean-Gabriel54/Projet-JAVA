
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Demon extends MobileElement{
	public Demon(int X, int Y, int n) throws IOException {
		super(ImageIO.read(Demon.class.getClass().getResource("/picture/monster_"+n+".png").openStream()),true,true, X,Y);
	}
}
