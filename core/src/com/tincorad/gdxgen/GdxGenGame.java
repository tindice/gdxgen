package com.tincorad.gdxgen;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.tincorad.gdxgen.actores.Nodo;

public class GdxGenGame extends Game implements InputProcessor {
	SpriteBatch batch;
	Texture img;
    ShapeRenderer sr;

    private Punto p; // p = new Punto(50,50);

    private Nodo n;

    public GdxGenGame() {
        super();
    }

    @Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("logo.png");

        p = new Punto(50,50);
        //sr = new ShapeRenderer();

        n = new Nodo();
        n.getStage().addActor(n);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(.85f, 0.85f, 0.85f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 80, 80);
		batch.end();

        p.dibujar();

        n.act(Gdx.graphics.getDeltaTime());
        n.draw(batch, 1.0f);

	}

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {





        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
