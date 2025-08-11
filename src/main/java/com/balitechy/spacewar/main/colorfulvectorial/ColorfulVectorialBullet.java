package com.balitechy.spacewar.main.colorfulvectorial;

import com.balitechy.spacewar.main.AbstractVectorial.AbstractVectorialBullet;

import java.awt.*;

public class ColorfulVectorialBullet extends AbstractVectorialBullet {
    @Override
    protected Color getBulletColor() {
        return Color.RED;
    }
}
