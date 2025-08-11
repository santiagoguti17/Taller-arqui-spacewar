package com.balitechy.spacewar.main.colorfulvectorial;

import com.balitechy.spacewar.main.interfaces.BackgroundGraphic;
import com.balitechy.spacewar.main.interfaces.BulletGraphic;
import com.balitechy.spacewar.main.interfaces.GraphicFactory;
import com.balitechy.spacewar.main.interfaces.PlayerGraphic;

public class ColorfulVectorialFactory implements GraphicFactory {
    public PlayerGraphic createPlayer() {
        return new ColorfulVectorialPlayer();
    }

    public BulletGraphic createBullet() {
        return new ColorfulVectorialBullet();
    }

    public BackgroundGraphic createBackground() {
        return new ColorfulVectorialBackground();
    }
}
