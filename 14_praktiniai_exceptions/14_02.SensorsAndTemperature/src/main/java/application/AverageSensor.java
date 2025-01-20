package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        if (sensors.isEmpty()) return false;
        for (Sensor s: sensors){
            if (!s.isOn()) return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor s: sensors){
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s: sensors){
            s.setOff();
        }
    }

    @Override
    public int read() {
        if (sensors.isEmpty() || !isOn()) throw new IllegalStateException();
        int sum = 0;
        for (Sensor s : sensors){
            sum += s.read();
        }
        int avg = sum / sensors.size();
        readings.add(avg);
        return avg;
    }

    public List<Integer> readings(){
        return readings;
    }

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }
}
