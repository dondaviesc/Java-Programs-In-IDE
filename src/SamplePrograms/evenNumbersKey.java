package SamplePrograms;
import java.util.Scanner;

public class evenNumbersKey {
    private static Scanner sc;
    public static void main(String[] args) {
        int i,n;
        sc= new Scanner(System.in);

        System.out.println("Enter the limit :");
        n= sc.nextInt();

        for (i=0;i<=n;i++)
        {

            if (i%2==0)
            {
                System.out.println(i);
            }
        }

    }
}
