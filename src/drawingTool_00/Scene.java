package drawingTool_00;

import java.awt.Point;
import java.util.ArrayList;

import drawingTool_00.graphicState.SceneState;
import drawingTool_00.graphicState.State;

public class Scene {
	private ArrayList<Train> trains = null;
	private ArrayList<Tree> trees = null;
	private ArrayList<Rail> rails = null;
	private TrainStation trainStation;
	private static State graphicState;//

	public Scene() {
		trains = new ArrayList<Train>();
		trees = new ArrayList<Tree>();
		rails = new ArrayList<Rail>();
		setTrains();
		setTrees();
		trainStation = setTrainStation();
		graphicState = SceneState.getInstance(this); // ****lab4
	}

	public void addNewTrains(Point position, int width, int height) {
		Train train = new Train(position, width, height);
		if (vacantProperty(train))
			trains.add(train);
	}

	public void addNewRails(Point position, int width, int height) {
		Rail rail = new Rail(position, width, height);
		if (vacantProperty(rail))
			rails.add(rail);
	}

	private void addTree(Point location, int width, int height, int radius) {
		Tree newTree = new Tree(location, width, height, radius);
		if (vacantProperty(newTree))
			trees.add(newTree);
	}

	public void drawTrains() {
		for (Train train : this.trains) {
			train.draw();
		}
	}

	public void drawTrees() {
		for (Tree tree : this.trees) {
			tree.draw();
		}
	}

	public void drawRails() {
		for (Rail rail : this.rails) {
			rail.draw();
		}
	}

	private boolean vacantProperty(LocatedRectangle newObject) {
		boolean anyIntersection = false;
		for (Train train : trains)
			anyIntersection = anyIntersection || train.intersects(newObject);

		return !anyIntersection;
	}

	public void setTrains() {
		Point train1Position = new Point(128, 550);
		int train1Width = RandomNumber.between(1385, 1395);
		int train1Height = RandomNumber.between(110, 150);
		addNewTrains(train1Position, train1Width, train1Height);

		Point train2Position = new Point(200, 900);
		int train2Width = RandomNumber.between(800, 500);
		int train2Height = RandomNumber.between(110, 150);
		addNewTrains(train2Position, train2Width, train2Height);

		Point rail1Position = new Point(128, train1Height + train1Position.y + 30);
		int rail1Width = 1250;
		int rail1Height = 10;
		addNewRails(rail1Position, rail1Width, rail1Height);
	}

	public TrainStation setTrainStation() {
		Point trainStationLocation = new Point(230, 200);
		int stationWidth = 1000;
		int stationHeight = 250;
		return trainStation = new TrainStation(trainStationLocation, stationWidth, stationHeight);
	}

	public void setTrees() {
		Point tree1Position = new Point(60, 400);
		int tree1Width = RandomNumber.between(20, 30);
		int tree1Height = RandomNumber.between(40, 50);
		int radius = RandomNumber.between(60, 80);
		addTree(tree1Position, tree1Width, tree1Height, radius);
	}

	public void showTrains() {
		trees.clear();
		trainStation = null;
		if (trains.isEmpty() && rails.isEmpty())
			setTrains();
	}

	public void showTrainStation() {
		trains.clear();
		rails.clear();
		setTrainStation();
	}

	public void showScene() {
		if ((trains.isEmpty() == false && rails.isEmpty() == false) && trainStation != null)
			draw();
		else if (trainStation == null) {
			setTrainStation();
			setTrees();
			if (trains.isEmpty() && rails.isEmpty())
				setTrains();
		}
	}

	public void draw() {
		if (trainStation != null)
			trainStation.draw();
		drawTrains();
		drawTrees();
		drawRails();
	}

	public void clear() {
		trainStation = null;
		trees.clear();
		trains.clear();
		rails.clear();
	}

	public void setTrainStation1() {
		graphicState = graphicState.drawTrainStation();
	}

	public void setTrains1() {
		graphicState = graphicState.drawTrain();
	}

	public void setScene() {
		graphicState = graphicState.drawScene();
	}

}
