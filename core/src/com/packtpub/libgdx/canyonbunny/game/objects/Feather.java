package com.packtpub.libgdx.canyonbunny.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.packtpub.libgdx.canyonbunny.game.Assets;

/**
 * Author: Kirill Bogdanov
 * Created on 17.10.2016.
 */
public class Feather extends AbstractGameObject {
    private TextureRegion regFeather;
    public boolean collected;

    public Feather() {
        init();
    }

    private void init() {
        dimension.set(0.5f, 0.5f);
        regFeather = Assets.instance.feather.feather;
        // Set bounding box for collision detection
        bounds.set(0, 0, dimension.x, dimension.y);
        collected = false;
    }

    public void render(SpriteBatch batch) {
        if (collected) return;
        TextureRegion reg = regFeather;
        batch.draw(reg.getTexture(),
                position.x, position.y,
                origin.x, origin.y,
                dimension.x, dimension.y,
                scale.x, scale.y,
                rotation,
                reg.getRegionX(), reg.getRegionY(),
                reg.getRegionWidth(), reg.getRegionHeight(),
                false, false);
    }

    public int getScore() {
        return 250;
    }
}
