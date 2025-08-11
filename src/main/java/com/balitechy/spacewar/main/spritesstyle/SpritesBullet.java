package com.balitechy.spacewar.main.spritesstyle;

import com.balitechy.spacewar.main.Bullet;
import com.balitechy.spacewar.main.SpritesImageLoader;
import com.balitechy.spacewar.main.interfaces.BulletGraphic;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SpritesBullet implements BulletGraphic {
    private BufferedImage image;

    public SpritesBullet(SpritesImageLoader sprites) {
        image = sprites.getImage(35, 52, Bullet.WIDTH, Bullet.HEIGHT);
    }

    public void render(Graphics g, double x, double y) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}
