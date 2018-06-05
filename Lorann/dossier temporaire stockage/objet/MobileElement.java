import java.awt.Image;

public class MobileElement extends Element{
	private int X;
	private int Y;
	public void MoveUp() {
		
	}
	public void MoveDown() {
		
	}
	public void MoveLeft() {
		
	}
	public void MoveRigth() {
		
	}
	public MobileElement(){
		
	}
	public void setX(int X) {
		this.X = X;
	}
	public void setY(int Y) {
		this.Y = Y;
	}
	
	public int getX() {
		return this.X;
	}
	
	public int getY() {
		return this.Y;
	}
	
	
	public MobileElement(Image sprite, boolean blocking, boolean deadly, int X, int Y) {
		super(sprite, blocking, deadly);
		this.X = X;
		this.Y = Y;
	}
	
}
