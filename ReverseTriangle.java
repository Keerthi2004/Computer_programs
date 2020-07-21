import java.util.Scanner;
public class ReverseTriangle
{
    public  static void main(String args[])
    {
         int n,c,d,e;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        for (c=1;c<=n;c++)
         {
             for(d=n;d>=c;d--)
              {
                  System.out.print(d+" ");
              }
              System.out.println();
         }
    }
}
