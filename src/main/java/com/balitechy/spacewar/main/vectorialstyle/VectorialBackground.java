package com.balitechy.spacewar.main.vectorialstyle;

import com.balitechy.spacewar.main.AbstractVectorial.AbstractVectorialBackground;

import java.awt.*;

public class VectorialBackground extends AbstractVectorialBackground {
    @Override
    protected Color getBackgroundColor() {
        return Color.WHITE;
    }

    @Override
    protected Color getCircleColor() {
        return Color.BLACK;
    }

    @Override
    protected boolean isFilledCircle() {
        return false;
    }
}
