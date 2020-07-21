public class InterestReturn
{
   double p, r, t, I;
    void init()
    {
       p=2000.0;
       r=2.5;
       t=5.0;
    }
    double calc()
    {
        I= (p*r*t)/100.0;
        return I;
    }
    public static void main()
    {
        InterestReturn obj=new InterestReturn();
        obj.init();
        double result=obj.calc();
        System.out.println(result);
    }
}
