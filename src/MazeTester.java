public class MazeTester {

    public static void main(String[] args){
        Maze mz = new Maze();
        System.out.println(mz.loadMaze("src/maze-1"));
        System.out.println(mz.getStart());
        System.out.println(mz.getFinish());
        System.out.println(mz.getNeighbors(mz.getStart()));
        System.out.println("*******      " + "        *************");
        Maze mz7 = new Maze();
        System.out.println(mz7.loadMaze("src/maze-50a"));
        System.out.println(mz7.toString());

         System.out.println("*******      " + "        *************");
        Maze mz9 = new Maze();
        System.out.println(mz9.loadMaze("src/maze-invalid"));

        System.out.println("*******      " + "        *************");

        Maze mz10 = new Maze();
        System.out.println(mz10.loadMaze("src/maze-occs"));
        System.out.println(mz10.toString());
        mz10.reset();
        System.out.println(mz10.toString());


    }
    
}
