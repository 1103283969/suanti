package ArryList;

public class stackTest {

    private static stack stack;

    public static void main(String[] args) {

                   stack = new stack();
                   for (int  i=10;i<100;i++){
                       stack.push((Integer) i);
                   }
                   System.out.println(stack.getMin());
    }
}
