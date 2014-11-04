package com.tincorad.gdxgen.actores;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by martin on 03/11/14.
 */
public class Nodo extends Actor {

    private static int TAMANO = 8;

    public Nodo(float posicionX, float posicionY, Color color) {

        this.setPosition(posicionX, posicionY);
        this.setSize(TAMANO,TAMANO);
        this.setColor(color);

    }
    public Nodo(float posicionX, float posicionY) {
        this(posicionX, posicionY, Color.GREEN);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);

        //batch.get
    }
}
