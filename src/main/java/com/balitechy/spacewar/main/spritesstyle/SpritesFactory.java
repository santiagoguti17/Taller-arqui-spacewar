package com.balitechy.spacewar.main.spritesstyle;

import com.balitechy.spacewar.main.SpritesImageLoader;
import com.balitechy.spacewar.main.interfaces.BackgroundGraphic;
import com.balitechy.spacewar.main.interfaces.BulletGraphic;
import com.balitechy.spacewar.main.interfaces.GraphicFactory;
import com.balitechy.spacewar.main.interfaces.PlayerGraphic;

import java.io.IOException;

public class SpritesFactory implements GraphicFactory {
    private final SpritesImageLoader sprites;
    public SpritesFactory() {
        this.sprites = new SpritesImageLoader("/sprites.png");
        try {
            sprites.loadImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PlayerGraphic createPlayer() {
        return new SpritesPlayer(sprites);
    }

    public BulletGraphic createBullet() {
        return new SpritesBullet(sprites);
    }

    public BackgroundGraphic createBackground() throws IOException {
        return new SpritesBackground();
    }
}