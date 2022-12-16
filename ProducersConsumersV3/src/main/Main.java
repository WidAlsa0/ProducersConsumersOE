package main;

import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import graphics.AnAngle;

public class Main {

	static AnAngle legs = new AnAngle();
	
	public static void main(String[] args) {
		OEFrame editor = ObjectEditor.edit(legs);
		editor.showDrawPanel();
	}

}
