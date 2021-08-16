package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Coach {
	private int width, height, left, bottom;
	private WindowSet window; // aggregate
	private Wheel frontWheel; // aggregate
	private Wheel backWheel; // aggregate
	private Door door; // aggregate

	public Coach(Point position, int width, int height) {
		this.left = position.x;
		this.bottom = position.y;
		this.setWidth(width);
		this.setHeight(height);

		Point frontWheelAddress = new Point(left + (int) (width * 0.10), bottom + height);
		frontWheel = new Wheel(frontWheelAddress, width);

		Point backWheelAddress = new Point(left + (int) (width * 0.8), bottom + height);
		backWheel = new Wheel(backWheelAddress, width);

		Point windowAddress = new Point(left + (int) (width * 0.06), bottom + (int) (height * 0.23));
		window = new WindowSet(windowAddress, (width), (int) (height * 0.19));

		Point doorAddress = new Point(left + (int) (width * 0.45), bottom + (int) (height * 0.08));
		door = new Door(doorAddress, (int) (width * 0.21), (int) (height * 0.92));
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw(Color color) {
		Color grey = new Color(158, 157, 157);
		Color glassBlue = new Color(141, 178, 251);

		Drawing.pen().setColor(color);
		Drawing.pen().fillRect(left, bottom, width, height);

		window.draw(glassBlue);
		frontWheel.draw();
		backWheel.draw();
		door.fillColor(grey);
	}

}
