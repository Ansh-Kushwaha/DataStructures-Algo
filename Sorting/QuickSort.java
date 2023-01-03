// 1 | QuickSort | 02/01/2023
public class QuickSort {
    public  int partition(int arr[], int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for(int j = low; j <= high - 1; j++) {
            if(arr[j] < pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;
        return (i + 1);
    }

    public void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        QuickSort s = new QuickSort();
        int arr[] = {34, 23, 5, 1, 98, 4};
        s.quickSort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}