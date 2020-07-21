public class Offers
{
    double cost,discount,total;
    String gift;
    void init(double billCost)
    {
        cost=billCost;
    }
    void calc()
    {
        if (cost<=2000)
        {
             discount= (cost*5)/100;
             total= cost-discount;
             gift="Sketch pens";
        }
        else if((cost>=2000)&&(cost<=3500))
        {
             discount=  (cost*8)/100;
             total= cost-discount;
             gift="Watch";
        }
        else if((cost>=3500)&&(cost<=5000))
        {
            discount=  (cost*12)/100;
            total=  cost-discount;
            gift="Backpack";
        }
        else if((cost>=5000)&&(cost<=7000))
        {
            discount=  (cost*18)/100;
            total=   cost-discount;
            gift="Shoes";
        }
        else if((cost>7000)&&(cost<=10000))
        {
            discount=   (cost*22)/100;
            total=    cost-discount;
            gift="Shopping Coupons";
        }
        else
        {
            discount=   (cost*25)/100;
            total=    cost-discount;
            gift="1 Month Golf Memberships";
        }
    }
    void display()
    {
        System.out.println("Your initial bill was"+cost);
        System.out.println("Your discount on your bill is "+discount+" and your discounted bill is "+total+".");    
        System.out.println("Your gift is "+gift);
    }
    public static void main(double c)
    {
        Offers obj=new Offers();
        obj.init(c);
        obj.calc();
        obj.display();
    } 
}
    

