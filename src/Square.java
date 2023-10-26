public class Square {
    private int row, col, type;
    public Square(int row, int col, int type){
        this.row = row;
        this.col = col;
        this.type = type;

    }

    public int getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }
    public int getType(){
        return this.type;
    }

    public String toString(){
        /*
        * _ = emptyspace (0)
        * # = wall (1)
        * S = Start (2)
        * E = Exit (3)
        * 
        * o - is on the solver work list (4)
        * . - has been explored (5)
        *  x - is on the final path to the exit (6)
        */
        switch(this.type){
            case 0: return "_";
            case 1: return "#";
            case 2: return "S";
            case 3: return "E";
            case 4: return "o";
            case 5: return ".";
            case 6: return "x";
            default: return "Invalid";
        }
    }
}