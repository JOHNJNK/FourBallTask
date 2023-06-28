import processing.core.PApplet;

public class FourBallAttempt1 extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 22;

    int speed1 = 0;
    int speed2 = 0;
    int speed3 = 0;
    int speed4 = 0;

    public static void main(String[] args) {
        PApplet.main("FourBallAttempt1", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        getCircle();
    }

    private void getCircle() {
        ellipse(speed1, HEIGHT * 1 / 5, DIAMETER, DIAMETER);
        ellipse(speed2, HEIGHT * 2 / 5, DIAMETER, DIAMETER);
        ellipse(speed3, HEIGHT * 3 / 5, DIAMETER, DIAMETER);
        ellipse(speed4, HEIGHT * 4 / 5, DIAMETER, DIAMETER);

        speed1 += 1;
        speed2 += 2;
        speed3 += 3;
        speed4 += 4;
    }

}
