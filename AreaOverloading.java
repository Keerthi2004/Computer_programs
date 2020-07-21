public class AreaOverloading
{
  void area(float side)    
  {
    double SqArea=Math.pow(side,2); 
    System.out.println(SqArea);
  }
  void area(double len, double breadth)
  {
    double RectArea=len*breadth; 
    System.out.println(RectArea);
  }
  void area (double radius)
  {
    double CircArea=3.14*Math.pow(radius,2);
    System.out.println(CircArea);
  }
  public static void main()
  {
    AreaOverloading obj=new AreaOverloading();
    obj.area(20.0f);
    obj.area(20.0,40.0);
    obj.area(10.5);
  }
}
