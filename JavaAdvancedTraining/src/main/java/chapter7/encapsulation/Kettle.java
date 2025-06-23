package chapter7.encapsulation;

public class Kettle {
    private boolean waterBoiling = false;
    private boolean heatSensorOn = false;

    public void switchOn(){
        if (isThereWater()){
            accessElectricity();
            heatUpSensor();
            if (isWaterBoiling()){
                switchOff();
            }
        }
    }

    public void switchOff(){
        heatSensorOn = false;
    }

    public void putWater(){
        waterBoiling = true;
    }

    private void heatUpSensor(){
        heatSensorOn = true;
    }

    private boolean isWaterBoiling(){
        return waterBoiling;
    }
    private void accessElectricity(){}

    private boolean isThereWater(){
        return false;
    }

}
