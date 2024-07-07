import java.util.*;
public class Selection_Sort {

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last); 
        }
    }

    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first] = arr[last];
        arr[last]=temp;
    }

    private static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if( arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr ={9,7,2,6,1,3,7,2};
        selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}