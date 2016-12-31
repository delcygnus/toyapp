package com.delcygnus.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.delcygnus.ToyApp;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Toy App";
		config.height = 720;
		config.width = 1280;
		new LwjglApplication(new ToyApp(), config);
	}
}
