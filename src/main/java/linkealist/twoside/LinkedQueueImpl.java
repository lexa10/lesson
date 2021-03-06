package linkealist.twoside;

import linkealist.StackQueue.Queue;

public  class LinkedQueueImpl<E> implements Queue<E> {

        private TwoSideLinkedList<E> data;

    public LinkedQueueImpl() {
        this.data = new TwoSideLinkedListImpl<>();
    }


        @Override
        
        public void insert(E value) {
            data.insertRight(value);
        }

        @Override
        public E remove() {
            return data.removeLeft();
        }

        @Override
        public E peek() {
            return data.getFirstElement();
        }

        @Override
        public int size() {
            return data.getSize();
        }


        public boolean isFull() {
            return false;
        }

        @Override
        public boolean isEmpty() {
            return data.isEmpty();
        }
    }