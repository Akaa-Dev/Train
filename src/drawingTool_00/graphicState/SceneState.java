package drawingTool_00.graphicState;

import drawingTool_00.Scene;

public class SceneState extends State {
	private static SceneState instance;

	private SceneState(Scene context) {
		this.context = context;
		scene = this;
	}

	public static SceneState getInstance(Scene context) {
		if (instance == null) {
			instance = new SceneState(context);
		}
		return instance;
	}

	@Override
	public State drawTrain() {
		context.clear();
		context.showTrains();
		return this;
	}

	@Override
	public State drawTrainStation() {
		context.clear();
		context.showTrainStation();
		return TrainStationState.getInstance(context);
	}

	@Override
	public State drawScene() {
		context.clear();
		context.showScene();
		return SceneState.getInstance(context);
	}

}
