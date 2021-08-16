package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class PilotCoach {
	private PilotDoor rightPilotDoor, leftPilotDoor;// aggregate
	private Connector connector;
	private Window rightPilotWindow, leftPilotWindow;
	private Wheel rightPilotWheel, leftPilotWheel;
	private int width;
	private int height;
	private Point position;
	private int YPos;

	public PilotCoach(Point position, int width, int height) {
		this.width = width;
		this.height = height;
		this.position = position;
		YPos = position.y + (int) (height * 0.65);

		Point connectorPos = new Point(position.x - 30, YPos);
		connector = new Connector(connectorPos, (int) (width * 0.22), (int) (height * 0.07));

		Point leftPilotWindowPos = new Point(position.x + (int) (width * 0.2), position.y + (int) (height * 0.15));
		int windowWidth = (int) (width * 0.07);
		int windowHeight = (int) (height * 0.125);
		leftPilotWindow = new Window(leftPilotWindowPos, windowWidth, windowHeight);

		Point rightPilotWindowPos = new Point(position.x + (int) (width * 0.7), position.y + (int) (height * 0.15));
		rightPilotWindow = new Window(rightPilotWindowPos, windowWidth, windowHeight);

		Point leftPilotWheelPos = new Point(position.x + (int) (width * 0.15), YPos);
		int wheelWidth = width - (int) (width * 0.143);
		leftPilotWheel = new Wheel(leftPilotWheelPos, wheelWidth);

		Point rightPilotWheelPos = new Point(position.x + (int) (width * 0.8), YPos);
		rightPilotWheel = new Wheel(rightPilotWheelPos, wheelWidth);

		Point leftPilotDoorPos = new Point(position.x + (int) (width * 0.4), position.y + (int) (height * 0.05));
		int PilotDoorWidth = windowWidth;
		int PilotDoorHeight = (int) (height * 0.6);
		leftPilotDoor = new PilotDoor(leftPilotDoorPos, PilotDoorWidth, PilotDoorHeight);

		Point rightPilotDoorPos = new Point(position.x + (int) (width * 0.55), position.y + (int) (height * 0.05));
		rightPilotDoor = new PilotDoor(rightPilotDoorPos, PilotDoorWidth, PilotDoorHeight);
	}

	public void draw(int startAngle, int arcAngle, Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillArc(position.x, position.y, width, height, startAngle, arcAngle);

		if (position.x < width) {
			drawCoach(0.03, 0.48, leftPilotDoor, leftPilotWindow, leftPilotWheel);
		} else if (position.x > width) {
			drawCoach(0.52, 0.46, rightPilotDoor, rightPilotWindow, rightPilotWheel);
		}

	}

	private void drawCoach(double posXScaleLeft, double posXScaleRight, PilotDoor door, Window window, Wheel wheel) {
		Color grey = new Color(158, 157, 157);
		Color glassBlue = new Color(141, 178, 251);
		int xpos1 = position.x + (int) (width * posXScaleLeft);
		int xpos2 = xpos1 + (int) (width * posXScaleRight);

		window.fillColor(glassBlue);
		wheel.draw();
		door.fillColor(grey);
		Drawing.pen().setColor(Color.black);
		Drawing.pen().drawLine(xpos1, YPos, xpos2, YPos);
	}

}
