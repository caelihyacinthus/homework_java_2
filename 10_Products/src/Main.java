import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Sellable> items = new ArrayList<>();
        boolean go = true;

        while (go) {
            printMenu();
            int option = Integer.parseInt(scan.nextLine());
            switch (option) {
                case 1:
                    printSellableOptions();
                    option = Integer.parseInt(scan.nextLine());
                    System.out.println("ivesktite produkto tipa");
                    String type = scan.nextLine();
                    System.out.println("iveskite pavadinima");
                    String name = scan.nextLine();
                    System.out.println("iveskite kaina");
                    double price = Double.parseDouble(scan.nextLine());

                    switch (option) {
                        case 1:
                            if (type.equals("vaistai")) {
                                items.add(new Medicine(name, price));
                            } else {
                                items.add(new Product(name, price));
                            }
                            break;
                        case 2:
                            System.out.println("iveskite alk turi");
                            double alk = Double.parseDouble(scan.nextLine());
                            if (type.equals("vynas")) {
                                items.add(new Vine(name, price, alk));
                            } else {
                                items.add(new Alcohol(name, price, alk));
                            }
                            break;
                        default:
                            System.out.println("tokio pasirinkimo nera");
                            break;
                    }
                    break;
                case 2:
                    printProducts(items);
                    break;

                default:
                    go = false;
                    break;
            }
        }
        System.out.println("viso gero");
    }

    private static void printProducts(List<Sellable> items) {
        for (Sellable s : items) {
            System.out.println(s.getName() + "  " + s.getPriceWithTax() + "eur");
        }
    }

    public static void printSellableOptions() {
        System.out.println("-------------------------------");
        System.out.println("1 - produktas");
        System.out.println("2 - alkoholinis gerimas");
        System.out.println("-------------------------------");

    }

    public static void printMenu() {
        System.out.println("-------------------------------");
        System.out.println("0 - iseit");
        System.out.println("1 - ivesti preke");
        System.out.println("2 - perziureti prekes");
        System.out.println("-------------------------------");
    }
}