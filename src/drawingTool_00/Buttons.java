package drawingTool_00;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons {
	private JButton TrainButton = new JButton("Train");
	private JButton TrainStationButton = new JButton("TrainStation");
	private JButton SceneButton = new JButton("Scene");

	public void addActionListener(ActionListener listener) {
		TrainButton.addActionListener(listener);
		TrainStationButton.addActionListener(listener);
		SceneButton.addActionListener(listener);
	}

	public void addButtonsToAPanel(JFrame frame) {
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout(18, 1, 15, 20));

		menu.add(TrainButton);
		menu.add(TrainStationButton);
		menu.add(SceneButton);

		menu.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.add(menu, BorderLayout.WEST);
	}

	public JButton getTrainButton() {
		return TrainButton;
	}

	public JButton getTrainStationButton() {
		return TrainStationButton;
	}

	public JButton getSceneButton() {
		return SceneButton;
	}
}
