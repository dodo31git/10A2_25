
package gamelogic;


public class Shop {
    
    int money, flowers;

    public Shop(int money, int flowers) {
        this.money = money;
        this.flowers = flowers;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getFlowers() {
        return flowers;
    }

    public void setFlowers(int flowers) {
        this.flowers = flowers;
    }
    
}
