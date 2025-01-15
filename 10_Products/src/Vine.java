public class Vine extends Alcohol{
    public Vine(String name, double price, double alk){
        super(name, price, alk);
    }

    @Override
    public double getPriceWithTax() {
        double priceWithTax = price * 1.21;
        if (alk < 8.5) priceWithTax += 0.28;
        else priceWithTax += 0.72;
        return priceWithTax;
    }
}
