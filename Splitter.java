import java.util.Scanner;
/**
Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays. E.g.-
INITIAL array :
58	24	13	15	63	9	8	81	1	78

After spliting :
58	24	13	15	63
9	8	81	1	78
 */
public class Splitter
{
    void split()
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        int Arr[]=new int[5];
        for (int i=0;i<Arr.length;i++)
        {
            Arr[i]=arr[i];
        }
        int ARR[]=new int[5];
        for (int i=0;i<Arr.length;i++)
        {
            ARR[i]=arr[i];
        }
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+"\n");
        }
        System.out.println("");
        for(int i=0;i<ARR.length;i++)
        {
            System.out.print(ARR[i]+"\n");
        }
    }
}
