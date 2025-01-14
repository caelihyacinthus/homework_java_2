import java.util.ArrayList;
import java.util.List;

public class OneItemBox extends Box {
    private List<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(items.isEmpty()){
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
