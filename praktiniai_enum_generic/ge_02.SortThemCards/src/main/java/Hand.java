import java.util.ArrayList;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    public void sort() {
        cards.sort(null);
    }

    public void sortBySuit(){
        cards.sort(new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand){
        return cards.stream().map(Card::getValue).reduce(0, Integer::sum) - hand.cards.stream().map(Card::getValue).reduce(0, Integer::sum);
    }
}
