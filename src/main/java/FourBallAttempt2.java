import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallAttempt2 extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 22;

    ArrayList<Ball> ballArrayList = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBallAttempt2", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        // I have feed the speed and height by using index value if u want different value try with array or JSON to feed the value for the ball
        for(int index=0;index<4;index++){
            Ball ball = new Ball(index + 1,height*(index+1)/5,DIAMETER);
            ballArrayList.add(ball);
        }

    }

    @Override
    public void draw() {
        displayBall();
        updatePosX();
    }

    private void updatePosX() {
        for(Ball ball : ballArrayList){
            ball.updatePosX();
        }
    }

    private void displayBall() {
        for(Ball ball : ballArrayList){
            ellipse(ball.getPosX(),ball.getPosY(), ball.getSize(), ball.getSize());
        }
    }


}


