import java.util.*;


public class DAY5 {
    class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

        static Node head;
        static Node tail;


         public void insertAtHead(int value){
            Node newNode = new Node(value);
            if(head==null){
                head = newNode;
                tail= newNode;
                return;
            }
        newNode.next = head;
        head = newNode;
        }

        
        public void insertAtTail(int value){
            Node newNode = new Node(value);
            if(head==null){
                head = newNode;
                tail= newNode;
                return;
            }
        tail.next = newNode;
        tail = newNode;
        }

        void RemoveAtFirst(int value){
            Node newNode = new Node(value);
            if(head==null){
                System.out.println("Your LL is empty");
            }
            head = head.next;
        }

        void RemoveAtLast(int value){
            Node temp = new Node(value);
            if(head==null){
                System.out.println("Your LL is empty");
            }
           temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            tail = temp;
            temp.next=null;
        }

        void Print(){
            if(head==null){
                System.out.println("LL is empty");
                return;
            }

            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }

            System.out.println("null");

        }

        void search(int key){
            Node temp = head;
            while(temp!=null){
                if(temp.data==key){
                    System.out.println(key+ " is in LL");
                    return;
                }
                else{
                    System.out.println(key+" is not in LL");
                }

            }
        }

        void rec_search(int key){
            
        }
    

    public static void main(String[] args) {
        DAY5 ll = new DAY5();
        ll.Print();
        ll.insertAtHead(4);
        ll.Print();
        ll.insertAtHead(6);
        ll.Print();

        ll.search(6);


        
    }
}



