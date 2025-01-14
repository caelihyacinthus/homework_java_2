import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {
    private List<Packable> items;
    private double capacity;

    public Box(double capacity){
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public void add(Packable item){
        if (item.weight() + weight() <= capacity){
            items.add(item);
        }
    }

    @Override
    public double weight(){
        double weight= 0;
        for (Packable i: items){
            weight += i.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
