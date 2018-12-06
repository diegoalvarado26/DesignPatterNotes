package Visitor;

public class Tobacco implements Visitable {

    public Tobacco(double price, String manufacturer){
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

