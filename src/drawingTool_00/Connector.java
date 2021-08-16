package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Connector extends RectangularObject {

	public Connector(Point position, int width, int height) {
		super(position, width, height);
	}

	public void draw() {
		super.draw();
		super.fillColor(Color.black);
	}

}
