package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Facade extends RectangularObject {
	private Gate gate;
	private WindowSet window;

	public Facade(Point point, int width, int height) {
		super(point, width, height);
		gate = new Gate(new Point(point.x + ((width / 2) - 10), point.y + 10), width / 6, height - 10);
		window = new WindowSet(new Point(point.x + 50, point.y + 35), width + 40, height / 3);
	}

	public void draw() {
		super.fillColor(new Color(234, 250, 251));
		window.draw(Color.black);
		gate.draw(new Color(78, 76, 76));
	}

}