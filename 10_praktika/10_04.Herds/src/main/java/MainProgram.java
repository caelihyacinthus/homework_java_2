public class MainProgram {
    public static void main(String[] args) {
        Herd herd = new Herd(0, 0);

        herd.addToHerd( new Organism(20, 30));
        herd.addToHerd( new Organism(-10, 5));
        herd.addToHerd( new Organism(50, 20));

        System.out.println(herd);
        herd.move(10,10);
        System.out.println(herd);
    }
}
