package animations;

import bus.uigen.shapes.OEShapeModel;
import graphics.Angle;

public class AnAngleCommand implements Runnable {
	
	AngleAnimator animator;
	OEShapeModel legs;
	int pause;
	int x;
	int y;

	public AnAngleCommand(AngleAnimator givenAnimator, OEShapeModel givenLegs, int givenPause, int destX, int destY) {
		animator = givenAnimator;
		legs = givenLegs;
		pause = givenPause;
		x = destX;
		y = destY;
	}

	@Override
	public void run() {
		animator.animateLegs(legs, pause, x, y);
	}

}
