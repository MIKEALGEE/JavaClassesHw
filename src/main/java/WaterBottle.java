public class WaterBottle {
private int volume;

public WaterBottle(int volume){
    this.volume = volume;
    }

    public int checkWater(){
        return this.volume;
    }

    public int haveDrink(){
        this.volume = this.volume - 10;
        return this.checkWater();
    }

    public int empty() {
        this.volume = 0;
        return  this.checkWater();
    }

    public int refill() {
        this.volume = 100;
        return this.checkWater();
    }

}
