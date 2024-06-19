package DAY8;
import java.util.*;
public class QueueUsingArray {
   static int arr[] = new int [5];
   static int count=0;


   static void add(int a){
     if(count>=5){
        System.out.println("Overflow");
     }

     arr[count]=a;
     count++;

   }
   static int remove(){
        if(count<0){
            System.out.println("Underflow");
        }
        int temp = arr[0];
      for(int i=0;i<count-1;i++){
        arr[i]=arr[i+1];
      }
      count--;
      return temp;
      
   }
   static int front(){
        return arr[0];
   }
   static int rear(){
        return arr[count-1];
   }


    public static void main(String[] args) {

        QueueUsingArray queue = new QueueUsingArray();
        queue.add(8);
        queue.add(9);
        queue.add(2);
        queue.add(1);
        queue.remove();
        queue.remove();
        queue.front();
        queue.rear();
        
        
    }
}
