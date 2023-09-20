import java.util.*;
public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of the array: ");
        n = sc.nextInt();
        int []a= new int[n];
        int i,j;
        System.out.println("Enter the elements in the array");
        for (i = 0; i < n; i++){
            System.out.print("Enter Elements: ");
            a[i]=sc.nextInt();
        }

        System.out.println("Array: ");
        for (int k: a) {
            System.out.print(k+" ");
        }
        int temp;
        for (i = 0; i < n; i++){
            for(j = 0; j < n-i-1; j++){
                if(a[j+1] < a[j]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("\n" + "Sorted Array: ");
        for (int k: a) {
            System.out.print(k+" ");
        }
    }
}
