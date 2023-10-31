import java.util.NoSuchElementException;

public class MyQueue implements QueueADT<Square>{
    private Node start, end;
    private int size = 0;

    /**
     * Add an item to the queue
     * @param item the data item to add (of type T)
     */

    public void enqueue(Square item){
        if(isEmpty()){
            this.start = new Node(item);
            this.end = start;
        }
        else{
            this.end.next = new Node(item);
            this.end = this.end.next;
    
        }
        size++;
    }
    /**
     * Remove the front item from the queue
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Square dequeue(){
        if(isEmpty())
            throw new NoSuchElementException();
        Node temp = this.start;
        this.start = this.start.next;
        this.size--;
        return temp.getData();
    }

    /**
     * Return the front item in the queue without removing it
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Square front(){
        if(isEmpty())
            throw new NoSuchElementException();
        return this.start.getData();
    }

    /**
     * Find how many items are in the queue
     * @return the number of items in the queue
     */
    public int size(){
        return size;
    }

    /**
     * Determine if the queue is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty(){
        return this.start==null;
    }

    /**
     * Clear out the data structure
     */
    public void clear(){
        this.start = null;
        this.end = null;
        this.size = 0;
    }



    /*
     * Node Class
     */
    private class Node{
        private Node next;
        private Square data;
        public Node(Square data){
            this.data = data;
        }
        
        public Square getData(){
            return this.data;
        }
    }
}