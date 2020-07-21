//WAP to calculate the sum and average of the stored numbers on an arrayof type int.
public class Arrays2
{
    public static void main()
    {
        double arr[]=new double[]{24,53,19,78,91};
        double s=0;
        for(int i=0;i<arr.length;i++)
        {
            s=s+arr[i];
        }
        System.out.println("The sum of 24,53,19,78,91 is: "+(int)s);
        double avg=s/arr.length;
        System.out.println("The average of 24,53,19,78,91 is: "+avg);
    }
}