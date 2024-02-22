package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
// import com.mygdx.game.MyGdxGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncherGdxModuleInfoSample {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

		System.out.println("app = " + Gdx.app);
		config.setForegroundFPS(60);
		config.setTitle("SpaceGame");
		new Lwjgl3Application(new GdxModuleInfoSample(), config);

		System.out.println("After app = " + Gdx.app);
	}
}
