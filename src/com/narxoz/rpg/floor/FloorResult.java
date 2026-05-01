package com.narxoz.rpg.floor;

public class FloorResult {

    private boolean success;
    private int reward;
    private String message;

    public FloorResult(boolean success, int reward, String message) {
        this.success = success;
        this.reward = reward;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getReward() {
        return reward;
    }

    public String getMessage() {
        return message;
    }
}