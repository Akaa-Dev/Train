package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Wheel {
	private int left, bottom;
	private int rimWidth;
	private int rimHeight;

	public Wheel(Point position, int width) {
		this.left = position.x;
		this.bottom = position.y;
		rimWidth = (int) (width * 0.12);
		rimHeight = rimWidth;
	}

	public void draw() {
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillOval(left, bottom, rimWidth, rimHeight);
	}
}