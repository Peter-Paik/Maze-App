import java.util.*;


public class MyStack implements StackADT<Square>{

    private ArrayList<Square> list;
    
    public MyStack() {
        list = new ArrayList<Square>();
    }

    

     public void push(Square item){
        this.list.add(item);
        
     }

    /**
     * Remove the top item from the stack
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public Square pop(){

        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.remove(list.size()-1);

    }

    /**
     * Display the top item from the stack without removing it
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
   public Square top(){
        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.get(list.size()-1);

    }

    /**
     * Find how many items are in the stack
     * @return the number of items in the stack
     */
    public int size(){
        return list.size();
    }

    /**
     * Determine if the stack is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty(){
        return list.isEmpty();
    }

    /**
     * Clear out the data structure
     */
    public void clear(){
        list.clear();

    }

    




    
}
