package drawingTool_00;

import java.awt.Point;

/**
 * @author Eberechukwu Faustina Nwaobiora
 * @author Akachukwu Emmanuel Anokwuru
 */

public class Tree implements LocatedRectangle {
	private Point rootedAt;
	private Trunk trunk;
	private Crown crown;

	public Tree(Point rootedAt, int width, int height, int radius) {
		this.rootedAt = rootedAt;
		this.trunk = new Trunk(rootedAt, width, height);
		int x = rootedAt.x + (width / 2) - (radius / 2);
		int y = rootedAt.y - height - radius + 1;
		Point crownPos = new Point(x, y);
		crown = new Crown(crownPos, radius);
	}

	public void draw() {
		trunk.draw();
		crown.draw();
	}

	public Point address() {
		return rootedAt;
	}

	public int width() {
		return Math.max(trunk.width(), crown.getRadius());
	}

	public int height() {
		return trunk.height() + crown.getRadius();
	}

	public int radius() {
		return crown.getRadius();
	}
}
