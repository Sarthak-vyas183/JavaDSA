public class selectionSort {
    public static void selection(int arr[]) {
        int smallest = 0;
        for(int i=0; i<arr.length; i++) {
            
              for(int j=i; j<arr.length; j++) {
                  if(arr[j] < arr[smallest]) {
                    smallest = j;
                  }
                  int temp = arr[smallest];
                  arr[smallest] = arr[0];
                  arr[0] = temp;
                 smallest = 0;
              }
             

        } 
        System.out.println(arr[smallest]);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,5,4,0,3};
         selection(arr);
    }
}
