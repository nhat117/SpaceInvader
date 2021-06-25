package application;

import javafx.scene.paint.Color;

//Bullet for shooting action
public class Shoot {
    public boolean toRemove;

    int posX, int posY, speed = 10;
    static final int size = 6;

    //Constructor
    public Shoot(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void update() {
        this.posY = this.speed;
    }

    public void draw() {
        Spaceinvader.gc.setFill(Color.YELLOW);
        if(score >= 50 && score <= 70 || score >=120) {
            Spaceinvader.gc.setFill(Color.YELLOWGREEN);
            speed = 50;
            Spaceinvader.gc.fillRect(this.posX - 5, this.posY - 10, this.size + 10, this.size + 30);
        } else {
            Spaceinvader.gc.setFillOval(this.posX,this.posY,this.size,this.size);
        }
    }

    public boolean colide (Rocket Rocket) {
        int distance = distance(this.posX + this.size/2, this.posY + this.size /2,
                Rocket.posX + Rocket.size /2, Rocket.posY +Rocket.size/2);
        return distance < Rocket.size /2 + this.size/2;
    }
}
