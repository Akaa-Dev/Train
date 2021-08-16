package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Back extends RectangularObject {

	public Back(Point position, int width, int height) {
		super(position, width, height);
	}

	public void draw(Color color) {
		super.fillColor(color);
	}
}