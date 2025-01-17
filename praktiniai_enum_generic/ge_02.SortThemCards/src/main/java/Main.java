

public class Main {

    public static void main(String[] args) {
        // test your code here
        Hand hand = new Hand();

        hand.add(new Card(14, Suit.CLUB));
        hand.add(new Card(6, Suit.SPADE));
        hand.add(new Card(5, Suit.HEART));
        hand.add(new Card(14, Suit.HEART));
        hand.add(new Card(11, Suit.SPADE));
        hand.add(new Card(2, Suit.HEART));

        hand.sortBySuit();
        hand.print();
    }
}
