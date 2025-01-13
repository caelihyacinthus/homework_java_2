

public class Main {

    public static void main(String[] args) {
        ProductWarehouseWithHistory juices = new ProductWarehouseWithHistory("juice", 1000, 23);
        juices.addToWarehouse(200);
        juices.addToWarehouse(34);
        juices.takeFromWarehouse(159);
        juices.addToWarehouse(31);
        juices.printAnalysis();
    }

}
