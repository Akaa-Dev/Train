package drawingTool_00;

import java.awt.Color;

public class FlagCloth {
	private int xPoints[], yPoints[];
	private final int NUMBEROFPOINTS = 5;

	public FlagCloth(int xValues[], int yValues[]) {
		this.xPoints = xValues;
		this.yPoints = yValues;
	}

	public void draw(Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillPolygon(xPoints, yPoints, NUMBEROFPOINTS);
	}
}
