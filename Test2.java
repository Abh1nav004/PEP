import java.util.*;
public class Test2 {
    public static boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                for(int k=2;k<arr.length-i;k++){
                    if((arr[k]%2!=0 && arr[j]%2!=0 && arr[i]%2!=0) || (arr[i]==1 && arr[j]==1 && arr[k]==1)){
                        return true;
                    }
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1};

        System.out.println(threeConsecutiveOdds(arr));
    }
}