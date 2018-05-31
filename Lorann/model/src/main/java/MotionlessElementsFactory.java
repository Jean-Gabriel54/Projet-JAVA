import fr.exia.insanevehicles.element.motionless.MotionlessElement;

public abstract class MotionlessElementsFactory {

    /** The Constant DITCH. */
    private static final WallCross       WALL_CROSS        = new WallCross();

    /** The Constant DITCH_RIGHT. */
    private static final WallH   	   	 WALL_H            = new WallH();

    /** The Constant DITCH_LEFT. */
    private static final WallV    		 WALL_V            = new WallV();
 
    /** The Constant TREE. */
    private static final DoorOpen          DOOR_OPEN       = new DoorOpen();

    /** The Constant MACADAM. */
    private static final DoorClose       DOOR_CLOSE        = new DoorClose();

    /** The Constant OBSTACLE. */
    private static final Money   		   MONEY           = new Money();
    
    private static final Bubble			 BUBBLE			   = new Bubble();
    
    private static final Ground			GROUND			   = new Ground();
    
    
    private static MotionlessElement[] motionlessElements = { WALL_CROSS, WALL_H, WALL_V, DOOR_OPEN, DOOR_CLOSE, MONEY, BUBBLE, GROUND };

    
    
    
    public static MotionlessElement createWallCross() {
    	return WALL_CROSS;
   }
    
    public static MotionlessElement createWallH() {
    	return WALL_H;
    }
    
    public static MotionlessElement createWallV() {
    	return WALL_V;
    }
    
    public static MotionlessElement createDoorOpen() {
    	return DOOR_OPEN;
    }
    
    public static MotionlessElement createDoorClose() {
    	return DOOR_CLOSE;
    }
    
    public static MotionlessElement createMoney() {
    	return MONEY;
    }
    
    public static MotionlessElement createBubble() {
    	return BUBBLE;
    }
    
    public static MotionlessElement createGround() {
    	return GROUND;
    }
}
