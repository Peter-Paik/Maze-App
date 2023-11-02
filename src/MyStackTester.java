public class MyStackTester {

    public static void main(String[] args){
        MyStack stack = new MyStack();
        Square sq = new Square(2,2,2);
        Square sq1 = new Square(2,2,1);

        stack.push(sq);
        System.out.println(stack.top());
        System.out.println(stack.size());
        stack.push(sq1);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.clear();
        System.out.println(stack.isEmpty());

    }
    
}
