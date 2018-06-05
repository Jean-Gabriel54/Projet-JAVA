

import java.awt.Image;

public class Element {
	private Image sprite;
	private boolean blocking;
	private boolean deadly;
	
	public Element(Image sprite, boolean blocking, boolean deadly) {
		this.setSprite(sprite);
		this.setBlocking(blocking);
		this.setDeadly(deadly);
	}
	public Element() {
		
	}
	public boolean getBlocking() {
		return blocking;
	}
	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}
	public boolean getDeadly() {
		return deadly;
	}
	public void setDeadly(boolean deadly) {
		this.deadly = deadly;
	}
	public Image getSprite() {
		return sprite;
	}
	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}
	
	
	
}