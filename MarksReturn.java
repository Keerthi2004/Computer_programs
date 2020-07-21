public class MarksReturn
{
     double p ,c , m , Avg;
     void init()
     {
         p=78;
         c=75;
         m=80;
     }
     double calc()
     {
         Avg= (p+c+m)/3;
         return Avg;
     }
     public static void main()
     {
         MarksReturn obj=new MarksReturn();
         obj.init();
         double result=obj.calc();
         System.out.println(result);
     }
}