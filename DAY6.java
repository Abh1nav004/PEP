
// import java.util.*;
// public class DAY6 {

//     public static void stockSpan(int stocks[],int span[]){
//         // for(int i=0;i<stocks.length;i++){
//         //     int count=0;
//         //     for(int j=i;j>=0;j--){
//         //         if(stocks[i]>=stocks[j]){
//         //             count++;
//         //         }
//         //         else{
//         //             break;
//         //         }
//         //     }
//         //     span[i]=count;
             
//         //  }

//         Stack <Integer> st = new Stack<>();
//         st.push(0);
//         span[0]=1;

//         for(int i=1;i<stocks.length;i++){
//             int currPrice = stocks[i];
//             while (!st.isEmpty() && currPrice>=stocks[st.peek()]) {
//                 st.pop();
//             }
//             if(st.isEmpty()){
//                 span[i]=i+1;
//             }
//             else{
//                 int prevHigh = st.peek();
//                 span[i] = i-prevHigh;
//             }

//             st.push(i);
//         }



//     }
//     public static void main(String[] args) {

//         int stocks[] = {100,80,60,70,60,85,100};
//         int span[] = new int[stocks.length];
//         stockSpan(stocks,span);

//         for(int i=0;i<span.length;i++){
//             System.out.print(span[i]+" ");
//         }
        
//     }
// }







// import java.util.*;
// public class DAY6 {

//     public static boolean isValid(String str){
//         Stack <Character> st = new Stack<>();
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
//             st.push(str.charAt(i));
//             else{
//                 if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']');
//             st.pop();
//             }
//         }
//         if(st.isEmpty()){
//             return true;
//         }
        

//         return false;
//     }
//     public static void main(String[] args) {
//         String str = "(([{}])))[])";
//         if(isValid(str)==true){
//             System.out.println("Valid");
//         }
//         else{
//             System.out.println("Invalid");
//         }
//     }
// }




import java.util.*;
public class DAY6 {

    public static void TOH(int N, char from,char to,char aux){
        if(N==1){
            System.out.println("Move disk 1 from rod "+from+" to rod "+to);
            return;
        }

        TOH(N-1,from,to,aux);
        System.out.println("Move disk "+N+" from rod "+from+" to rod "+to);
        TOH(N-1,aux,to,from);

    }
    public static void main(String[] args) {
        int n=4;
        TOH(n,'A','B','C');
    }
} 