package com.balitechy.spacewar.main.spritesstyle;

import com.balitechy.spacewar.main.SpritesImageLoader;
import com.balitechy.spacewar.main.interfaces.BackgroundGraphic;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpritesBackground implements BackgroundGraphic {
    private BufferedImage background;

    public SpritesBackground() throws IOException {
        SpritesImageLoader bg = new SpritesImageLoader("/bg.png");
        bg.loadImage();
        background = bg.getImage(0, 0, 640, 480);
    }

    public void render(Graphics g, Canvas c) {
        g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
    }
}
