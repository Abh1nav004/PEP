// import java.util.*;


// public class DAY5 {
//     class Node{
//         int data;
//         Node next;
    
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }

//         static Node head;
//         static Node tail;


//          public void insertAtHead(int value){
//             Node newNode = new Node(value);
//             if(head==null){
//                 head = newNode;
//                 tail= newNode;
//                 return;
//             }
//         newNode.next = head;
//         head = newNode;
//         }

        
//         public void insertAtTail(int value){
//             Node newNode = new Node(value);
//             if(head==null){
//                 head = newNode;
//                 tail= newNode;
//                 return;
//             }
//         tail.next = newNode;
//         tail = newNode;
//         }

//         void RemoveAtFirst(int value){
//             Node newNode = new Node(value);
//             if(head==null){
//                 System.out.println("Your LL is empty");
//             }
//             head = head.next;
//         }

//         void RemoveAtLast(int value){
//             Node temp = new Node(value);
//             if(head==null){
//                 System.out.println("Your LL is empty");
//             }
//            temp=head;
//             while(temp.next!=tail){
//                 temp=temp.next;
//             }
//             tail = temp;
//             temp.next=null;
//         }

//         void Print(){
//             if(head==null){
//                 System.out.println("LL is empty");
//                 return;
//             }

//             Node temp = head;
//             while(temp!=null){
//                 System.out.print(temp.data+"->");
//                 temp = temp.next;
//             }

//             System.out.println("null");

//         }

//         void search(int key){
//             Node temp = head;
//             while(temp!=null){
//                 if(temp.data==key){
//                     System.out.println(key+ " is in LL");
//                     return;
//                 }
//                 else{
//                     System.out.println(key+" is not in LL");
//                 }

//             }
//         }

//         void rec_search(int key){
            
//         }
    

//     public static void main(String[] args) {
//         DAY5 ll = new DAY5();
//         ll.Print();
//         ll.insertAtHead(4);
//         ll.Print();
//         ll.insertAtHead(6);
//         ll.Print();

//         ll.search(6);


        
//     }
// }






import java.util.*;
public class DAY5 {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

    }
    public static Node head;
    public static Node tail;
    int size;

    public DAY5(){
        this.size=0;
    }





    public void insertAtHead(int data){
        if(tail==null){
            tail=head;
            System.out.println("LL is empty");
        }
        Node node = new Node(data);
        node.next=head;
        head =node;

        size++;






    }
    public void insertAtTail(int data){
        if(tail==null){
            insertAtHead(data);
            return;
        }
        Node node = new Node(data);
        tail.next=node;
        tail =node;

        size++;



    }
    public void insertAtIndex(int data,int index){
       if(index==0){
        insertAtHead(data);
       }

       if(index==size){
        insertAtTail(data);
       }

       Node temp = head;
       for(int i=1;i<index;i++){
            temp=temp.next;
       }

       Node node = new Node(data,temp.next);
       temp.next = node;

       size++;


    }




    public int deleteAtFirst(){
        int val = head.data;
        head = head.next;
        if(head==null){
            tail=null;

        }

        size--;
        return val;
    }






    public int deleteAtLast(){

        if(size<=1){
            return deleteAtFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.data;
        tail=secondLast;
        tail.next=null;
        
        size--;
        return val;
    }




    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node=node.next;
        }

        return node;

    }

    

    public int deleteAtIndex(int index){
        if(index==0){
        return deleteAtFirst();
    }

        if(index==size-1){
            return deleteAtLast();
        }

        Node prev = get(index-1);
        int value = prev.next.data;
        prev.next=prev.next.next;


        return value;

    

    }


    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.data==value){
                return node;
            }

            node=node.next;
        }

        return null;
    }


    




    public void show(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DAY5 LL = new DAY5();
        LL.insertAtHead(6);
        LL.show();
        LL.insertAtHead(7);
        LL.show();
        LL.insertAtHead(8);
        LL.show();
        LL.insertAtIndex(90, 2);
        LL.show();
        // LL.deleteAtFirst();
        // LL.show();
        // LL.deleteAtLast();
        // LL.show();
        LL.deleteAtIndex(2);
        LL.show();
        
        
        
    }
}