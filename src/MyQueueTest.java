public class MyQueueTest {
    public static void main (String[] args){
        MyQueue queue = new MyQueue();
        Maze mz = new Maze();
        mz.loadMaze("src/maze-1");
        System.out.println(queue.isEmpty() + " Expected: True");

        queue.enqueue(mz.getStart());

        for(Square sq : mz.getNeighbors(mz.getStart())){
            queue.enqueue(sq);
        }
        System.out.println(queue.isEmpty() + " Expected: False");

        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.front());
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue.size() + " Expected: 0");
        System.out.println(queue.isEmpty());
        

    }
}
