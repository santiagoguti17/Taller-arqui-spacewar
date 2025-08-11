package com.balitechy.spacewar.main.colorfulvectorial;

import com.balitechy.spacewar.main.AbstractVectorial.AbstractVectorialBackground;

import java.awt.*;

public class ColorfulVectorialBackground extends AbstractVectorialBackground {
    @Override
    protected Color getBackgroundColor() {
        return Color.BLUE;
    }

    @Override
    protected Color getCircleColor() {
        return Color.GREEN;
    }

    @Override
    protected boolean isFilledCircle() {
        return true;
    }
}
