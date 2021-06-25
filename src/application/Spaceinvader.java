package application;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Spaceinvader extends Application {
    //Variable
    private static final Random RAND = new Random();
    private static final int W  = 800;
    private static final int H = 600;
    private static final int pSize = H/10;

    //Get the require Image resource
    static final Image pImage = new Image("img/player.png");
    static final Image explosionImage = new Image("img/explosion.png");
    //Setup Explosion img
    static final int explosionW = 128;
    static final int explosionRow = 3;
    static final int explosionCol = 3;
    static final int explosionH = explosionW;
    static final int explosionSteps = 15;
    //Setup enemy image

    final int MAX_BOMB = 10, MAX_SHOTS = MAX_BOMB * 2;
    boolean gameOver = false;
    private GraphicsContext gc;
    //Setup resource
    Rocket player;
    List<Shot> shots;
    List<Bomb> bomb;
    List<Universe> univ;
    private static ArrayList <Image> bombImage;
    //Load array list
    @Override
    public void start(Stage stage) throws Exception {

    }

    private void loadResource() {
        for (int i = 1; i < 11; i ++) {
            bombImage.add(new Image("img/" + i +".png"));
        }
    }
}
