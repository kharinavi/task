package ru.kharina.study.task10;

public class Task {
    public static void main(String[] args) {
        Robot robot = new Robot(-15,-6, Direction.LEFT);
        Task.method(-8, 0, robot);
    }

    private static void method(int X, int Y, Robot robot) {
        Direction direction = robot.getDirection();
        int i = 0;

        if (robot.getX() < X) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
            while (robot.getX() < X) {
                robot.stepForward();
            }
        } else {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }

            while (robot.getX() > X) {
                robot.stepForward();
            }
        }

        if (robot.getY() < Y) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
            while (robot.getY() < Y) {
                robot.stepForward();
            }
        } else {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
            while (robot.getY() > Y) {
                robot.stepForward();
            }
        }
    }
}
