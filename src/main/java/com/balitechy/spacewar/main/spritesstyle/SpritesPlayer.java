package com.balitechy.spacewar.main.spritesstyle;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.Player;
import com.balitechy.spacewar.main.SpritesImageLoader;
import com.balitechy.spacewar.main.interfaces.PlayerGraphic;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SpritesPlayer implements PlayerGraphic {
    private BufferedImage image;

    public SpritesPlayer(SpritesImageLoader sprites) {
        image = sprites.getImage(219, 304, Player.WIDTH, Player.HEIGHT);

    }

    public void render(Graphics g, double x, double y) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}
