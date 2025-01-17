public class Program {

    public static void main(String[] args) {
        Hideout<Integer> hideout = new Hideout<>();
        System.out.println(hideout.isInHideout());
        hideout.putIntoHideout(3);
        System.out.println(hideout.isInHideout());
        System.out.println(hideout.takeFromHideout());
        System.out.println(hideout.isInHideout());
    }
}
