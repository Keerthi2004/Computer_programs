public class NumericTriangle
{
   public static void main()
   {
      int c,d,num=1,n;
      for (c = 1 ; c <= 5 ; c++)
      {
         for ( d = c; (d <= c)&&(d>=1);--d )
         {
            System.out.print(d+" ");
         }
         System.out.println();
      }
   }
}