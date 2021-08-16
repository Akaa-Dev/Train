package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Circle {
	private Point rootedAt;
	private int radius;

	public Circle(Point rootedAt, int radius) {
		this.rootedAt = rootedAt;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void draw(Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(rootedAt.x, rootedAt.y, radius, radius);
	}
}