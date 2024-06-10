public class selectionSort {
    public static void selection(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minpos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,5,4,0,3,5,6,1,7};

        selection(arr);
    }
}