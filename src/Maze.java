import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze {
    private Square[][] maze;
    private Square start;
    private Square finish;

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
                s = in.next();
                this.maze[count/numCols][count%numCols] = new Square(count/numCols,count%numCols,Character.getNumericValue(s.charAt(0)));

                if(this.maze[count/numCols][count%numCols].getType() == 2) //check if its the start
                    this.start = this.maze[count/numCols][count%numCols];
                else if (this.maze[count/numCols][count%numCols].getType() == 3) //check if its the end
                    this.finish = this.maze[count/numCols][count%numCols];
                count++;
            }
        
        }
        catch(FileNotFoundException e){
            return false;
        }
        return true;
        
    }

    public ArrayList<Square> getNeighbors(Square sq){
        ArrayList<Square> neighbors = new ArrayList<Square>();
        if(sq.getRow()-1 >=0)
            neighbors.add(this.maze[sq.getRow()-1][sq.getCol()]);
        if(sq.getCol()+1 <=this.maze[0].length)
            neighbors.add(this.maze[sq.getRow()][sq.getCol()+1]);
        if(sq.getRow()+1 <=this.maze.length)
            neighbors.add(this.maze[sq.getRow()+1][sq.getCol()]);
        if(sq.getRow()-1 >=0)
            neighbors.add(this.maze[sq.getRow()][sq.getCol()-1]);

        return neighbors;
    }

    public Square getStart(){
        return this.start;
    }

    public Square getFinish(){
        return this.finish;
    }

    public void reset(){
        for(int row = 0; row < this.maze.length; row++){
            for(int col = 0; col < this.maze[0].length; col++){
                this.maze[row][col].reset();
            }
        }
    }

    public String toString(){
        String str = "";
        for(int row = 0; row < this.maze.length; row++){
            for(int col = 0; col < this.maze[0].length; col++){
                str += this.maze[row][col];
            }
            str += "\n";
        }
        return str;
    }
}
