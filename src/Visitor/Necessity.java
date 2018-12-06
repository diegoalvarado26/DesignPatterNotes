package Visitor;

public class Necessity implements Visitable{

    public Necessity(double price, String manufacturer){
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

