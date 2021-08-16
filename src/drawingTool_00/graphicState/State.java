package drawingTool_00.graphicState;

import drawingTool_00.Scene;

public abstract class State {

	protected Scene context;

	protected static TrainState train;
	protected static TrainStationState trainStation;
	protected static SceneState scene;

	public abstract State drawTrain();

	public abstract State drawTrainStation();

	public abstract State drawScene();
}
