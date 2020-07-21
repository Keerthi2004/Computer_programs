public class Interest
{
    double p, r, t, I;
    void init()
    {
       p=2000.0;
       r=2.5;
       t=5.0;
    }
    void calc()
    {
        I= (p*r*t)/100.0;  
    }
    void display()
    {
       System.out.println(I);   
    }
}