
public class ArrayReverse {
    public static void main(String[] args) {
        //new change
        int[] arr = {5,6,7,8};
        int j = arr.length;
        for(int i : arr){
            
            System.out.println(arr[j-1]);
            j--;
        }
        
        System.out.println("for loop");
        
        
        for(int i = arr.length;i>0;i--){
            System.out.println(arr[i-1]);
        
        }   
    }
}
