package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Leg extends RectangularObject {

	public Leg(Point position, int width, int height) {
		super(position, width, height);
	}

	public void draw(Color color) {
		super.fillColor(color);
	}
}