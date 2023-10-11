package Practicals;

import java.util.*;
public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of list: ");
        n = sc.nextInt();
        int []a = new int[n];
        System.out.println("Enter the elements in the list");
        int i;
        for(i = 0; i<n; i++){
            System.out.print("Elements: ");
            a[i] = sc.nextInt();
        }

        System.out.print("List: ");
        for(int j: a)
            System.out.print(j+" ");
        System.out.println();

        System.out.println("How many elements you want to insert in the list? ");
        int x= sc.nextInt();
        System.out.println("From which position you want to insert: ");
        int p = sc.nextInt();

        a = new int[n+x];

        System.out.println("Enter the elements: ");
        for(i = p-1; i<x; i++){
            a[i + x] = a[i];
            a[i] = sc.nextInt();
        }
        for(int j: a)
            System.out.println(j);
    }
}
