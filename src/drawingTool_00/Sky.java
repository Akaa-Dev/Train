package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Sky {
	private Sun sun;
	private Screen upperScreen;
	private Screen lowerScreen;
	private Screen ground;

	public Sky(Point position, int width, int height, int radius) {
		sun = new Sun(new Point(position.x + width / 2, position.y + 50), radius);
		upperScreen = new Screen(position, width, (int) (height * 0.6));
		lowerScreen = new Screen(new Point(position.x, position.y + (int) (height * 0.6)), width, (int) (height * 0.4));
		ground = new Screen(new Point(position.x, position.y + (int) (height)), width, (int) (height * 0.9));
	}

	public void draw() {
		upperScreen.fillColor(new Color(197, 244, 252));
		lowerScreen.fillColor(Color.DARK_GRAY);
		ground.fillColor(Color.LIGHT_GRAY);
		sun.draw(Color.YELLOW);
	}

}