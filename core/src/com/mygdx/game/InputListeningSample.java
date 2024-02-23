package com.mygdx.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Logger;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class InputListeningSample implements ApplicationListener, InputProcessor {

	private static final Logger log = new Logger(InputListeningSample.class.getName(), Logger.DEBUG);
	private OrthographicCamera camera;
	private Viewport viewport;
	private SpriteBatch batch;
	private BitmapFont font;

	@Override
	public void create() {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);

		camera = new OrthographicCamera();
		viewport = new FitViewport(1080, 720, camera);
		batch = new SpriteBatch();
		font = new BitmapFont(Gdx.files.internal("fonts/oswald-32.fnt"));
	}

	@Override
	public void resize(int width, int height) {
		viewport.update(width, height, true);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 1.0f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.setProjectionMatrix(camera.combined);
		batch.begin();

		draw();

		batch.end();
	}

	private void draw() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'keyDown'");
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'keyUp'");
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'touchDown'");
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'touchUp'");
	}

	@Override
	public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'touchCancelled'");
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'touchDragged'");
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'mouseMoved'");
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'scrolled'");
	}

}
