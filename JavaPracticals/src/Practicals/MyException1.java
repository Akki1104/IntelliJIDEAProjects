package Practicals;
public class MyException1 {
    public static void main(String[] args) {
        int x,y;
        try{
            x=0;
            y=10/x;
            System.out.println("Error in Output");
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
