 public class nested1
{
    /**This is a program to print.
       11111
       2222
       333
       44
       5
    */
    public static void main()
    {
        int x1=1;
        for (int i=5;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                int x = x1;
                System.out.print(x);
            }
            System.out.println("");
            x1++;
        }
    }
}