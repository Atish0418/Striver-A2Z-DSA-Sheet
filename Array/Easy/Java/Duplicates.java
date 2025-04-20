import java.util.*;

// // Brute Force approach
// public class Duplicates {
//     public static void main(String[] args) {
//         int arr[] = { 1, 1, 2, 2, 2, 3, 3 };

//         Set<Integer> set = new LinkedHashSet<>();
//         for (int i = 0; i < arr.length; i++) {
//             set.add(arr[i]);
//         }

//         // System.out.print(set);

//         int index = 0;
//         for(int i : set){
//             arr[index] = i;
//             index++;
//         }

//         System.out.print("Unique elements : ");
//         for(int i=0; i<index; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//Optimal approach
public class Duplicates {
    public static void main(String[] args) {
      int arr[] = {1,1,2,2,2,3,3};
      
      int i=0, j=1;
      while(j<arr.length){
        if(arr[i] != arr[j]){
          i++;
          arr[i] = arr[j];
        }
        j++;
      }
    
      System.out.print("Unique elements : ");
      for(int k=0; k<i+1; k++){
        System.out.print(arr[k]+" ");
      }
    }
}