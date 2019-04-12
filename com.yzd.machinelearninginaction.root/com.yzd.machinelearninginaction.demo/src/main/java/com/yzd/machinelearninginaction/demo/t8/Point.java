package com.yzd.machinelearninginaction.demo.t8;

public class Point {
    private long id;
    private double x;
    private double y;
    private String type;

    public Point(long id,double x, double y) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public Point(long id,double x, double y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //get、set方法省略
}
