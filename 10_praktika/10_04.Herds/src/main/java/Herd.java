import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private final List<Movable> movables;

    public Herd(){
        movables = new ArrayList<>();
    }

    public Herd(int x, int y){
        this.movables = new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m: movables){
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder herdPosition = new StringBuilder();
        for (Movable m: movables){
            herdPosition.append(m.toString());
            herdPosition.append('\n');
        }
        return herdPosition.toString();
    }
}
