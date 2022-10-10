package com.example.bomberman.entities.Character;

import com.example.bomberman.entities.Entity;
import javafx.scene.image.Image;

public class Doll extends Character {
    public Doll(int x, int y, Image img) {
        super(x, y, img);
    }

    @Override
    public void update() {

    }

    @Override
    public void handleMove() {

    }

    @Override
    public boolean canMove(int x, int y) {
        return false;
    }

    @Override
    public boolean isColliding(Entity other) {
        return false;
    }
}
