import java.util.*;
public class index {
    public static int[] update(int marks[]) {
        int newmarks[] = new int[3];
           for(int i=0; i<marks.length; i++) {
               newmarks[i] += marks[i]+1;
           }
        return newmarks;
    }
    public static void main(String[] args) {
        // int arr[] = new int[5];
        int marks[] = {96,78,45};

        for(int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }

      int data[] = update(marks);
        for(int i=0; i<data.length; i++) {
            System.out.println(data[i]);
        }

      
     
    }
}