package project1.gui;

import project1.data.NewScheduleNode;

public class SolveAlgorithm extends Thread {
    private boolean isChanged = false;
    private boolean isFinished = false;
    private NewScheduleNode[] schedule;
    private int optimalTime;

    @Override
    public void run() {
        // To be replaced with a proper algorithm runner.
    }

    public void changeApplied() {
        isChanged = false;
    }

    public boolean isChanged() {
        return isChanged;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public int getOptimalTime() {
        return optimalTime;
    }

    public NewScheduleNode[] getSchedule() {
        return schedule;
    }
}
