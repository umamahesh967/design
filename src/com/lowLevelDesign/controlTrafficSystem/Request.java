package com.lowLevelDesign.controlTrafficSystem;

public class Request
{
    int direction;

    Color color;

    int total;

    int nextDirection;

    Color nextColor;

    public Request(int direction, Color color, int total) {
        this.direction = direction;
        this.color = color;
        this.total = total;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNextDirection() {
        return nextDirection;
    }

    public void setNextDirection(int nextDirection) {
        this.nextDirection = nextDirection;
    }

    public Color getNextColor() {
        return nextColor;
    }

    public void setNextColor(Color nextColor) {
        this.nextColor = nextColor;
    }
}
