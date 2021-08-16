/**
 * @author Eberechukwu Faustina Nwaobiora
 * @author Akachukwu Emmanuel Anokwuru
 */

package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Train implements LocatedRectangle {
	private int left, bottom, width, height;
	private Point rootedAt;
	private Coach frontCoach; // composite
	private Coach middleCoach; // composite
	private Coach endCoach; // composite
	private PilotCoach pilotCoachLeft; // composite
	private PilotCoach pilotCoachRight; // composite

	public Train(Point rootedAt, int width, int height) {
		this.width = width;
		this.height = height;
		left = rootedAt.x;
		bottom = rootedAt.y;
		this.rootedAt = rootedAt;
		frontCoach = new Coach(new Point((int) (width * 0.22), bottom), (int) (width * 0.222), height);
		middleCoach = new Coach(new Point((int) (width * 0.44), bottom), (int) (width * 0.222), height);
		endCoach = new Coach(new Point((int) (width * 0.66), bottom), (int) (width * 0.222), height);
		pilotCoachLeft = new PilotCoach(new Point(left, bottom), (int) (width * 0.25), height + (int) (height * 0.55));
		pilotCoachRight = new PilotCoach(new Point(left + (int) (width * 0.66), bottom), (int) (width * 0.25),
				height + (int) (height * 0.55));
	}

	public void draw() {
		Color white = new Color(252, 250, 249);
		pilotCoachLeft.draw(90, 107, white);
		frontCoach.draw(white);
		middleCoach.draw(white);
		endCoach.draw(white);
		pilotCoachRight.draw(-270, -107, white);
	}

	@Override
	public Point address() {
		return rootedAt;
	}

	@Override
	public int width() {
		return width;
	}

	@Override
	public int height() {
		return height;
	}
}
