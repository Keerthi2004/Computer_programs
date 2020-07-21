import java.util.Scanner;
public class InsertionSort
{
    static void sort_insertion(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            // Moving elements of arr form index 0 to i-1.
            // Moving only those elements which are greater than key.
            // We are moving them to one position ahead from their current position.
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        InsertionSort.sort_insertion(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}