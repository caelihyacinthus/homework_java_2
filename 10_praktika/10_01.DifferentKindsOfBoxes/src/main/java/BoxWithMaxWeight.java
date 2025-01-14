import java.util.ArrayList;
import java.util.List;

public class BoxWithMaxWeight extends Box{
    private final int capacity;
    private List<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int currentCapacity = 0;
        for (Item i: items){
            currentCapacity += i.getWeight();
        }
        if (currentCapacity + item.getWeight() <= capacity ){
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
