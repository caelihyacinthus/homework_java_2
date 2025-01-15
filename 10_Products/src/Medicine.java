public class Medicine extends Product{
    public Medicine(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPriceWithTax() {
        return price * 1.09;
    }
}
