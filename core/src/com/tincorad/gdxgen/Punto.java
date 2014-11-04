package com.tincorad.gdxgen;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by martin on 03/11/14.
 */
public class Punto extends Forma {


    private Vector2 posicion = new Vector2(0,0);

    public Punto(float x, float y){
        super();

        this.posicion.x = x;
        this.posicion.y = y;

        //this.puntos.add(new Vector2(x,y));
    }

    @Override
    public void dibujar() {

        sr.begin();

            sr.set(ShapeType.Filled);
            sr.rect(this.posicion.x - 2, this.posicion.y - 2, 4, 4);
        sr.end();

    }
}
