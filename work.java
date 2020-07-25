import java.util.*;
class work
{
    int h,r;
    double wages ;
    void input()
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter numbers of rate per hour and hours");
       r=sc.nextInt();
       h=sc.nextInt();
       
    }
    void calc()
    {
        if(h<=35)
        {
            wages=h*r;
            System.out.println("The weekly wages are"+wages);
        }
        else if(h>35 && h<=60)
        {
            wages=35*r+(h-35)*r*1.5;
            System.out.println("The weekly wages are"+wages);
        } 
        else if(h>60 && h<=70)
        {
            wages=35*r+(25*r*1.5)+(h-60)*2*r;
            System.out.println("The weekly wages are"+wages);
        }
       
        else
        { 
            System.out.println("Not allowed to work more than 70 hours");
        }
        
    }

public static void main()
{
    work obj=new work();
    obj.input();
    obj.calc();
}
}