package Practicals;

import java.util.*;

public class Search extends Exception {
    private static int[] arr = {45, 43, 64, 23, 55, 87, 98, 12, 34, 78, 90, 14, 65, 99};

    Search() {
    }
    Search(String str) {
        super(str);
    }
    public static void searchNumber(int x) throws Search {
        int j = 0;
        for (int i : arr) {
            if (i == x)
                break;
            j++;
        }
        if (j == arr.length) {
            throw new Search("Number Not Found in the Array.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter the number want to search: ");
        x = sc.nextInt();
        try {
            searchNumber(x);
            System.out.println("Number Found in the Array.");
        } catch (Search e) {
            e.printStackTrace();
        }
    }
}