public class SquareTester {
    
    public static void main(String[] args){
        Square sq1 = new Square(0,0,0);
        System.out.println(sq1 + " , " + sq1.getRow());
        Square sq2 = new Square (4,6,5);
        System.out.println(sq2);
        Square sq3 = new Square(3,5, 2);
        System.out.println(sq3 + " , " + sq3.getCol() + " , " + sq3.getType());
        

    }
}
