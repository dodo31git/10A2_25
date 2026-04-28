
package gamelogic;
import assets.actors.Enemy;
import java.awt.event.*;
import assets.actors.Tower;
import assets.actors.Tower2;
import assets.actors.Tower3;
import static java.lang.Math.abs;

public class Mouse {
    boolean placingopen1 = false;
    boolean placingopen2 = false;
    boolean placingopen3 = false;
    boolean upgradeopen = false;
    boolean upgradefreeze = false;
    int tol = 50;
    public void mouseClicked(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        if(x>=1390 & x<=1665 & y>=870 & y<=1030){
            upgradeopen = true;
        }
        if(x>=1645 & x<=1920 & y>=870 & y<=1030){
            upgradeopen = true;
        }
        // bei anklicken im shop placing für towertype 1 öffnen
        if(x>=1340 & x<= 1640 & y>=350 & y<=645){
            placingopen1 = true;
        }
        // bei anklicken im shop placing für towertype 2 öffnen
        if(x>=1510 & x<=1810 & y>=350 & y<=645){
            placingopen2 = true;
        }
        // bei anklicken im shop placing für towertype 3 öffnen
        if(x>=1680 & x<=1980 & y>=350 & y<=645){
            placingopen3 = true;
        }
        if(upgradeopen){
            for (Tower t : Tower.Towers1) {
                // anklicken eines towers mit gewisser toleranzschwelle
                if(Math.sqrt((x-t.getX()) * (x-t.getX()) + (y-t.getY()) * (y-t.getY())) <= tol){
                    t.upgrade(t);
                    upgradeopen = false;
                }
            }
            for (Tower2 t : Tower2.Towers2) {
                if(Math.sqrt((x-t.getX()) * (x-t.getX()) + (y-t.getY()) * (y-t.getY())) <= tol){
                    t.upgrade(t);
                }
            }
            for (Tower3 t : Tower3.Towers3) {
                if(Math.sqrt((x-t.getX()) * (x-t.getX()) + (y-t.getY()) * (y-t.getY())) <= tol){
                    t.upgrade(t);
                }
            }
        }
        
        if(upgradefreeze){
            for (Tower t : Tower.Towers1) {
                // anklicken eines towers mit gewisser toleranzschwelle
                if(Math.sqrt((x-t.getX()) * (x-t.getX()) + (y-t.getY()) * (y-t.getY())) <= tol){
                    t.upgradefreeze(t);
                    upgradeopen = false;
                }
            }
            for (Tower2 t : Tower2.Towers2) {
                if(Math.sqrt((x-t.getX()) * (x-t.getX()) + (y-t.getY()) * (y-t.getY())) <= tol){
                    t.upgradefreeze(t);
                }
            }
            for (Tower3 t : Tower3.Towers3) {
                if(Math.sqrt((x-t.getX()) * (x-t.getX()) + (y-t.getY()) * (y-t.getY())) <= tol){
                    t.upgradefreeze(t);
                }
            }
        }
        
        
        // klickoptionen innerhalb des placingmenüs
        if(placingopen1){
            if(x>=0 & x<=1400 & y>=0 & y<=1080){
                main.Tiles t = null;
                for (int i = 0; i < 35; i++) {
                    for (int j = 0; j < 25; j++) {
                        t = main.Main.lilM[i][j];
                        if (x>=t.getX()-40 & x<=t.getX() & y>=t.getY()-40 & y<=t.getY()) {
                            if (t.isIsPlaceble()) {
                                Tower.place(x,y);
                            }
                        }
                    }
                }
            }
        }
        if(placingopen2){
            if(x>=0 & x<=1400 & y>=0 & y<=1080){
                main.Tiles t = null;
                for (int i = 0; i < 35; i++) {
                    for (int j = 0; j < 25; j++) {
                        t = main.Main.lilM[i][j];
                        if (x>=t.getX()-40 & x<=t.getX() & y>=t.getY()-40 & y<=t.getY()) {
                            if (t.isIsPlaceble()) {
                                Tower2.place(x,y);
                            }
                        }
                    }
                }
            }
        }
        if(placingopen3){
            if(x>=0 & x<=1400 & y>=0 & y<=1080){
                main.Tiles t = null;
                for (int i = 0; i < 35; i++) {
                    for (int j = 0; j < 25; j++) {
                        t = main.Main.lilM[i][j];
                        if (x>=t.getX()-40 & x<=t.getX() & y>=t.getY()-40 & y<=t.getY()) {
                            if (t.isIsPlaceble()) {
                                Tower3.place(x,y);
                            }
                        }
                    }
                }
            }
        }
        
    }
}
