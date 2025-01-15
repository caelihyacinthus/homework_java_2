public class Product implements Sellable{
    protected double price;//price eur
    private String name;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPriceWithTax() {
        return price*1.21;
    }
}
