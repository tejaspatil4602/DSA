class QuickSort{
    public void quickSort(int[] arr , int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low,pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);     
        }
         

    }
    private int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i<j) {
            while (i <= high-1 && arr[i] <= pivot) {
                i++;
                
            }
             while (j > low+1 && arr[j] > pivot) {
                j--;
                
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void main(String[] args) {
        
    }
    
}