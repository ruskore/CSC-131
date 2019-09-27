package linkedlist;

/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/5/2019
 * Time: 11:17 PM
 */

public class LinearNode<T> {
    private LinearNode<T> next;
    private T elem;

    public LinearNode() { // Creates an empty node
        this.next = null;
        this.elem = null;
    }

    public LinearNode(T elem) { // Stores an element to a new node
        this.next = null;
        this.elem = elem;
    }

    public LinearNode<T> getNext() {
        return this.next;
    }

    public void setNext(LinearNode<T> node) {
        this.next = node;
    }

    public T getElem() {
        return this.elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }
}
