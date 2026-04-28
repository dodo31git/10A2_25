
package gamelogic;
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
    public void mouseClicked(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        if(x>=400 & x<=500 & y>=100 & y<=200){
            upgradeopen = true;
            // überliegende grafik
        }
        if(x>=400 & x<=500 & y>=100 & y<=200){
            placingopen1 = true;
            // überliegende Grafik
        }
        if(x>=400 & x<=500 & y>=100 & y<=200){
            placingopen2 = true;
            // überliegende Grafik
        }
        if(x>=400 & x<=500 & y>=100 & y<=200){
            placingopen3 = true;
            //überliegende Grafik
        }
        if(upgradeopen){
            for (Tower t : Tower.Towers1) {
                if(abs(t.getX()+5) <= abs(x) & abs(t.getY()+5) <= abs(y)){
                    t.upgrade(t);
                    upgradeopen = false;
                    // (überliegende Grafik entfernen)
                }
            }
            for (Tower2 t : Tower2.Towers2) {
                if(abs(t.getX()+5) <= abs(x) & abs(t.getY()+5) <= abs(y)){
                    t.upgrade(t);
                    // (überliegende Grafik entfernen)
                }
            }
            for (Tower3 t : Tower3.Towers3) {
                if(abs(t.getX()+5) <= abs(x) & abs(t.getY()+5) <= abs(y)){
                    t.upgrade(t);
                    // (überliegende Grafik entfernen)
                }
            }
        }
        if(placingopen1){
            if(x>=400 & x<=500 & y>=100 & y<=200){
                //placing page schließen
                placingopen1 = false;
            }
            if(x>=400 & x<=500 & y>=100 & y<=200){
               Tower.place(x,y);
            }
        }
        if(placingopen2){
            if(x>=400 & x<=500 & y>=100 & y<=200){
                //placing page schließen
                placingopen2 = false;
            }
            if(x>=400 & x<=500 & y>=100 & y<=200){
               Tower2.place(x,y);
            }
        }
        if(placingopen3){
            if(x>=400 & x<=500 & y>=100 & y<=200){
                //placing page schließen
                placingopen3 = false;
            }
            if(x>=400 & x<=500 & y>=100 & y<=200){
               Tower3.place(x,y);
            }
        }
        
    }
}
