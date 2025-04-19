public class SortedRotated{

    public static boolean isSorted(int arr[]){
        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int next = arr[(i+1)%arr.length];
            if(arr[i] > next){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};

        System.out.println(isSorted(arr));
    }
}