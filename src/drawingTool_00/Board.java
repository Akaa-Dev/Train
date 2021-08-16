package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Board extends RectangularObject {
	private Leg boardStand;

	public Board(Point position, int width, int height) {
		super(position, width, height);
		boardStand = new Leg(new Point(position.x + (width / 2), position.y + height), width / 20, (height - 40));
	}

	public void draw(Color color) {
		super.fillColor(color);
		boardStand.fillColor(Color.black);
	}
}
