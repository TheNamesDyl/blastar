package me.dylanburton.blastarreborn.enemies;

import android.graphics.Bitmap;

/**
 * Created by Dylan on 7/19/2017.
 */

public class Battleship extends Enemy {

    public Battleship(Bitmap shipBitmap){
        //calls main Enemy constructor
        super(shipBitmap, EnemyType.BATTLESHIP);
        setAIDisabled(true);

    }



}