import java.util.Scanner;
public class DuckNumberSc
{
     int rem,n,temp,Count=0;
     void init()
     {
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         temp=n;
     }
     void calc()
     {
         while(temp>0)
         {
             rem=temp%10;
             if(rem==0)
             {
                 Count++;
             }
             temp=temp/10;
         }
     }
     void display()
     {
         if (Count>0)
         {
             System.out.println("It is a Duck Number");
         }
         else
         {
             System.out.println("It is not a Duck Number");
         }
     }
     public static void main()
     {
         DuckNumberSc obj=new DuckNumberSc();
         obj.init();
         obj.calc();
         obj.display();
     }
}