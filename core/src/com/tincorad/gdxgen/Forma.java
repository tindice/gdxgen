package com.tincorad.gdxgen;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

/**
 * Created by martin on 03/11/14.
 */
public class Forma {

    Array<Vector2> puntos;

    Color colorBorde = Color.MAGENTA; //Color de borde por defecto

    ShapeRenderer sr;

    public Forma() {

        puntos = new Array<Vector2>();

        sr = new ShapeRenderer();
        sr.setAutoShapeType(true);
        sr.setColor(this.colorBorde);
    }


    public void dibujar(){

        if (puntos.items.length>0){
        if (puntos.items.length>1){

        } else {
            //Un punto solo
            sr.begin(ShapeRenderer.ShapeType.Point);
            sr.point(puntos.items[0].x, puntos.items[0].y, 0f);
            sr.end();
        }


        }

    }

}
