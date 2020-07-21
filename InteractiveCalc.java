public class InteractiveCalc
{
    double n1,n2,add,subs,quot,prod;
    char c;
    void init(double num1,double num2, char c1)
    {
        n1=num1;
        n2=num2;
        c=c1;
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
    public static void main(double a,double b, char ch)
    {
        InteractiveCalc obj=new InteractiveCalc();
        obj.init(a,b,ch);
        obj.calc();
        obj.display();
    }
}
