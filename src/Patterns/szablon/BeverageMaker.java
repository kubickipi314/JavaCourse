package Patterns.szablon;

abstract class BeverageMaker {
    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water     (common Beverage method)");
    }
    void pourInCup() {
        System.out.println("Pouring into cup  (common Beverage method)");
    }
}
