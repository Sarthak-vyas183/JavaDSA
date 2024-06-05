public class subarray {
    public static void subarray(int arr[]) {
        int totalsubarr = 0;
        int sum=0;
        int maxsum = Integer.MIN_VALUE;

        int n = arr.length;
        for(int i=0; i<n; i++) {
               int start = i;
               for(int j=i; j<n; j++) {
                int end = j;
                   for(int k=start; k<=end; k++) {
                    // System.out.print(arr[k]+" ");
                    sum+=arr[k];
                   }
                   System.out.print(sum);
                   if(sum > maxsum) {
                     maxsum = sum;
                   }
                   sum = 0;
                   System.out.println();
                   totalsubarr++;
               }
               System.out.println();
        }
        System.out.println("total sub array : "+ totalsubarr);
        System.out.println("max sum of sub array is "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,-6,7,4,-3};

        subarray(arr);
    }
}