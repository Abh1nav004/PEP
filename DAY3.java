//Subarrays 

// import java.util.*;
// public class DAY3 {
//     public static void main(String[] args) {
//         int arr[] = {2,4,6,8,10};
//         for(int k=0;k<5;k++){
//             for(int i=k;i<5;i++){   
//                 for(int j=k;j<=i;j++){
//                 System.out.print(arr[j]+" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }

// }


//Recursion

// import java.util.*;

// public class DAY3 {
//     static int Sum(int n){
//         if(n==1){
//             return 1;
//         }
    
//         int temp = Sum(n-1);
//         return temp+n;
//     }
//     public static void main(String[] args) {
//         System.out.println(Sum(5));
//     }
// }

// import java.util.*;
// public class DAY3 {
//     public static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         return fact(n-1)*n;
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         System.out.println("Factorial of "+ n +" is "+fact(n));
//         scanner.close();
//     }
// }

//Fibbonaci

// import java.util.*;
// public class DAY3 {

//     public static int Fibo(int n){
//         if(n==0){
//             return 0;
//         }
//         if(n==1){
//             return 1;
//         }
//         int temp=Fibo(n-2);
//         return temp+Fibo(n-1);
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         System.out.println("Fibonacci's series "+n+"th number is "+Fibo(n));
//     }
// }



//numbers printing

import java.util.*;
public class DAY3 {
    public static void Num(int n){
        if(n==0){
            return;
        }
            Num(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();

        Num(n);

        scanner.close();
       

    }
}


