
public class Main {

    public static void main(String[] args) {
        Box box = new Box(30);

        box.add(new Box(3));
        box.add(new Book("Hello hello", "goodbye bye bye", 1));
        Box pack = new Box(10);
        pack.add(new Book("Hello hello", "goodbye bye bye", 5));
        pack.add(new CD("v", "vv", 2010));
        box.add(pack);

        System.out.println(pack);
        System.out.println(box);
    }

}
