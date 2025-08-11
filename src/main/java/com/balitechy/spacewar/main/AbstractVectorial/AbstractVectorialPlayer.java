package com.balitechy.spacewar.main.AbstractVectorial;

import com.balitechy.spacewar.main.Player;
import com.balitechy.spacewar.main.interfaces.PlayerGraphic;

import java.awt.*;

public abstract class AbstractVectorialPlayer implements PlayerGraphic {

    protected int[] getXPointsOuter(double x) {
        return new int[]{
                (int) x + Player.WIDTH / 4,
                (int) x + Player.WIDTH / 2,
                (int) x + Player.WIDTH - Player.WIDTH / 4
        };
    }

    protected int[] getYPointsOuter(double y) {
        int lengthFactor = 10;
        return new int[]{
                (int) y + Player.HEIGHT + lengthFactor,
                (int) y - lengthFactor,
                (int) y + Player.HEIGHT + lengthFactor
        };
    }

    protected int[] getXPointsInner(double x) {
        return new int[]{
                (int) x + Player.WIDTH / 3,
                (int) x + Player.WIDTH / 2,
                (int) x + Player.WIDTH - Player.WIDTH / 3
        };
    }

    protected int[] getYPointsInner(double y) {
        int lengthFactor = 10;
        int shrinkFactor = 4;
        return new int[]{
                (int) y + Player.HEIGHT - Player.HEIGHT / shrinkFactor + lengthFactor / 2,
                (int) y + Player.HEIGHT / shrinkFactor - lengthFactor / 2,
                (int) y + Player.HEIGHT - Player.HEIGHT / shrinkFactor + lengthFactor / 2
        };
    }

    @Override
    public abstract void render(Graphics g, double x, double y);
}
