package com.balitechy.spacewar.main;

import com.balitechy.spacewar.main.colorfulvectorial.ColorfulVectorialFactory;
import com.balitechy.spacewar.main.interfaces.GraphicFactory;
import com.balitechy.spacewar.main.spritesstyle.SpritesFactory;
import com.balitechy.spacewar.main.vectorialstyle.VectorialFactory;

public class GameConfig {
    private static GraphicFactory factory;

    public static void setFactory(GraphicFactory f) {
        factory = f;
    }

    public static GraphicFactory getFactory() {
        return factory;
    }
}