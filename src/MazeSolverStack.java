public class MazeSolverStack extends MazeSolver{
    private MyStack stack;

    public MazeSolverStack(Maze maze){
        super(maze);
    }

    public Square next(){
        System.out.println(this.stack.size());
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
