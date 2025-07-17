package TemplatePattern;

public class TeaBeverage extends Beverage{
    @Override
    public void brew() {
        System.out.println("Adding tea powder");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
