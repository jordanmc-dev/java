import java.util.*;
public class bubbleSort
{
public static void main(String args[])
{
    int[] numArray = {5,6,8,9,5,3,4};
    bubbleSort(numArray);
}       
public static void bubbleSort(int [] numArray)
{
    int n = numArray.length;
    int temp = 0;
    int i,j,k;

    for (i = 0; i < n; i++) 
    {
        for ( j = 1; j < (n - i); j++) 
        {

            if (numArray[j - 1] > numArray[j]) 
            {
                temp = numArray[j - 1];
                numArray[j - 1] = numArray[j];
                numArray[j] = temp;
            }
            for (k=0; k<n; k++) //to show the process of sorting line by line
            {
                System.out.print(numArray[k]);
                System.out.print(' ');
            }
                System.out.println();       
        }  
    }
  System.out.print("Sorted numbers " + Arrays.toString(numArray));
}
}
