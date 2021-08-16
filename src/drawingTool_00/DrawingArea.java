package drawingTool_00;

/**
 * @authors: 
 * Eberechukwu Faustina Nwaobiora
 * Akachukwu Emmanuel Anokwuru
 */

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;
	private Scene scene = new Scene();

	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);

		Drawing.set(pen);

		scene.draw();
	}

	public Scene getScene() {
		return scene;
	}
}
