package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Chair {
	private Leg leg1, leg2;
	private Back back;
	private Seat seat;

	public Chair(Point rootedAt, int width, int height) {
		leg1 = new Leg(new Point(rootedAt.x + 8, rootedAt.y + height), width / 20, (int) (height * 3));
		leg2 = new Leg(new Point(rootedAt.x + (width - 20), rootedAt.y + height), width / 20, (int) (height * 3));
		back = new Back(rootedAt, width, height);
		seat = new Seat(new Point(rootedAt.x - 8, rootedAt.y + 45), width + 20, height);
	}

	public void draw() {
		leg1.fillColor(new Color(221, 81, 40));
		leg2.fillColor(new Color(221, 81, 40));
		back.fillColor(new Color(221, 81, 40));
		seat.fillColor(Color.DARK_GRAY);
	}
}