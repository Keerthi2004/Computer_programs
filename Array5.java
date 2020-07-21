import java.util.Scanner;
// Program to print the no. of time a word is repeated in a string.
/*Example :
 * input1="I saw a saw in a saw."
 * input2="saw"
 * Output=3
*/
public class Array5
{
    String str,s;
    String[] arr;
    int count=1;
    void check()
    {
        Scanner sc= new Scanner(System.in);
        int count=0;
        while(true)
        {
            str=sc.next();
            if(str.equals("saw"))
            {
                count= count+1;
            }
            if(str.equals("."))
            break;
        }
        System.out.println(count);
    }
    public static void main()   
    {
        Array5 obj=new Array5();
        obj.check();
    }
}