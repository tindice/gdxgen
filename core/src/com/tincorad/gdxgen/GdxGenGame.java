package com.tincorad.gdxgen;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.tincorad.gdxgen.actores.Nodo;

public class GdxGenGame extends Game implements InputProcessor {
	SpriteBatch batch;
	Texture img;
    ShapeRenderer sr;

    private Punto p;

    private Nodo n;


    private Stage s;

    public GdxGenGame() {
        super();
    }

    @Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("logo.png");

        s = new Stage();

        p = new Punto(50,50);
        //sr = new ShapeRenderer();

        n = new Nodo(80,80);
        s.addActor(n);

        s.addActor(new Nodo(100, 80, Color.ORANGE));
        s.setDebugAll(true);

        Gdx.input.setInputProcessor(this);

    }

	@Override
	public void render () {
		Gdx.gl.glClearColor(.85f, 0.85f, 0.85f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 80, 80);
		batch.end();

        p.dibujar();

        s.act(Gdx.graphics.getDeltaTime());
        s.draw();

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


        n.addAction(Actions.moveBy(80,80, 0.5f, Interpolation.exp5In));
        //Gdx.app.log("Evento", "Se movio");

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
