package com.balitechy.spacewar.main.interfaces;

import java.io.IOException;

public interface GraphicFactory {
    PlayerGraphic createPlayer();
    BulletGraphic createBullet();
    BackgroundGraphic createBackground() throws IOException;
}
