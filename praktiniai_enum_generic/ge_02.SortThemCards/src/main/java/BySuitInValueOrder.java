import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        int compared = o1.getSuit().compareTo(o2.getSuit());
        if (compared == 0) compared = o1.getValue() - o2.getValue();
        return compared;
    }
}
