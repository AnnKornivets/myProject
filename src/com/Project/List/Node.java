package com.Project.List;

public class Node <T> {
    private Node next; // храние следующего элемента
    private Node previous; // хранение предыдущего элемента
    private T t; // наш элемент

    public Node() {
        this.next = null;
        this.previous = null;
    }

    public Node(Node previous){
        this.next=null;
        this.previous=previous;

    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
