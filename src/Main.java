public class Main {
    public static void main(String[] args)
    {
        int[] myArray = {16, 4, 7, 10, 3, 2};
        insertionSortRecursive(myArray, myArray.length);

        for(int i : myArray)
        {
            System.out.print(i + " ");
        }
    }//end main

    static void insertionSortRecursive(int arr[], int n)
    {
        //base case
        if(n <= 1)
        {
            return;
        }
        //sort previous elements recursively
        insertionSortRecursive(arr,n-1);
        //no else needed because "if" had return statement
        //insert last elements at its correct position in the sorted array
        int key = arr[n-1];
        int j = n-2;
        //move element in sorted array that are greater than key one position to the right.
        while(j >= 0 && arr[j] > key)//check out of bounds AND element is less than key
        {
            arr[j+1] = arr[j];
            j--;
        }//end of while
        arr[j+1] = key;
    }//end of recursive method to implement insertion sort

}//end of main class
