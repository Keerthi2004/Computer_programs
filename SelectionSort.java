import java.util.Scanner;
public class SelectionSort
{
    static void sort_selection(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            // Assuming minimum index is at 'i' index.
            int minIdx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minIdx])
                {
                    minIdx=j;
                }
            }
            // Swapping elements
            int temp=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;
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
        SelectionSort.sort_selection(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
