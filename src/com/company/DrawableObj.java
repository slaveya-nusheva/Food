package com.company;

import javax.swing.*;

public abstract class DrawableObj {
    private int xCoord, yCoord, width, height;

    public abstract JPanel draw();
}
