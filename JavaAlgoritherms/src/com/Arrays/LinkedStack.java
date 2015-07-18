package com.Arrays;

public class LinkedStack<E> implements Stack<E>{

    private SinglyLinkedList<E> singleList = new SinglyLinkedList<E>();
    public LinkedStack() {
        
    }

    @Override
    public void push(E e) {
        singleList.addFirst(e);
        System.out.println("My first change");
    }

    @Override
    public int size() {
        return singleList.size();
    }

    @Override
    public E pop() {
        return singleList.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return singleList.isEmpty();
    }

    @Override
    public E top() {
        return singleList.first();
    }
}
