package com.balitechy.spacewar.main.vectorialstyle;

import com.balitechy.spacewar.main.AbstractVectorial.AbstractVectorialPlayer;

import java.awt.*;

public class VectorialPlayer extends AbstractVectorialPlayer {
    @Override
    public void render(Graphics g, double x, double y) {
        g.setColor(Color.BLACK);
        g.drawPolygon(getXPointsOuter(x), getYPointsOuter(y), 3);
        g.drawPolygon(getXPointsInner(x), getYPointsInner(y), 3);
    }
}
