package TemplatePattern;

abstract class Beverage {
    public void prepareBeverage() {
        this.pourWater();
        this.brew();
        this.pourMilk();
        this.addCondiments();
    }

    abstract public void brew();
    abstract public void addCondiments();

    public void pourWater() {
        System.out.println("Pourning Hot Water in a cup");
    }

    public void pourMilk() {
        System.out.println("Pourning Milk in a cup");
    }
}
