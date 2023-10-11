package Practicals;

import java.util.*;
public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Enter row of the first matrix: ");
        m = sc.nextInt();
        System.out.print("Enter column of the first matrix: ");
        n = sc.nextInt();
        int [][]a = new int[m][n];
        int i,j;
        System.out.println("Enter elements in the first matrix");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print("Enter element: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int x,y;
        System.out.print("Enter row of the second matrix: ");
        x = sc.nextInt();
        System.out.print("Enter column of the second matrix: ");
        y = sc.nextInt();
        int [][]b = new int[x][y];
        System.out.println("Enter elements in the second matrix");
        for(i=0;i<x;i++){
            for(j=0;j<y;j++){
                System.out.print("Enter element: ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(i=0;i<x;i++){
            for(j=0;j<y;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        if(n==x){
            int [][]c = new int [n][x];
            int k,s;
            for(i=0;i<n;i++){
                for (j=0;j<x;j++){
                    s=0;
                    for(k=0;k<n;k++){
                        s=s+(a[i][k]*b[k][j]);
                    }
                    c[i][j]=s;
                }
            }
            System.out.println("Multiplied Matrix: ");
            for(i = 0; i < n; i++) {
                for (j = 0; j < x; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Matrices cannot be multiplied.");
        }
    }
}
