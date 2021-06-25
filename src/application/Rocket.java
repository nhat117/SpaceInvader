package application;

import javafx.scene.image.Image;

public class Rocket {
    private int posX, posY, size;
    boolean exploding, destroyed;
    Image img;
    int explosionStep = 0;

    //Constructor
    public Rocket(int posX, int posY, int size, Image img) {
        this.posX = posX;
        this.posY = posY;
        this.size = size;
        this.img = img;
    }

    public Shoot shoot() {
        return new Shoot(posX + size /2 -Shoot.size /2, posY - Shoot.size);
    }

    public void update() {
        if (exploding) explosionStep ++;
        destroyed = explosionStep > Spaceinvader.explosionSteps;
    }

    public void draw() {
        if(exploding) {
            Spaceinvader.gc.drawImage(Spaceinvader.explosionImage, explosionStep % Spaceinvader.explosionCol * Spaceinvader.explosionW,
                    (explosionStep / Spaceinvader.explosionRow) * Spaceinvader.explosionH + 1,
                    Spaceinvader.explosionW, Spaceinvader.explosionH,this.posX,this.posY, this.size,this.size);
        } else {
            Spaceinvader.gc.drawImage(this.img, this.posX, this.posY,this.size,this.size);
        }
    }

    public boolean colide(Rocket other) {
        //TODO: Declare distance methode
        int d = distance(this.posX + this.size /2, this.posY + this.size/2,
                other.posX + other.size/2, other.posY + other.size/2);
        return d < other.size/2 + this.size/2;
    }
    public void explode() {
        this.exploding = true;
        this.explosionStep = -1;
    }
}
