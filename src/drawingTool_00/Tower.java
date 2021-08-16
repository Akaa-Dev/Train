package drawingTool_00;

import java.awt.Color;
import java.awt.Point;
import java.time.Clock;

public class Tower {
	private int height, width;
	private TowerFlag towerFlag;
	private Beam beam;
	private Point position;
	public final int towerPoints = 6;

	public Tower(Point position, int width, int height) {
		this.position = position;
		this.height = height;
		this.width = width;
		towerFlag = new TowerFlag(new Point(position.x + 52, position.y - 140), width / 52, height / 3);
		beam = new Beam(new Point(position.x - 5, position.y - 80), width / 3, height / 10);
	}

	public void draw(Color color, Color flagColor) {
		int xPoints[] = { position.x + 50, position.x + 60, position.x + 100, position.x + 100, position.x + 5,
				position.x + 5 };
		int yPoints[] = { position.y - 100, position.y - 100, position.y - 80, position.y - 30, position.y - 30,
				position.y - 80 };
		Drawing.pen().setColor(color);
		Drawing.pen().fillPolygon(xPoints, yPoints, towerPoints);
		towerFlag.draw(flagColor);
		beam.draw();
	}

}
