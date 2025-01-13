import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history = new ArrayList<>();

    public ChangeHistory() {
    }

    public void add(double status){
        history.add(status);
    }

    public void clear(){
        history.clear();
    }

    public String toString(){
        return history.toString();
    }

    public double maxValue(){
        if (history.isEmpty()){
            return 0;
        }
        double maxValue = history.get(0);
        for (double h: history){
            if (h > maxValue) maxValue = h;
        }
        return maxValue;
    }

    public double minValue(){
        if (history.isEmpty()){
            return 0;
        }
        double minValue = history.get(0);
        for (double h: history){
            if (h < minValue) minValue = h;
        }
        return minValue;
    }

    public double average(){
        if (history.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (double h: history){
            sum += h;
        }
        return sum/history.size();
    }
}
