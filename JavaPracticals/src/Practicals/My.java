package Practicals;

public class My {
    void sum(){
        int x = 20, y = 80;
        System.out.println("Sum of "+x+" & "+y+" = "+(x+y));
    }
    void sum(int x, int y){
        System.out.println("Sum of "+x+" & "+y+" = "+(x+y));
    }
    void sum(int x, float y){
        System.out.println("Sum of "+x+" & "+y+" = "+(x+y));
    }
}

class MainClass{
    public static void main(String[] args) {
        My obj = new My();
        obj.sum();
        obj.sum(10,30);
        obj.sum(40,50.50f);
    }
}