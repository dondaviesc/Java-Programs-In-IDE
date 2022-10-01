package SamplePrograms;

import java.util.Scanner;

public class reverseNum {
    private static Scanner sc;

    public static void main(String[] args) {
        int i = 0, n, c = 0;
        sc = new Scanner(System.in);

        System.out.println("Enter the limit :");
        n = sc.nextInt();

     /*   while(n>0)
        {

            c = n % 10;
            i= i+c;
            i=i*10;
            n = n / 10;

        }2345678


      */
        while (n > 0) {
            System.out.print(n % 10);
            n = n / 10;
        }
    }
}

