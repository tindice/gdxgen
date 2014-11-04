package com.tincorad.gdxgen.actores;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by martin on 03/11/14.
 */
public class Nodo extends Actor {

    public Nodo() {

        this.setPosition(100,100);
        this.setSize(4,4);
        this.setColor(Color.GREEN);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
    }
}
