package com.company;

import javax.swing.*;


public abstract class DrawableObj{
    private int xCoord, yCoord, width, height;


    public abstract JPanel draw();

    DrawableObj(int xCoord, int yCoord, int width, int height) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.width = width;
        this.height = height;
    }

    DrawableObj(){
        this.xCoord = -1;
        this.yCoord = -1;
        this.width = 200;
        this.height = 200;
    }
}
