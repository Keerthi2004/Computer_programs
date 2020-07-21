 class AreaWithOBJ
{
    int length, breadth, area;
    void init()
    {
     length=10;
     breadth=20;
    }
    void calc()
    {
     area = length*breadth;   
    }
    void display()
    {
     System.out.println(area);
    }
    public static void main()
    {
         AreaWithOBJ obj=new AreaWithOBJ();
         obj.init();
         obj.calc();
         obj.display();
    }
}