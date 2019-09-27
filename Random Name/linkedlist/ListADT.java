package linkedlist;

/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/5/2019
 * Time: 11:08 PM
 */

public interface ListADT<T> {
    public void push(T element);
    public T peek(int position);
    public boolean isEmpty();
    public int size();
    public String toString();
}
