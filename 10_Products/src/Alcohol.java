public class Alcohol implements Sellable {
    protected double price;//price eur
    private String name;
    protected final double alk;

    public Alcohol(String name, double price, double alk){
        this.name = name;
        this.price = price;
        this.alk = alk;
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

    public double getAlk() {
        return alk;
    }

    @Override
    public double getPriceWithTax() {
        double priceWithTax = price * 1.21;
        if (alk < 15) priceWithTax += 0.89;
        else priceWithTax += 1.26;
        return priceWithTax;
    }
}
