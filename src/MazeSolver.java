import java.util.*;
public abstract class MazeSolver {
    protected Maze maze;

    public MazeSolver(){
        
    }

    abstract void makeEmpty();
    abstract boolean isEmpty();
    abstract void add(Square sq);
    abstract Square next();
    //Create a (non-abstract); //constructor that takes a Maze as a parameter and stores it in a variable that the children classes can access.
    public MazeSolver(Maze maze){
        this.maze = maze;
    }
    public boolean isSolved(){
        return step().getType() == 3||isEmpty();
    }
    //A non-abstract method that the application program can use to see if this algorithm has solved this maze. That is, has it determined the path to the exit or if there is no path.
    //This method will return true if either:
    //A path from the start to the exit has been found; OR
    //You determine there is no such path (worklist is now empty)
    public String getPath(){
        if(!isSolved())
            return "Not solved yet";
        else if(isSolved() && isEmpty())
            return "No solution";
        String path = "[" + maze.getFinish().getCol() + "," + maze.getFinish().getRow() + "]";
        Square sq = maze.getFinish();
        while(sq.getPrevious() != null){
            sq = sq.getPrevious();
            path += "[" + sq.getCol() + "," + sq.getRow() + "] " + path;
        }
        return path;
    }
    //Returns either a string of the solution path as a list of coordinates [i,j] from the start to the exit or a message indicating no such path exists
    //If the maze isn't solved, you should probably return a message indicating such.
    public Square step(){
        Square sq = next();
        ArrayList<Square> neighbors = new ArrayList<Square>(maze.getNeighbors(sq));
        for(Square n: neighbors){
            if(!n.isMarked() && !isSolved()){
                n.setPrevious(sq);
                n.mark();
                add(n);
            }
            else if (isSolved()){
                System.out.println(getPath());
            }
        }

        return sq;
    }
    //perform one iteration of the algorithm above (i.e., steps 1 through 5) and return the Square that was just explored (and null if no such Square exists). Note that this is not an abstract method, that is, you should implement this method in the MazeSolver class by calling the abstract methods listed above.
    //In order to keep track of which squares have previously been added to the worklist, you will "mark" each square that you place in the worklist. Then, before you add a square to the worklist, you should first check that it is not marked (and if it is, refrain from adding it).
    //Here is the suggestion for marking a Square: have each Square keep track of which Square added it to the worklist (i.e., "Which Square was being explored when this Square was added to the worklist?"). That is, add a new class member Square previous to the Square class, which will represent the Square previous to the current one; initialize this variable to null in the constructor/reset method. Then, when a Square is being added to the list for the first time, you will set the previous variable to point to the current Square (the Square that is being explored). If the previous variable is already non-null, then this Square has already been placed on the list, and you should not do so again.
    //You may also want to add in additional methods to your Square class to help you with this.
    void solve(){
        while(!isSolved()){
            step();
        }
    }



}
