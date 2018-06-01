import java.io.IOException;

import fr.exia.insanevehicles.element.motionless.MotionlessElement;


public abstract class Factory {


	/*

    private static final WallCross       WALL_CROSS        = new WallCross();


    private static final WallH   	   	 WALL_H            = new WallH();

   
    private static final WallV    		 WALL_V            = new WallV();
 
   
    private static final DoorOpen          DOOR_OPEN       = new DoorOpen();

    private static final DoorClose       DOOR_CLOSE        = new DoorClose();

    private static final Money   		   MONEY           = new Money();
    
    private static final Bubble			 BUBBLE			   = new Bubble();
    
    private static final Ground			GROUND			   = new Ground();
    
    private static MotionlessElement[] motionlessElements = { WALL_CROSS, WALL_H, WALL_V, DOOR_OPEN, DOOR_CLOSE, MONEY, BUBBLE, GROUND };
    */

    
    
    
    public static WallCross createWallCross() throws IOException {
    	return new WallCross();
   }
    
    public static WallH createWallH() throws IOException {
    	return new WallH();
    }
    
    public static WallV createWallV() throws IOException {
    	return new WallV();
    }
    
    public static DoorOpen createDoorOpen() throws IOException {
    	return new DoorOpen();
    }
    
    public static DoorClose createDoorClose() throws IOException {
    	return new DoorClose();
    }
    
    public static Money createMoney() throws IOException {
    	return new Money();
    }
    
    public static Bubble createBubble() throws IOException {
    	return new Bubble();
    }
    
    public static Ground createGround() throws IOException {
    	return new Ground();
    }
}
