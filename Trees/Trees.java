package Trees;
import java.util.*;
public class Trees {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(){
            this.data=data;
            this.left =left;
            this.right=right;
        }
    }

    class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void main(String[] args) {

    }
}
