package graphics;

import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import bus.uigen.shapes.ALineModel;
import bus.uigen.shapes.AnOvalModel;
import bus.uigen.shapes.OEShapeModel;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;

@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({
	"circle",
	"lineOne"
	
})
@EditablePropertyNames({
	
})
public class ABoundedBuffer implements BoundedBuffer {
	int INIT_X = 420;
	int INIT_Y = 175;
	int INIT_CIRCLE_HEIGHT = 350;
	int INIT_CIRCLE_WIDTH = 350;
	double LINE_ONE_ANGLE = (3*Math.PI)/4;
	int INIT_LINE_Y = 350;
	
	OEShapeModel circle;
	OEShapeModel lineOne;
	
	public ABoundedBuffer() {
		circle = new AnOvalModel();
		circle.setHeight(INIT_CIRCLE_HEIGHT);
		circle.setWidth(INIT_CIRCLE_WIDTH);
		circle.setX(INIT_X);
		circle.setY(INIT_Y);
		
		lineOne = new ALineModel();
		lineOne.setX(INIT_X);
		lineOne.setY(INIT_LINE_Y);
		lineOne.setAngle(LINE_ONE_ANGLE);
		lineOne.setRadius(175);
		
	}
	
	public OEShapeModel getCircle() {
		return circle;
	}
	
	public OEShapeModel getLineOne() {
		return lineOne;
	}
	
	public static void main(String[] args) {
		final BoundedBuffer buffer = new ABoundedBuffer();
		OEFrame editor = ObjectEditor.edit(buffer);
		editor.showDrawPanel();
	}

}
