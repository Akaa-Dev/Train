package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class RectangularObject {
	private int width, height, left, top;

	public RectangularObject(Point position, int width, int height) {
		this.width = width;
		this.height = height;
		this.left = position.x;
		this.top = position.y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getLeft() {
		return left;
	}

	public int getTop() {
		return top;
	}

	public void draw() {
		Drawing.pen().drawRect(left, top, width, height);
	}
	
	public void draw(Color color) {
		
	}

	public void fillColor(Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillRect(left, top, width, height);
	}
}
