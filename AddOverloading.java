public class AddOverloading
{
   double n1,n2,sum;
   void add(int num1,int num2)
   {
     n1=num1;
     n2=num2;
   }
   void add()
   {
     sum=n1+n2;
     System.out.println(sum);
   }
   public static void main()
   {
     AddOverloading obj=new AddOverloading();
     obj.add(4,8);
     obj.add();
   }
}
