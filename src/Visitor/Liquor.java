package Visitor;

public class Liquor implements Visitable {

    public Liquor(double price, String manufacturer){
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public double price;
    public String manufacturer;

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
