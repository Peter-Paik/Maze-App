import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze {
    private Square[][] maze;

    public Maze(){
        //do nothing default constructor would be fine
    }

    public boolean loadMaze(String fname){
        try(Scanner in = new Scanner(new File(fname))){
            String s = in.nextLine();
            int numRows = Character.getNumericValue(s.charAt(0));
            int numCols = Character.getNumericValue(s.charAt(2));
            this.maze = new Square[numRows][numCols];
            int count = 0;
            while(in.hasNext()){
                s = in.hasNext();
                this.maze[count/numCols][count%numCols] = new Square(count/numCols,count%numCols,Character.getNumericValue(s.charAt(0)));
            }
        
        }
        catch(FileNotFoundException e){
            return false;
        }
        return true;
        
    }

    public ArrayList<Square> getNeighbors(Square sq){
        ArrayList<Square> neighbors = new ArrayList<Square>();


        return neighbors;
    }

    public Square getStart(){

    }

    public Square getFinish(){

    }

    public void reset(){

    }

    public String toString(){

    }
}
