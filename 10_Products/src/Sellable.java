public interface Sellable {
    String getName();
    void setName(String name);
    void setPrice(double price);
    double getPriceWithTax();
}
