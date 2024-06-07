//Assignment question 
// given an arry of num return true if any value appears at least twice in array 
// and return false if value is distict .

public class revision {
    public static void checkRepeatation(int arr[]) {
        int repetedElement[] = {};
         for(int i=0; i<arr.length; i++) {
              for(int j=0; j<arr.length; j++) {
                 if(i == j) {
                    continue;
                 } else {
                    if (arr[i] == arr[j]) {
                         repetedElement[i] = arr[j];
                    }
                 }

              }
         }
         for(int i=0; i<arr.length; i++) {
                System.out.println(repetedElement[i]);
         }
         
    }
     public static void main(String[] args) {
         int arr[] = {5,7,8,9,6,1,5,5};
          checkRepeatation(arr);
     }
    
} 