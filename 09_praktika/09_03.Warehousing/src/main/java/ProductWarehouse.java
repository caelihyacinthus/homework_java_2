public class ProductWarehouse extends Warehouse{
    private String productName;

    public ProductWarehouse(String productName, double amount){
        super(amount);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setName(String productName){
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }


}
