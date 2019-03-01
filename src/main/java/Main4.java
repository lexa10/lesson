import linkealist.LinkedList;
import linkealist.SimpleLinkedListImpl;

public class Main4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        linkedList.remove(3);
        linkedList.remove(11);

        linkedList.display();


        System.out.println("find 2 = " + linkedList.find(2));
        System.out.println("Find 11 = " + linkedList.find(11));
        linkedList.find(5);

        linkedList.remove();
        linkedList.remove();

        linkedList.display();
    }
}
