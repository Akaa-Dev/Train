package drawingTool_00;

import java.awt.Point;

public class RailBar {
	private int width, height;
	private Point position;

	public RailBar(Point position, int width, int height) {
		this.height = height;
		this.width = width;
		this.position = position;
	}

	public void draw() {
		Drawing.pen().drawRect(position.x, position.y, width, height);
		drawAnother();
	}

	public void drawAnother() {
		position.x = position.x + width;
	}

	public int getLeft() {
		return position.x;
	}
}
