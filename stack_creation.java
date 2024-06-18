import java.util.*;
public class stack_creation {

    static int[] arr=new int [100];
    static int count=0;
    public static void push(int data){
        if(count>=100){
            System.out.println("Stack overflow");
            return;
        }
        
        arr[count]=data;
        count++;
        return;
        
    }
    public static int pop(){
        if(count<0){
            System.out.println("Stack underflow");
            return -1;
        }
        count--;
        int poppy = arr[count];
        return poppy;


    }
    public static int peak(){
        return arr[count];
    }
    public static boolean isEmpty(){
        if(count<=0){
            return true;
        }

        return false;

    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        while(!isEmpty()){
             System.out.println(pop());
        }
        
    }
}