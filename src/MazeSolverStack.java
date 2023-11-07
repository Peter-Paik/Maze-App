public class MazeSolverStack extends MazeSolver{
    private MyStack stack;

    public MazeSolverStack(Maze maze){
        super(maze);
    }

    public Square nextItem(){
        return this.stack.top();
    }

    public Square next(){
        return this.stack.pop();
    }

    public boolean isEmpty(){
        return this.stack.isEmpty();
    }

    public void makeEmpty(){
        this.stack = new MyStack();
    }

    public void add(Square sq){
        this.stack.push(sq);
    }


}
