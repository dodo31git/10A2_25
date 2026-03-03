package assets.actors;

import assets.GameAsset;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import main.Main;
import main.Tiles;
import main.lilC;

public class Enemy extends GameAsset {


static Enemy Enemy;
public static ArrayList<Enemy> Standard = new ArrayList<>();
public static ArrayList<Enemy> Tank = new ArrayList<>();
public static ArrayList<Enemy> Fast = new ArrayList<>();

    int damage, velocity, healthpoints, bounty;
    private int tile;

    public Enemy(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.damage = 10;
        this.velocity = 5;
        this.healthpoints = 100;
        this.bounty = 5;
        this.tile = 3;

    }

    public Enemy(int damage, int velocity, int healthpoints, int bounty, int x, int y, ImageIcon img, String name) {
        super(x,y,img, name);
        this.damage = damage;
        this.velocity = velocity;
        this.healthpoints = healthpoints;
        this.bounty = bounty;
        this.tile = 3;
    }
    
    
    public void update() {
        //Gegner um ein Feld bewegen
        System.out.println("update"+this.getName());
        if (Main.getNextTile(tile) == null) {
        doDamage(damage);    
        }
        else{
        int deltaX = Main.getNextTile(tile).getX();
        int deltaY = Main.getNextTile(tile).getY();

        
        // ToDo 4 Fälle + null
        if (deltaX != getX()) {
            if (deltaX > getX()) {
            this.setX(getX()+1);                
            }
            else{
            this.setX(getX()-1);                
            }
        }
           
        if (deltaY != getY()) {
            if (deltaY > getY()) {
            this.setY(getY()+1);                 
            }
            else{
            this.setY(getY()-1);                
            }            
        }
        
       if (deltaX == getX() && deltaY == getY()) {
           tile = Main.getNextTile(tile).getID();
       }
    }
    }
    public int getDamage() {
        return damage;
    }


    public int getVelocity() {
        return velocity;
    }


    public int getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }
    public void takeDamage(int damage){
    this.healthpoints -= damage;
        if (healthpoints <= 0) {
        this.die();    
        }
    }
    public int die(){
        for (int i = 0; i < Standard.size(); i++) {
            if (Standard.get(i).healthpoints <= 0) {
            Standard.remove(i);
                System.out.println("Standard removed!");
            }    
        }
        for (int i = 0; i < Tank.size(); i++) {
            if (Tank.get(i).healthpoints <= 0) {
            Tank.remove(i);
            }    
        }
        for (int i = 0; i < Fast.size(); i++) {
            if (Fast.get(i).healthpoints <= 0) {
            Fast.remove(i);
            }    
        }        
    
    //Lösch den Enemy
    return bounty;
    }
    public int getBounty() {
        return bounty;
    }
    public int doDamage(int damage){  
    return damage;    
    }
}
