package Iterator;

import linkealist.LinkedList;
import linkealist.SimpleLinkedListImpl;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

    public static void main(String[] args) {
        LinkedList<Integer> list = new SimpleLinkedListImpl();
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        displayAll(list);

        System.out.println("-----------");

        ListIterator<Integer> iterator = (ListIterator) list.iterator();
        iterator.reset();//1! 2 3 4
        iterator.insertAfter(11);//1 11! 2 3 4
        iterator.next();//1 11 2! 3 4
        iterator.remove();//1 11 3! 4
        iterator.insertBefore(0);// 1 11 0! 3 4

        while (iterator.hasNext()) {
            Object next = iterator.next();
            //do next....
        }

        displayAll(list);
    }

    private static void displayAll(LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.println(value);
        }

        int[] intArray = {1, 2, 3};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("---------");

        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        for (Integer element : linkedList) {
            System.out.println(element);
        }


        System.out.println("---------");
        System.out.println("JDK:");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = arrayList.iterator();
        while ( iterator.hasNext() ) {
            Integer next = iterator.next();
            System.out.println(next);
        }


        java.util.LinkedList<Integer> linkedListJdk = new java.util.LinkedList<>();
        for (Integer integer : linkedListJdk) {

        }
   }
}
