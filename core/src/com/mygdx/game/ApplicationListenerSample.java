package com.mygdx.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Logger;

public class ApplicationListenerSample implements ApplicationListener{

	private static final Logger log = new Logger(ApplicationListenerSample.class.getName(), Logger.DEBUG);

	private boolean renderInterrupted = true;
	@Override
	public void create() {
		// Used to initialize game and load resources
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		log.debug("create()");
	}

	@Override
	public void resize(int width, int height) {
		// Used to handle a new screen size
		log.debug("resize() width = " + width + " height = " + height);
	}

	@Override
	public void render() {
		// Used to render the game elements called 60 times per second
		throw new UnsupportedOperationException("Unimplemented method 'render'");
	}

	@Override
	public void pause() {
		// used to save game state when it loses focus, which doesn't involv the actual game play being paused unless the develp wants it to puase
		if(renderInterrupted) {
			log.debug("render()");
			renderInterrupted = false;
		}
	}

	@Override
	public void resume() {
		// used to handle the game coming back from being pused and restores game state

	}

	@Override
	public void dispose() {
		// used t free resources and cleanup

	}

}
