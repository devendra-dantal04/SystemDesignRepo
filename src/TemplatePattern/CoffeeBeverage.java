package TemplatePattern;

public class CoffeeBeverage extends Beverage{
    @Override
    public void brew() {
        System.out.println("Adding Coffee powder");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding a Little Sugar");
    }
}
