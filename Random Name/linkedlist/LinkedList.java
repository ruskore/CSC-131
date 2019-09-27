package linkedlist;

/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/18/2019
 * Time: 12:52 PM
 */

public class LinkedList<T> implements ListADT<T> {
    private int count;
    private LinearNode<T> head;

    /**
     * Constructor
     */
    public LinkedList() {
        this.count = 0;
        this.head = null;
    }

    /* (non-Javadoc)
     * @see csc130.datastruct.stacklink.StackADT#push(java.lang.Object)
     */
    public void push(T element) {

        LinearNode<T> temp = new LinearNode<T>(element);

        temp.setNext(this.head);
        this.head = temp;
        this.count++;
    }

    /* (non-Javadoc)
     * @see itu.data.structure.stack.StackADT#peek()
     */
    @Override
    public T peek(int position) {
        if (isEmpty()) {
            throw new RuntimeException("Impossible to peek an element from the Stack when is empty");
        }

        LinearNode<T> temp = new LinearNode<T>();
        LinearNode<T> current = this.head;
        T result = null;
        int count = 0;
        while (current != null) {
            if(count == position) {
                result = current.getElem();
            }
            current = current.getNext();
            count++;
        }
        return result;
    }

    /* (non-Javadoc)
     * @see itu.data.structure.stack.StackADT#isEmpty()
     */
    public boolean isEmpty() {
        return (this.count == 0);
    }

    /* (non-Javadoc)
     * @see itu.data.structure.stack.StackADT#size()
     */
    public int size() {
        return this.count;
    }
}
