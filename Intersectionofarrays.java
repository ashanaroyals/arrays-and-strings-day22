import java.util.Scanner;
import java.util.Arrays;

class Intersectionofarrays
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0; i < n1; i++)
        {
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++)
        {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while(i < n1 && j < n2)
        {
            if(arr1[i] == arr2[j])
            {
                System.out.print(arr1[i] + " ");
                int val = arr1[i];

                while(i < n1 && arr1[i] == val) i++;
                while(j < n2 && arr2[j] == val) j++;
            }
            else if(arr1[i] < arr2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
    }
}