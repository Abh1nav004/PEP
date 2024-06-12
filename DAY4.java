// push element in beginning using recursion in stacks



// import java.util.*;
// public class DAY4 {

    
//     public static void main(String[] args) {

//         Stack<Integer> stack = new Stack<Integer>();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
        
//         stack_push(stack);

//         System.out.println(stack);
        
        
//     }

//     static void stack_push(Stack<Integer> stack){
//             if(stack.isEmpty()){
//                 System.out.println("Working");
//                 stack.push(4);
//                 return;
//             }

//             Integer st = (Integer)(stack.pop());
//             stack_push(stack);
//             stack.push(st);


//     }
// }  



// import java.util.*;
// public class DAY4 {
//         public static void main(String[] args) {
//         Stack<Character>st = new Stack<>();
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         for(int i=0;i<s.length();i++){
//             st.push(s.charAt(i));
//         }       
//         for(int i=0;i<s.length();i++){
//             Character c = (Character) st.pop();
//             System.out.print(c);

//         }
//         sc.close();
//     }
// }

import java.util.*;
public class DAY4 {

    static void stack_push(Stack<Integer>stack, int val){
                    if(stack.isEmpty()){
                        stack.push(val);
                        return;
                    }
        
                    Integer st = (Integer)(stack.pop());
                    stack_push(stack,val);
                    stack.push(st);
        
        
            }
    static void reverse_stack(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        Integer i = (Integer)(st.pop());

        reverse_stack(st);
        stack_push(st,i);

    }
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        reverse_stack(st);
        System.out.println(st);
    }
}

