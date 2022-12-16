package animations;

import bus.uigen.shapes.OEShapeModel;
import graphics.Angle;
import util.misc.ThreadSupport;

public class AnAngleAnimator implements AngleAnimator{
	
	public AnAngleAnimator() {
		
	}
	
	public void animateLegs(OEShapeModel legs, int pause, int desX, int desY) {
		int currentX = legs.getX();
		while(currentX <= desX) {
			legs.setX(currentX+1);
			ThreadSupport.sleep(pause);
		}
	}

}
