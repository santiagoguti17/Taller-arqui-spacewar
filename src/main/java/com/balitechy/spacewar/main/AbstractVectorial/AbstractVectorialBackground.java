package com.balitechy.spacewar.main.AbstractVectorial;

import com.balitechy.spacewar.main.interfaces.BackgroundGraphic;
import java.awt.*;

public abstract class AbstractVectorialBackground implements BackgroundGraphic {

    protected abstract Color getBackgroundColor();
    protected abstract Color getCircleColor();
    protected abstract boolean isFilledCircle();

    @Override
    public void render(Graphics g, Canvas c) {
        g.setColor(getBackgroundColor());
        g.fillRect(0, 0, c.getWidth(), c.getHeight());

        g.setColor(getCircleColor());
        int diameter = 150;
        if (isFilledCircle()) {
            g.fillOval(10, 10, diameter, diameter);
        } else {
            g.drawOval(10, 10, diameter, diameter);
        }
    }
}
