package drawingTool_00.graphicState;

import drawingTool_00.Scene;

public class TrainState extends State {
	private static TrainState instance;

	private TrainState(Scene context) {
		this.context = context;
		train = this;
	}

	public static TrainState getInstance(Scene context) {
		if (instance == null) {
			instance = new TrainState(context);
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
