// import java.util.*;

// public class MoveZero {
//     public static void main(String[] args) {
//         int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

//         int[] temp = new int[arr.length];
//         int index = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 temp[index] = arr[i];
//                 index++;
//             }
//         }

//         for (int i = 0; i < index; i++) {
//             arr[i] = temp[i];
//         }

//         int nz = index;
//         for (int i = nz; i < arr.length; i++) {
//             arr[i] = 0;
//         }

//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

// Optimal Approach

public class MoveZero{
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5,1};

        int j = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                 j = i;
                 break;
            }
        }

        for(int i=j+1; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
