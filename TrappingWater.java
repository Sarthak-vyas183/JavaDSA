public class TrappingWater {
    public static int waterLevel(int arr[]) {
        //create a new array to store the value of max element of left
        int left_max[] = new int[arr.length];
        left_max[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            left_max[i] = Math.max(arr[i] , left_max[i-1]);
        }

        // create a new array to store the value of max element of right
        int right_max[] = new int[arr.length];
        right_max[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--) {
            right_max[i] = Math.max(arr[i], right_max[i+1]);
        }

        //find the value of trapped water (w-x) * 1 //(waterlevel - barheight)*width
        int TrappingWater = 0;
        for(int i=0; i<arr.length; i++) {
            int waterLevel = Math.min(left_max[i], right_max[i]);
              TrappingWater += (waterLevel - arr[i]) * 1;
        }

        return TrappingWater;

    }
    public static void main(String[] args) {
         int arr[] = {4,2,0,6,3,2,5};
         int ans = waterLevel(arr);
         System.out.println(ans);
    }
}