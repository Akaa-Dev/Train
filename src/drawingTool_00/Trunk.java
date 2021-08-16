package drawingTool_00;

/**
 * @author Eberechukwu Faustina Nwaobiora
 * @author Akachukwu Emmanuel Anokwuru
 */

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;

public class Trunk {
	private Polygon p;
	private int width;
	private int height;
	private String brown = "#964B00";

	public Trunk(Point rootedAt, int width, int height) {
		this.width = width;
		this.height = height;
		int n = 4;
		int[] x = { rootedAt.x + 3, rootedAt.x, rootedAt.x + width, rootedAt.x + width - 3 };
		int[] y = { rootedAt.y - height, rootedAt.y, rootedAt.y, rootedAt.y - height };
		p = new Polygon(x, y, n);
	}

	public int width() {
		return width;
	}

	public int height() {
		return height;
	}

	public void draw() {
		Drawing.pen().setColor(Color.decode(brown));
		Drawing.pen().fillPolygon(p);
	}
}
