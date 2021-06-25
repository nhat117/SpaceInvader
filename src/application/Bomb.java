package application;

import javafx.scene.image.Image;
//Enemy
public class Bomb extends Rocket{
    int speed = (score/5) + 2;

    public Bomb(int posX, int posY, int size, Image img) {
        super(posX, posY, size, img);
    }
    public void update() {
        super.update();
        if(!this.exploding && !this.destroyed) this.posY += this.speed;
        if(this.posY > Spaceinvader.H) this.destroyed = true;
    }
}
