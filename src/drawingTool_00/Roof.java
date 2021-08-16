package drawingTool_00;

import java.awt.Color;

public class Roof {
	int xPoints[], yPoints[];
	private final int NUMBEROFPOINTS = 4;

	public Roof(int xValues[], int yValues[]) {
		this.xPoints = xValues;
		this.yPoints = yValues;
	}

	public void draw(Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillPolygon(xPoints, yPoints, NUMBEROFPOINTS);
	}
}
