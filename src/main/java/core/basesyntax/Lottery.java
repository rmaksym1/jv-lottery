package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor();
        Random rand = new Random();
        Ball ball = new Ball(color, rand.nextInt(100));
        return ball;
    }
}
