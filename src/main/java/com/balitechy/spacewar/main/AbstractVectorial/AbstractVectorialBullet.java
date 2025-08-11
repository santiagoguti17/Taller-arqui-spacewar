package com.balitechy.spacewar.main.AbstractVectorial;

import com.balitechy.spacewar.main.Bullet;
import com.balitechy.spacewar.main.interfaces.BulletGraphic;

import java.awt.*;

public abstract class AbstractVectorialBullet implements BulletGraphic {

    protected abstract Color getBulletColor();
    
    @Override
    public void render(Graphics g, double x, double y) {
        g.setColor(getBulletColor());
        g.fillOval((int) x, (int) y, Bullet.WIDTH / 3, Bullet.HEIGHT);
    }
}
