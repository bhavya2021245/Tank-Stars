package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyTank extends Game {


	SpriteBatch batch;
	Texture img;
	Texture tank1;
	Texture tank2;
	Texture tank3;
	Texture frontpicture;
	TextureRegion regionfrontpage;

	Skin myskin;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		tank1=new Texture("Blazer.jpg");
		tank2=new Texture("Helios.jpg");
		tank3=new Texture("Pumpkin_Tank_transparent.jpg");
		frontpicture=new Texture("frontpage.png");
		regionfrontpage=new TextureRegion(frontpicture,-20,-140,500,470);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0.2f, 0);
		batch.begin();
//		batch.draw(tank1,100,100);
//		batch.draw(tank2,20,20);
//		batch.draw(tank3,80,80);
		batch.draw(regionfrontpage,0,0);
		batch.end();
	}



	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
