// import java.util.*;
// public class Test2{
//     public static void main(String[] args) {
//         int marks[]=new int[5];
//         // int numbers[] = {1,2,3};
//         // int moreNumbers[] = {4,5,6};
//         // String fruits[] = {"apple","mango","orange"};

//         // System.out.println(marks[0]);
//         // System.out.println(numbers[0]);
//         // System.out.println(moreNumbers[0]);
//         // System.out.println(fruits[0]);

//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<marks.length;i++){

//             marks[i]=sc.nextInt();
//         }
        
//         for(int i=0;i<marks.length;i++){
            
//             System.out.print(marks[i]+" ");
//         }
        
//         sc.close();
//     }
// }


import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int key = scanner.nextInt();
        for(int i=0;i<n;i++){
            if(key==arr[i]){
                System.out.println("Key found at index: "+i);
                break;
            }
            else{
                System.out.println("Key not found!");
            }
        }
        scanner.close();
    } 
}