public class AreaReturn
{
    int length, breadth, area;
    void init()
    {
     length=10;
     breadth=20;
    }
    int calc()
    {
     area = length*breadth; 
     return area;
    }   
    public static void main()
    {
     AreaReturn obj=new AreaReturn();
     obj.init();
     int result=obj.calc();
     System.out.println(result);
    }
}
