package com.tincorad.gdxgen.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tincorad.gdxgen.GdxGenGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();


        config.height = 480;
        config.width = 800;

        config.title = "GdxGen ~ (v. 0.1)";

		new LwjglApplication(new GdxGenGame(), config);
	}
}
