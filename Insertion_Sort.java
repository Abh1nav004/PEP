import java.util.*;
public class Insertion_Sort {

    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first] = arr[last];
        arr[last]=temp;
    }

    public static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
         int[] arr ={9,7,2,6,1,3,7,2};
        insertion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
