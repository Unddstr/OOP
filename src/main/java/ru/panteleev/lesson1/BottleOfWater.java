package ru.panteleev.lesson1;

public class BottleOfWater extends Product {
    private int volume;
    public BottleOfWater(String name, double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + super.getName() + '\'' +
                "volume='" + this.volume + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }
}
