// Author : Ansh Kushwaha

package Sorting;

public class Test {
    public static void main(String[] args) {
    	// BubbleSort s = new BubbleSort();
    	// InsertionSort s = new InsertionSort();
    	// SelectionSort s = new SelectionSort();
        // QuickSort s = new QuickSort();
    	// MergeSort s = new MergeSort();
    	HeapSort s = new HeapSort();
    	
        int arr[] = {34, 26, 5, 2, 100, 4};
        
        s.heapSort(arr, arr.length);
        
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
