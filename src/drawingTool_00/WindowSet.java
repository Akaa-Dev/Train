package drawingTool_00;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class WindowSet {
	private ArrayList<Window> windowSet = null;

	public WindowSet(Point position, int width, int height) {
		windowSet = new ArrayList<Window>();
		int windowWidth = (int) (width * 0.08);
		int space = (int) (width * 0.13);
		Point windowPost1 = new Point(position.x + space, position.y);
		Point windowPost2 = new Point(windowPost1.x + space, position.y);
		Point windowPost3 = new Point(windowPost2.x + space * 3, position.y);
		Point windowPost4 = new Point(windowPost3.x + space, position.y);
		addNewWindow(position, windowWidth, height);
		addNewWindow(windowPost1, windowWidth, height);
		addNewWindow(windowPost2, windowWidth, height);
		addNewWindow(windowPost3, windowWidth, height);
		addNewWindow(windowPost4, windowWidth, height);
	}

	public void addNewWindow(Point position, int width, int height) {
		Window window = new Window(position, width, height);
		windowSet.add(window);
	}

	public void draw(Color color) {
		for (Window window : this.windowSet) {
			window.fillColor(color);
		}
	}
}
