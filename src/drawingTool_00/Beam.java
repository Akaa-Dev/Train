package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Beam extends RectangularObject {

	public Beam(Point position, int width, int height) {
		super(position, width, height);
	}

	public void draw() {
		super.fillColor(Color.black);
	}
}
