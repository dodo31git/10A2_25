
package assets.actors;
import assets.GameAsset;
import static java.lang.Math.abs;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Tower2 extends GameAsset{
    static int[][] u = {{500,3,20,2,3,0},{600,3,30,4,4,0},{1000,4,40,5,7,0}};
    int upgradeCost, upgradeCostFlowers, damage, fireRate, range, level, modef;
    static int money = 5000;
    static int flowers = 20;
    static int mango = 2;
    static int i = 0;
    public static ArrayList<Tower2> Towers2 = new ArrayList<>();
    
    public Tower2(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.upgradeCost = 500;
        this.upgradeCostFlowers = 3;
        this.damage = 20;
        this.fireRate = 2;
        this.range = 3;
        this.level = 0;
        this.modef = 0;
        
    }

    public Tower2(int upgradeCost, int upgradeCostFlowers, int damage, int fireRate, int range, int level, int modef, int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.upgradeCost = upgradeCost;
        this.upgradeCostFlowers = upgradeCostFlowers;
        this.damage = damage;
        this.fireRate = fireRate;
        this.range = range;
        this.level = level;
        this.modef = modef;
    }
   
    // prüfen ob sich ein gegner innerhalb der towerrange befindet    
    public boolean Enemyinrange(Tower2 tower){
        boolean g = false;
        for (Enemy e : Enemy.Standard) {
                if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                    g = true;
                }
            }
        for (Enemy e : Enemy.Fast) {
                if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                    g = true;
                }
            }
        for (Enemy e : Enemy.Tank) {
                if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                    g = true;
                }
            }
        return g ;
    }
    //rückgabe der parameter zur gerade der towerschüsse
    public double[] shootfunction (Tower tower, Enemy en){
        double[] f = {0,0,0,0,0,0};
        int x1 = tower.getX();
        int y1 = tower.getY();
        int x2 = en.getX();
        int y2 = en.getY();
        f[0] = (y1-y2)/(x1-x2);
        f[1] = (y1-y2-x2)/(x1-x2)+y2;
        f[2] = x1;
        f[3] = y1;
        f[4] = x2;
        f[5] = y2;
        return f;
    }
    // alle gegner in der range erhalten schaden
    public void shoot (Tower2 tower) {
        if (tower.modef == 0) {
            for (Enemy e : Enemy.Standard) {
                    if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                        e.takeDamage(tower.damage);
                    }
            }
            for (Enemy e : Enemy.Fast) {
                    if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                        e.takeDamage(tower.damage);
                    }
            }
            for (Enemy e : Enemy.Tank) {
                    if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                        e.takeDamage(tower.damage);
                    }
            }
        }
        if (tower.modef == 1 /* & en.freeze == 0 */) {
            for (Enemy e : Enemy.Standard) {
                    if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                        //e.takeDamageandFreeze(tower.damage/5);
                    }
            }
            for (Enemy e : Enemy.Fast) {
                    if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                        //e.takeDamageandFreeze(tower.damage/5);
                    }
            }
            for (Enemy e : Enemy.Tank) {
                    if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                        //e.takeDamageandFreeze(tower.damage/5);
                    }
            }
        }
        if (tower.modef == 1 /* & en.freeze == 1 */) {
            for (Enemy e : Enemy.Standard) {
                    if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                        e.takeDamage(tower.damage);
                    }
            }
            for (Enemy e : Enemy.Fast) {
                    if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                        e.takeDamage(tower.damage);
                    }
            }
            for (Enemy e : Enemy.Tank) {
                    if(abs(e.getX()) <= abs(tower.getX()+tower.range) & abs(e.getY()) <= abs(tower.getY()+tower.range)){
                        e.takeDamage(tower.damage);
                    }
            }
        }
    }
    // upgrade des towers mit überschreiben der parameter
    public void upgrade (Tower2 tower) {
        if (tower.level<=3 & money>tower.upgradeCost & flowers>tower.upgradeCostFlowers) {
            int x = tower.level-1;
            money = money-tower.upgradeCost;
            flowers = flowers-tower.upgradeCostFlowers;
            tower.upgradeCost = u[x][0];
            tower.upgradeCostFlowers = u[x][1];
            tower.damage = u[x][2];
            tower.fireRate = u[x][3];
            tower.range = u[x][4];
            tower.level = tower.level+1;
        }
    }
    // erstellung eines neuen towers beim placen
    static public void place(int x, int y){
        Tower2 k = new Tower2(x, y, null, "2T"+i+"");
        i = i+1;
        Towers2.add(k);
        money = money-u[0][0];
        flowers = flowers-u[0][1];
    }
    
    public void upgradefreeze (Tower2 tower){
        if (mango >= 1) {
            boolean g = false;
            for(Tower2 towers2 : Towers2){
                if (towers2.modef == 1 & abs(towers2.getX()+5) <= abs(tower.getX()+tower.range) & abs(towers2.getY()+5) <= abs(tower.getY()+tower.range)) {
                    g = true;
                }
            }
            if (g == false) {
                tower.modef = 1;
                mango = mango-1;
            }
        }
    }

    public int getUpgradeCost() {
        return upgradeCost;
    }

    public int getUpgradeCostFlowers() {
        return upgradeCostFlowers;
    }

    public int getDamage() {
        return damage;
    }

    public int getFireRate() {
        return fireRate;
    }

    public int getRange() {
        return range;
    }
    
}
