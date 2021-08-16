package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Pole extends RectangularObject {

	public Pole(Point stand, int width, int height) {
		super(stand, width, height);
	}

	public void draw(Color color) {
		super.fillColor(color);
	}

}
