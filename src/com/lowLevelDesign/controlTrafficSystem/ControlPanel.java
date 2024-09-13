package com.lowLevelDesign.controlTrafficSystem;

public abstract class ControlPanel
{

    int direction;

    Direction name;

    ControlPanel nextControlPanel;

    TrafficPanel panel;

    public ControlPanel(int direction, Direction name, ControlPanel nextControlPanel, TrafficPanel panel) {
        this.direction = direction;
        this.name = name;
        this.nextControlPanel = nextControlPanel;
        this.panel = panel;
    }

    public void setNextControlPanel(ControlPanel nextControlPanel) {
        this.nextControlPanel = nextControlPanel;
    }

    public abstract void process(Request request);
}
