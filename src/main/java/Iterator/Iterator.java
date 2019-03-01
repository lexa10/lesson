package Iterator;

import linkealist.LinkedList;
import linkealist.SimpleLinkedListImpl;

public class Iterator {
    public static void main(String[] args) {
        LinkedList<Integer> list = new SimpleLinkedListImpl();
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        displayAll(list);

        System.out.println("-----------");

        ListIterator<Integer> iterator = (ListIterator) list.iterator();
        iterator.reset();
        iterator.insertAfter(11);
        iterator.next();
        iterator.remove();
        iterator.insertBefore(0);

        while (iterator.hasNext()) {
            Object next = iterator.next();

        }

        displayAll(list);
    }

    private static void displayAll(LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.println(value);
        }
    }
}
