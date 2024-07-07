import java.util.*;
public class Tries {
    static class Node{
        Node children[] = new Node[26];
        boolean eow=false;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node cur = root;
        for(int level=0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(cur.children[idx]==null){
                cur.children[idx]=new Node();
            }

            cur.eow = true;
        }
    }
    public static void main(String[] args) {
        String[] words ={"the","a","there","their","any","thee"};
    }

}
