package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Door extends RectangularObject {
	private int width = super.getWidth();
	private int doorCenter = width / 2;

	public Door(Point position, int width, int height) {
		super(position, width, height);
	}

	public void draw() {
		super.draw();
		drawDoorLine(super.getLeft(), super.getTop());
		draw(super.getLeft(), super.getTop());
	}

	public void drawDoorLine(int left, int top) {
		int doorLinePos = left + doorCenter;
		int DoorLineEnd = top + (int) (super.getHeight());
		Drawing.pen().drawLine(doorLinePos, top, doorLinePos, DoorLineEnd);
	}

	public void draw(int left, int bottom) {
		int height = (int) (super.getHeight() * 0.16);
		int width = (int) (super.getWidth() * 0.42);
		int buttonPos = left + (int) (super.getWidth() * 0.40);
		int ordinate = bottom + (int) (super.getHeight() * 0.41);
		Drawing.pen().drawOval(buttonPos, ordinate, height, width); // door button
		Drawing.pen().fillOval(buttonPos + (int) (0.1 * width), ordinate, height, width);
	}
	
}
