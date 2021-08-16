package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class TowerFlag {
	private int height;
	private int width;
	private Pole pole;
	private FlagCloth flagCloth;

	public TowerFlag(Point stand, int width, int height) {
		this.height = height;
		this.width = width;
		pole = new Pole(stand, this.width, this.height);

		int xValues[] = { stand.x, stand.x + 20, stand.x + 11, stand.x + 20, stand.x };
		int yValues[] = { stand.y + 3, stand.y + 3, stand.y + 7, stand.y + 12, stand.y + 12 };
		flagCloth = new FlagCloth(xValues, yValues);
	}

	public void draw(Color color) {
		pole.fillColor(Color.black);
		flagCloth.draw(color);
	}
}
