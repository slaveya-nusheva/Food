package com.company;

import javax.swing.*;


public abstract class DrawableObj{
    private int xCoord, yCoord, width, height;


    public abstract JPanel draw();

    public DrawableObj(int xCoord, int yCoord, int width, int height) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.width = width;
        this.height = height;
    }

    public DrawableObj(){

    }
}
