package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Rail extends RectangularObject implements LocatedRectangle {
	private RailBar railBar;

	public Rail(Point position, int width, int height) {
		super(position, width, height);
		railBar = new RailBar(new Point(super.getLeft(), super.getTop()), 30, 15);
	}

	public void draw() {
		super.fillColor(Color.black);
		railBar.draw();

		while (railBar.getLeft() <= super.getWidth() + super.getLeft()) {
			railBar.draw();
		}
	}

	@Override
	public Point address() {
		Point rootedAt = new Point(0, 0);
		rootedAt.x = super.getLeft();
		rootedAt.y = super.getTop();
		return rootedAt;
	}

	@Override
	public int width() {
		return super.getWidth();
	}

	@Override
	public int height() {
		return super.getHeight();
	}
}
