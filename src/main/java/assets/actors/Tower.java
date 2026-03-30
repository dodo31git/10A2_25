
package assets.actors;
import assets.GameAsset;
import static java.lang.Math.abs;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import gamelogic.Ticks;
import main.Tiles;
public class Tower extends GameAsset {
    
    Enemy enemy = Enemy.Enemy;
    static int[][] u = {{500,3,20,2,3,0},{600,3,30,4,4,0},{1000,4,40,5,7,0}};
    int upgradeCost, upgradeCostFlowers, damage, fireRate, range, level, modef;
    static int money = 5000;
    static int flowers = 20;
    static int mango = 2;
    static int i = 0;
    public static ArrayList<Tower> Towers1 = new ArrayList<>();
    
    public Tower(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.upgradeCost = 500;
        this.upgradeCostFlowers = 3;
        this.damage = 20;
        this.fireRate = 2;
        this.range = 3;
        this.level = 0;
        this.modef = 0;
        
    }

    public Tower(int upgradeCost, int upgradeCostFlowers, int damage, int fireRate, int range, int level, int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.upgradeCost = upgradeCost;
        this.upgradeCostFlowers = upgradeCostFlowers;
        this.damage = damage;
        this.fireRate = fireRate;
        this.range = range;
        this.level = level;
    }
    // prüfen ob gegner innerhalb der towerrange existieren
    public boolean Enemyinrange(Tower tower){
        boolean g = false;
        // verschiedene
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
    // prüfen ob sich ein bestimmtes tile innerhalb der towerrange befindet
    public boolean tileinrange(Tiles tile, Tower tower){
        boolean g = false;
        if(abs(tile.getX()+5) <= abs(tower.getX()+tower.range) & abs(tile.getY()+5) <= abs(tower.getY()+tower.range)){
            g = true;
        }
        return g;
    }
    // den gegner innerhalb der towerrange finden der auf dem weg am weitesten fortgeschritten ist
    public Enemy farestEnemy(Tower tower){
        Enemy en = enemy;
        int c = 0;
        boolean g = false;
        Tiles a = null;
        ArrayList<Enemy> b = new ArrayList<>();
        // tiles vom größten zum kleinsten index durchgehen
        for (int j = 0; j < 87; j++) {
            for (int k = 0; k < 10; k++) {
                for (int l = 0; l < 10; l++) {
                    if (main.Main.lilM[k][l].id == 89-j) {
                        a = main.Main.lilM[k][l];
                        if (a.id == c & tileinrange(a,tower)) {
                            int xt = a.getX();
                            int yt = a.getY();
                            // für ermitteltes teil alle dort befindlichen gegner suchen
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
        // einen der gegener auf dem feld auswählen
        for (Enemy e : b) {
            if (e.getHealthpoints()>c){
                c = e.getHealthpoints();
                en = e;
            }
        }
        return en;
    }
    // parameter für gerade der towerschüsse finden
    public double[] shootfunction (Tower tower){
        double[] f = {0,0,0,0,0,0};
        int x1 = tower.getX();
        int y1 = tower.getY();
        int x2 = farestEnemy(tower).getX();
        int y2 = farestEnemy(tower).getY();
        f[0] = (y1-y2)/(x1-x2);
        f[1] = (y1-y2-x2)/(x1-x2)+y2;
        f[2] = x1;
        f[3] = y1;
        f[4] = x2;
        f[5] = y2;
        return f;
    }
    // tower die gegner beschädigen lassen
    public void shoot (Tower tower) {
        Enemy en = farestEnemy(tower);
        if (Enemyinrange(tower) & tower.modef == 0) {
            en.takeDamage(tower.damage);
        }
        if (Enemyinrange(tower) & tower.modef == 1 /* & en.freeze == 0 */) {
            //en.takeDmageandFreeze(tower.damage/5);
        }
        if(Enemyinrange(tower) & tower.modef == 1 /* & en.freeze != 0*/){
            en.takeDamage(tower.damage);
        }
    }
    
    
    // erstellen eines neuen towers beim placen
    static public void place (int x, int y){
        Tower k = new Tower(x, y, null, "T"+i+"");
        i = i+1;
        Towers1.add(k);
        money = money-u[0][0];
        flowers = flowers-u[0][1];
    }
    // upgraden der tower mit überschreiben der parameter
    public void upgrade (Tower tower) {
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
    
    public void upgradefreeze (Tower tower){
        if (mango >= 1) {
            boolean g = false;
            for(Tower towers1 : Towers1){
                if (towers1.modef == 1 & abs(towers1.getX()+5) <= abs(tower.getX()+tower.range) & abs(towers1.getY()+5) <= abs(tower.getY()+tower.range)) {
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
