public class MazeSolverStack extends MazeSolver{
    private MyStack stack;

    public MazeSolverStack(Maze maze){
        super(maze);
        stack =  new MyStack();
    }

    public Square next(){
        return stack.pop();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void makeEmpty(){
        stack.clear();
    }

    public void add(Square sq){
        stack.push(sq);
    }


}
