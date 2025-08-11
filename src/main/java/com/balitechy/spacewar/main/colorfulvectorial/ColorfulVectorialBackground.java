package com.balitechy.spacewar.main.colorfulvectorial;

import com.balitechy.spacewar.main.AbstractVectorial.AbstractVectorialBackground;

import java.awt.*;

public class ColorfulVectorialBackground extends AbstractVectorialBackground {
    @Override
    protected Color getBackgroundColor() {
        return Color.CYAN;
    }

    @Override
    protected Color getCircleColor() {
        return Color.ORANGE;
    }

    @Override
    protected boolean isFilledCircle() {
        return true;
    }
}
