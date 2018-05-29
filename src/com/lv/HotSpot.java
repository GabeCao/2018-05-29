package com.lv;

import java.util.HashMap;
import java.util.Map;

public class HotSpot {
    private double x;
    private double y;
    private int number;
    private Map<String, Integer> stringIntegerMap;

    public HotSpot(double x, double y, int number) {
        this.x = x;
        this.y = y;
        this.number = number;
        this.stringIntegerMap = new HashMap<>();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Map<String, Integer> getStringIntegerMap() {
        return stringIntegerMap;
    }

    public void setStringIntegerMap(Map<String, Integer> stringIntegerMap) {
        this.stringIntegerMap = stringIntegerMap;
    }
}
