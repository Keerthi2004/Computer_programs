public class nested2
{
    /**
       This is a program to print: 
       3
       5  6
       8  9  10
       12 13 14 15*/
    public static void main()
    {
        int x1=3;// copy of x
        for (int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int x=x1;//variable to be printed
                System.out.print(x+"  ");
                x1++;
            }
            System.out.println("");
            x1++;
        }
     }
}