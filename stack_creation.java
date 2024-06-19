// import java.util.*;
// public class stack_creation {

//     static int[] arr=new int [100];
//     static int count=0;
//     public static void push(int data){
//         if(count>=100){
//             System.out.println("Stack overflow");
//             return;
//         }
        
//         arr[count]=data;
//         count++;
//         return;
        
//     }
//     public static int pop(){
//         if(count<0){
//             System.out.println("Stack underflow");
//             return -1;
//         }
//         count--;
//         int poppy = arr[count];
//         return poppy;


//     }
//     public static int peak(){
//         return arr[count];
//     }
//     public static boolean isEmpty(){
//         if(count<=0){
//             return true;
//         }

//         return false;

//     }
//     public static void main(String[] args) {
//         push(1);
//         push(2);
//         push(3);

//         while(!isEmpty()){
//              System.out.println(pop());
//         }
        
//     }
// }


// import java.util.*;
// public class stack_creation {

    
//     static class Node{
//         int data;
//         Node next =null;

//         Node(int data){
//             this.data=data;
//             this.next=next;
//         }
//     }

//     static class Stack{
//      Node head;
//      int size=0;


//     public void push(int data){
//         Node node = new Node(data);
//         if(head==null){
//             head=null;
//         }
//         node.next=head;
//         head=node;
//         size++;
//         return;
//     }
//     public int pop(){
//         if(size==0){
//             System.out.println("Underflow");
//         }
//        int temp=head.data;
//        head = head.next;
//        return temp;
        
//     }
//     public int peek(){
//         return head.data;
//     }
//     public boolean isEmpty(){
//         if(size==0){
//             return true;
//         }
//         return false;
//     }
//     public void print(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//     }

// }
//     public static void main(String[] args) {

//         Stack stack = new Stack();

//         stack.push(7);
//         stack.push(8);
//         stack.push(9);
//         System.out.println(stack.pop());

//         System.out.println(stack.peek());
//         stack.print();
        
//     }
// }



