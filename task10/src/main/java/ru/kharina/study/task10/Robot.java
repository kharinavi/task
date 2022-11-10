package ru.kharina.study.task10;


public class Robot {
    private int X;
    private int Y;
    private Direction direction;
    // состояние робота (х, у, Direction)

    public Robot(int X, int Y, Direction direction) {
        this.X = X;
        this.Y = Y;
        this.direction = direction;
    }

    public Direction getDirection() {
        // текущее направление взгляда
        return direction;
    }

    public int getX() {
        // текущая координата X
        return X;
    }

    public int getY() {
        // текущая координата Y
        return Y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (direction) {
            case UP:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
        }
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (direction) {
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        switch (direction) {
            case UP:
                Y += 1;
                break;
            case RIGHT:
                X += 1;
                break;
            case DOWN:
                Y -= 1;
                break;
            case LEFT:
                X -= 1;
                break;
        }
    }
}
