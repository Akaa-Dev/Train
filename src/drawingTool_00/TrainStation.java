package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class TrainStation {
    private Chair chair1, chair2;
    private Facade facade;
    private Board noticeBoard1, noticeBoard2;
    private Tower tower1, tower2, tower3;
    private Roof roof;
    private Sky sky;

    public TrainStation(Point location, int width, int height) {
	chair1 = new Chair(new Point(location.x + 50, location.y + 150), width / 6, height / 10);
	chair2 = new Chair(new Point(location.x + (width - 200), location.y + 150), width / 6, height / 10);
	facade = new Facade(location, width, height);
	noticeBoard1 = new Board(new Point(location.x - 120, location.y + 40), width / 10, height / 2);
	noticeBoard2 = new Board(new Point(location.x + width + 15, location.y + 40), width / 10, height / 2);
	tower1 = new Tower(new Point(location.x + 5, location.y - 30), width / 3, height / 2);
	tower2 = new Tower(new Point(location.x + (width / 2) - 15, location.y - 30), width / 3, height / 2);
	tower3 = new Tower(new Point(location.x + width - 110, location.y - 30), width / 3, height / 2);
	sky = new Sky(new Point(0, 0), width * 2, height * 2, 30);
	int roofXpoints[] = { location.x + 10, location.x + (width - 10), location.x + (width + 10), location.x - 10 };
	int roofYpoints[] = { location.y - 60, location.y - 60, location.y, location.y };
	roof = new Roof(roofXpoints, roofYpoints);
    }

    public void draw() {
	sky.draw();
	facade.draw();
	chair1.draw();
	chair2.draw();
	noticeBoard1.draw(new Color(228, 240, 252));
	noticeBoard2.draw(new Color(228, 240, 252));
	tower1.draw(new Color(170, 86, 61), new Color(119, 224, 0));
	tower2.draw(new Color(170, 86, 61), new Color(202, 115, 190));
	tower3.draw(new Color(170, 86, 61), new Color(240, 167, 41));
	roof.draw(Color.black);
    }

}
