public class MarksWithOBJ
{
         double p ,c , m , Avg;
     void init()
     {
         p=78;
         c=75;
         m=80;
     }
     void calc()
     {
             Avg= (p+c+m)/3;
     }
     void display()
     {
         System.out.println(Avg);    
     }
     public static void main()
     {
         MarksWithOBJ obj=new MarksWithOBJ();
         obj.init();
         obj.calc();
         obj.display();
     }
}
