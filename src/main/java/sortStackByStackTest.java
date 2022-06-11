import java.util.Stack;

public class sortStackByStackTest {

    public static void main(String[] args) {
        sortStackByStack  stack=new sortStackByStack();

        for (int i =100;i>0;i--){
            stack.stack.push(i);
        }

        System.out.println(stack.stack);

        stack.sort();

        System.out.println(stack.stack);


    }
}
