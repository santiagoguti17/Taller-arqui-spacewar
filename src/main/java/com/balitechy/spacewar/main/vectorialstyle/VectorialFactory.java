package com.balitechy.spacewar.main.vectorialstyle;

import com.balitechy.spacewar.main.interfaces.BackgroundGraphic;
import com.balitechy.spacewar.main.interfaces.BulletGraphic;
import com.balitechy.spacewar.main.interfaces.GraphicFactory;
import com.balitechy.spacewar.main.interfaces.PlayerGraphic;

public class VectorialFactory implements GraphicFactory {
    public PlayerGraphic createPlayer() {
        return new VectorialPlayer();
    }

    public BulletGraphic createBullet() {
        return new VectorialBullet();
    }

    public BackgroundGraphic createBackground() {
        return new VectorialBackground();
    }
}
