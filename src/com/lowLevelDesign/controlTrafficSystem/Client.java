package com.lowLevelDesign.controlTrafficSystem;

public class Client
{
    public static void main(String[] args)
    {
        ControlPanel controlPanel = createChain();
        Request request = new Request(1, Color.GREEN, 3);

        controlPanel.process(request);
        request.color = request.nextColor;
        request.direction = request.nextDirection;

        controlPanel.process(request);
        request.color = request.nextColor;
        request.direction = request.nextDirection;
    }

    public static ControlPanel createChain()
    {
        ControlPanel south = new DirectionControlPanel(3, Direction.SOUTH, null, new TrafficPanel());

        ControlPanel east = new DirectionControlPanel(2, Direction.EAST, south, new TrafficPanel());

        ControlPanel north = new DirectionControlPanel(1, Direction.NORTH, east, new TrafficPanel());

        return north;
    }
}
