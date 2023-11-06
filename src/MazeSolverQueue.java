public class MazeSolverQueue extends MazeSolver {
    private MyQueue worklist;
    
    public MazeSolverQueue(Maze maze){
        super(maze);
        makeEmpty();
    }

    public void makeEmpty(){
        this.worklist = new MyQueue();
    }
    public boolean isEmpty(){
        return worklist.isEmpty();
    }
    public void add(Square sq){
        worklist.enqueue(sq);
    }
    public Square next(){
        return worklist.dequeue();
    }

}
