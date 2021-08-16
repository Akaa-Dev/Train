package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Gate extends RectangularObject {

	public Gate(Point position, int width, int height) {
		super(position, width, height);
	}

	public void draw(Color color) {
		super.fillColor(color);
	}
}
