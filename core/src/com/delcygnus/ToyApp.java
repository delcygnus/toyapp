package com.delcygnus;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ToyApp extends ApplicationAdapter {
	SpriteBatch batch;
	Sprite splashSprite;
	Texture splashTexture;
	int orgWidth = 0;
	int orgHeight = 0;
    float elapsedTime = 0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		splashTexture = new Texture( "toy_app_853x853.png" );
		splashSprite = new Sprite( splashTexture );
		splashSprite.setRegion( 0, 0, 853, 426 );
		orgWidth = Gdx.graphics.getWidth();
		orgHeight = Gdx.graphics.getHeight();
		splashSprite.setSize( orgWidth, orgHeight );
	}

	@Override
	public void render () {
        float deltaTime;

        //  Fade-in logic
        if( elapsedTime < 1f )
        {
            //  0.2 extends for 5 seconds
            deltaTime = Gdx.graphics.getDeltaTime();
            elapsedTime += ( deltaTime * 0.2f );
            if( elapsedTime > 1f )
            {
                //  Fully faded-in
                elapsedTime = 1f;
            }
            splashSprite.setAlpha( elapsedTime );
        }
		Gdx.gl.glClearColor(0.3f, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		splashSprite.draw( batch );
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		splashTexture.dispose();
	}
}
