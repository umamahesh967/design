package com.lowLevelDesign.controlTrafficSystem;

public class DirectionControlPanel extends ControlPanel
{
    public DirectionControlPanel(int direction, Direction name, ControlPanel nextControlPanel, TrafficPanel panel) {
        super(direction, name, nextControlPanel, panel);
    }

    @Override
    public void process(Request request)
    {
        int prevDirection = direction == 1 ? request.total: direction - 1;
        int nextDirection = direction == request.total ? 1: direction + 1;

        if(request.direction == prevDirection && request.color == Color.YELLOW)
        {
            panel.nextState();
        }
        else if(request.direction == direction && request.color == Color.GREEN)
        {
            panel.nextState();
            request.setNextDirection(direction);
            request.setNextColor(Color.YELLOW);
        }
        else if(request.direction == direction && request.color == Color.YELLOW)
        {
            panel.nextState();
            request.setNextDirection(nextDirection);
            request.setNextColor(Color.GREEN);
        }

        if(nextControlPanel != null)
        {
            nextControlPanel.process(request);
        }

    }
}
