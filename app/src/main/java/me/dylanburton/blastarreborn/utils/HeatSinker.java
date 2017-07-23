package me.dylanburton.blastarreborn.utils;

/**
 * Created by Dylan on 7/19/2017.
 */

public class HeatSinker {
    private int currentPlayershipLocationX;
    private int currentPlayershipLocationY;
    private float x;
    private float y;
    private float dx;
    private float dy;


    public void HeatSink() {
    }

    //surprisingly simple. Thanks basic geometry
    public void updateHeatsink(float x, float y, float cpx, float cpy) {
        cpy = cpy - y;
        cpx = cpx - x;

        //slows dividing by 50 makes sure the ship doesnt teleport instantly to the ships coordinates
        dy = cpy/200;
        dx = cpx/200;

    }


    public float getDx() {
        return dx;
    }

    public void setDx(float dx) {
        this.dx = dx;
    }

    public float getDy() {
        return dy;
    }

    public void setDy(float dy) {
        this.dy = dy;
    }


}