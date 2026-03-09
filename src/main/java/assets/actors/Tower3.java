
package assets.actors;
import assets.GameAsset;
import gamelogic.Map;
import static java.lang.Math.abs;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import main.Tiles;

public class Tower3 extends GameAsset{
    Enemy enemy = Enemy.Enemy;
    static int[][] u = {{500,3,20,2,3},{600,3,30,4,4},{1000,4,40,5,7}};
    int upgradeCost, upgradeCostFlowers, damage, fireRate, range, level;
    static int money = 5000;
    static int flowers = 20;
    static int i = 0;
    public static ArrayList<Tower3> Towers3 = new ArrayList<>();
    
    public Tower3(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.upgradeCost = 500;
        this.upgradeCostFlowers = 3;
        this.damage = 20;
        this.fireRate = 2;
        this.range = 3;
        this.level = 0;
        
    }

    public Tower3(int upgradeCost, int upgradeCostFlowers, int damage, int fireRate, int range, int level, int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.upgradeCost = upgradeCost;
        this.upgradeCostFlowers = upgradeCostFlowers;
        this.damage = damage;
        this.fireRate = fireRate;
        this.range = range;
        this.level = level;
    }

    public boolean Enemyinrange(Tower3 tower){
        boolean g = false;
        for (Enemy e : Enemy.Standard) {
                if(abs(e.getX()+5) <= abs(tower.getX()+tower.range) & abs(e.getY()+5) <= abs(tower.getY()+tower.range)){
                    g = true;
                }
            }
        for (Enemy e : Enemy.Fast) {
                if(abs(e.getX()+5) <= abs(tower.getX()+tower.range) & abs(e.getY()+5) <= abs(tower.getY()+tower.range)){
                    g = true;
                }
            }
        for (Enemy e : Enemy.Tank) {
                if(abs(e.getX()+5) <= abs(tower.getX()+tower.range) & abs(e.getY()+5) <= abs(tower.getY()+tower.range)){
                    g = true;
                }
            }
        return g ;
    }
    
    
    public boolean tileinrange(Tiles tile, Tower3 tower){
        boolean g = false;
        if(abs(tile.getX()+5) <= abs(tower.getX()+tower.range) & abs(tile.getY()+5) <= abs(tower.getY()+tower.range)){
            g = true;
        }
        return g;
    }
    
    public ArrayList farestEnemys(Tower3 tower){
        Enemy en = enemy;
        int c = 0;
        boolean g = false;
        Tiles a = null;
        ArrayList<Enemy> b = new ArrayList<>();
        for (int j = 0; j < 87; j++) {
            c = 89-j;
            for (int k = 0; k < 10; k++) {
                for (int l = 0; l < 10; l++) {
                    if (true) {
                        a = main.Main.lilM[k][l];
                        if (a.id == c & tileinrange(a,tower)) {
                            int xt = a.getX();
                            int yt = a.getY();
                            for (Enemy e : Enemy.Standard) {
                                if (e.getX()==xt & e.getY()==yt ) {
                                    b.add(e);
                                    g = true;
                                }
                            }
                            for (Enemy e : Enemy.Standard) {
                                if (e.getX()==xt & e.getY()==yt ) {
                                    b.add(e);
                                    g = true;
                                }
                            }
                            for (Enemy e : Enemy.Standard) {
                                if (e.getX()==xt & e.getY()==yt ) {
                                    b.add(e);
                                    g = true;
                                }
                            }
                            if (g) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return b;
    }
    
    
    
    public void shoot (Tower3 tower) {
        ArrayList<Enemy> b = farestEnemys(tower);
        for (Enemy e : b) {
            e.healthpoints = e.healthpoints - tower.damage;
        }
    }
    
    public void upgrade (Tower3 tower) {
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

    static public void place(int x, int y){
        Tower3 k = new Tower3(x, y, null, "3T"+i+"");
        i = i+1;
        Towers3.add(k);
        money = money-u[0][0];
        flowers = flowers-u[0][1];
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
