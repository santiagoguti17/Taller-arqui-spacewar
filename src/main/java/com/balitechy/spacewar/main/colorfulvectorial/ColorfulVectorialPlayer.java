package com.balitechy.spacewar.main.colorfulvectorial;

import com.balitechy.spacewar.main.AbstractVectorial.AbstractVectorialPlayer;

import java.awt.*;

public class ColorfulVectorialPlayer extends AbstractVectorialPlayer {
    @Override
    public void render(Graphics g, double x, double y) {
        g.setColor(Color.RED);
        g.fillPolygon(getXPointsOuter(x), getYPointsOuter(y), 3);
        g.setColor(Color.BLUE);
        g.fillPolygon(getXPointsInner(x), getYPointsInner(y), 3);
    }
}
