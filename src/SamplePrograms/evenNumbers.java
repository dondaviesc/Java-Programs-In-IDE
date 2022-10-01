package SamplePrograms;

public class evenNumbers {
    public static void main(String[] args) {
        int n = 15;
        int i;
        System.out.println("Even numbers are:");
        for (i=0;i<=n;i++)
        {

            if (i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
