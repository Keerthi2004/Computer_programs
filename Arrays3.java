import java.util.Scanner;
import java.util.Arrays;
//WAP to sort the a numeric array and a string array.
public class Arrays3
{
    int a,b,c,d,e;
    String s1,s2,s3,s4,s5,s6;
    int arr[];
    String[] Arr;
   void init()
   {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter five numbers for numeric array-arr[]");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        System.out.println("Enter 5 strings for String array-Arr[]");
        s1=sc.nextLine();
        s2=sc.nextLine();
        s3=sc.nextLine();
        s4=sc.nextLine();
        s5=sc.nextLine();
        s6=sc.nextLine();
   }
   void something()
   {
        arr=new int[]{a,b,c,d,e};
        Arr=new String[]{s1,s2,s3,s4,s5,s6};
        Arrays.sort(arr);
        Arrays.sort(Arr);
   }
   void somethingElse()
   {
        System.out.println("Modified arr[]: "+Arrays.toString(arr));
        System.out.println("Modified Arr[]: "+Arrays.toString(Arr));
   }
   public static void main()
   {
        Arrays3 obj=new Arrays3();
        obj.init();
        obj.something();
        obj.somethingElse();
   }
}