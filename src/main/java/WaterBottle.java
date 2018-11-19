public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int drink() {
        if (this.volume >= 10) {
            return this.volume - 10;
        }
        return volume;
    }

    public int empty() {
        return this.volume - this.volume;
    }


    public int fill() {
        return this.volume = 100;
    }

}
