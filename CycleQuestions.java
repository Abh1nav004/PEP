import java.util.*;
public class CycleQuestions {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }

    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }

        return false;

    }

    
    public int lengthCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp = slow;
                int count=0;
               do {
                    temp=temp.next;
                    count++;
               }while(temp!=slow); 
                  return count;  
            
            }
        }

        return 0;

    }
    public static void main(String[] args) {
        
    }
}