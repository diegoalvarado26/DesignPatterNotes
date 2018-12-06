package Visitor;

public class Test {

    public static void main(String[] args){
        TaxVisitor taxCalc = new TaxVisitor();

        Necessity milk = new Necessity(3.52, "Soy Vida");
        Liquor vodka = new Liquor(20.42,"Absolut");
        Tobacco cigars = new Tobacco(10.43, "Lucky Strike");

        System.out.println(milk.accept(taxCalc) + "\n");
        System.out.println(vodka.accept(taxCalc) + "\n");
        System.out.println(cigars.accept(taxCalc) + "\n");

    }
}
