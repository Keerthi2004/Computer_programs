import java.util.Scanner;
/**
 this is a program to print the fibonacci series using reccursive method
 */
public class Recursive1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<=n;i++)
        {
            System.out.print(fibo(i)+",");
        }
    }
    static int fibo(int n)
    {
        if(n<=0)
        return 0;
        if(n==1)
        return 1;
        return fibo(n-1)+fibo(n-2);
    }
}