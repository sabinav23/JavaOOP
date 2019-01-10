package model;

public class SamsungGalaxyS9 extends Samsung{

    private int batteryLife;


    public SamsungGalaxyS9(Use use,int batteryLife) {
        super(use);
        this.batteryLife = batteryLife;
    }

    @Override
    public void decreaseBatteryLife(int hours) {
        this.batteryLife -= hours;
    }

    @Override
    public int getBatteryLife() {
        return(this.batteryLife);
    }


}
