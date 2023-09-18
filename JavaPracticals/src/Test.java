public class Test{
    Size pizzaSize;
    public Test(Size pizzaSize){
        this.pizzaSize = pizzaSize;
    }
    public void orderPizza(){
        switch (pizzaSize) {
            case SMALL -> System.out.println("I ordered a small pizza.");
            case MEDIUM -> System.out.println("I ordered a medium pizza.");
            case LARGE -> System.out.println("I ordered a large pizza.");
            case EXTRALARGE -> System.out.println("I ordered a extralarge pizza.");
            default -> System.out.println("I ordered a pizza.");
        }
    }
    public static void main(String[] args) {
        Test t1 = new Test(Size.LARGE);
        t1.orderPizza();
    }
}