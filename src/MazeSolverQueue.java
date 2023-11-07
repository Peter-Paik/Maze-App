public class MazeSolverQueue extends MazeSolver {
    private MyQueue worklist;
    
    public MazeSolverQueue(Maze maze){
        super(maze);
    }

    public Square nextItem(){
        return this.worklist.front();
    }

    public void makeEmpty(){
        this.worklist = new MyQueue();
    }
    public boolean isEmpty(){
        return this.worklist.isEmpty();
    }
    public void add(Square sq){
        this.worklist.enqueue(sq);
    }
    public Square next(){
        return this.worklist.dequeue();
    }

}
