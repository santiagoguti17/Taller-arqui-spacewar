package com.balitechy.spacewar.main;

import com.balitechy.spacewar.main.colorfulvectorial.ColorfulVectorialFactory;
import com.balitechy.spacewar.main.interfaces.GraphicFactory;
import com.balitechy.spacewar.main.spritesstyle.SpritesFactory;
import com.balitechy.spacewar.main.vectorialstyle.VectorialFactory;

public class GameConfig {
    // Cambia esta línea para cambiar el estilo
    private static final GraphicFactory factory = new ColorfulVectorialFactory();

    public static GraphicFactory getFactory() {
        return factory;
    }
}