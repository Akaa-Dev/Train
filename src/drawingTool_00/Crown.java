package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Crown {
	private Point rootedAt;
	private int radius;

	public Crown(Point rootedAt, int radius) {
		this.rootedAt = rootedAt;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void draw() {
		Drawing.pen().setColor(Color.green);
		Drawing.pen().fillOval(rootedAt.x, rootedAt.y, radius, radius);
	}
}