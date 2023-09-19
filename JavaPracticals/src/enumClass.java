import java.util.*;
enum enumSize{
    SMALL("The Pizza size is small."),
    MEDIUM("The Pizza Size is medium."),
    LARGE("The Pizza size is large."),
    EXTRALARGE("This Pizza size is extralarge.");

    private final String pizzaSize;
    private  enumSize(String pizzaSize){
        this.pizzaSize = pizzaSize;
    }

    public String getSize(){
        return pizzaSize;
    }
}
public class enumClass {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        s = sc.nextLine();
        enumSize size = enumSize.valueOf(s.toUpperCase());
        System.out.println(size.getSize());
    }
}
