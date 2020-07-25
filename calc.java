import java .util.*;
class calc
{
    void calc1()
    {
        System.out.println("1.Addition \n 2.Subtraction\n 3.Division \n 4.Multiplication");
         Scanner sc=new Scanner(System.in);
     System.out.println("enter your choice");
    int ch = sc.nextInt();
System.out.println("enter any  two number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c;

 
    switch (ch)
    {
        
        case 1: 
        
            c=a+b; 
            System.out.println(c);
        break;
        case 2:
        
            c=a-b;
        System.out.println(c);
        break;
        
        case 3:
        c=a/b;
        System.out.println(c);
        break;
        
        case 4:
        c= a*b;
        System.out.println(c);
        break ;
        
        default:
        System.out.println("invalid");
        break;
    }
}
public static void  main(String args[])
{
     
    calc ob=new calc();

    
     ob .calc1();
}
}