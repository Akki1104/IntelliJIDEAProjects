package Practicals;

import java.io.*;
public class exception{
    public void searching(int []a,int key,int s){
        int i;
        for (i = 0; i < s; i++) {
            if (a[i] == key){
                System.out.println("Element is in the list.");
                break;
            }
        }
        if(i == s){
            throw new ArrayIndexOutOfBoundsException("Element not Found.");
        }
    }

    public void inputs(){
        try {
            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(read);
            System.out.print("Enter size of the array: ");
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            System.out.println("Enter Elements in the list");
            for (int i = 0; i < a.length; i++) {
                System.out.print("Element: ");
                a[i] = Integer.parseInt(br.readLine());
            }
            System.out.print("Enter the element you want to search: ");
            int x = Integer.parseInt(br.readLine());
            searching(a, x, n);
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    public static void main(String[] args) {
        exception ex = new exception();
            ex.inputs();
    }
}

