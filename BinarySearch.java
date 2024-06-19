import java.util.*;
public class BinarySearch {

    public static int binarySearch(int arr[],int target){

        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(target>arr[m]){
            s=m+1;
        }

        else if(target<arr[m]){
            e=m-1;
        }
        else{
        return m;
        }
    }

    return -1;
}

    public static int binaryCeiling(int arr[],int target){ 
        int s=0;
        int e=arr.length-1;
        int m=s+(e-s)/2;
        
        while(s<=e){
             m=s+(e-s)/2;
            if(target<arr[m]){
                e=m-1;
            }
            else if(target>arr[m]){
                s=m+1;
            }
            else{
                return m;
            }
        }

        return arr[s]; 
    }
    public static int binaryFloor(int arr[],int target){ 
        int s=0;
        int e=arr.length-1;
        int m=s+(e-s)/2;
        
        while(s<=e){
             m=s+(e-s)/2;
            if(target<arr[m]){
                e=m-1;
            }
            else if(target>arr[m]){
                s=m+1;
            }
            else{
                return m;
            }
        }

        return arr[e]; 
    }
    public static void main(String[] args) {

        int[] arr ={-19,-18,0,1,2,3,4,56,78,90};
        int ans = binarySearch(arr, 45);
        int and = binaryCeiling(arr, 55);

        System.out.println(and);
        
    }
}