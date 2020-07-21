import java.util.Scanner;
public class ScannerInteractiveCalc
{
    double n1,n2,add,subs,quot,prod;
    char c;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        n1= sc.nextDouble();
        System.out.println("Enter second number");
        n2= sc.nextDouble();
        System.out.println("Enter a character");
        c=sc.next().charAt(0);
    }
    void calc()
    {
        add=n1+n2;
        subs=n1-n2;
        quot=n1/n2;
        prod=n1*n2;
    }
     void display()
    {
       if (c=='s')
       {
          System.out.println("Sum = "+add); 
       }
       else if (c=='d')
       {
          System.out.println("Difference = "+subs); 
       }
       else if (c=='m')
       {
          System.out.println("Product = "+prod); 
       }
       else if (c=='q')
       {
          System.out.println("Quotient = "+quot); 
       }
       else
       {
          System.out.println("Sum = "+add);
          System.out.println("Difference = "+subs);
          System.out.println("Product = "+prod);
          System.out.println("Quotient = "+quot);
       }
    }
    public static void main()
    {
        ScannerInteractiveCalc obj=new ScannerInteractiveCalc();
        obj.init();
        obj.calc();
        obj.display();
    }
}