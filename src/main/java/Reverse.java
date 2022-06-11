import java.util.Stack;

public class Reverse {

    /**
     *
     *如何仅用递归函数和栈操作逆序一个栈
     * 【题目】
     * 一个栈依次压入1、2、3、4、5，那么从栈顶到栈底分别为5、4、3、2、1。
     * 将这个栈转置后，从栈顶到栈底为1、2、3、4、5，也就是实现栈中元素的逆序，
     * 但是只能用递归函数来实现，不能用其他数据结构。
     * 【难度】
     * 尉★★☆☆
     *
     */

    private Stack<Integer> stack;

    public Reverse(){
        this.stack=new Stack<>();
    }

    public  Integer  reverseStack(Integer last){

            if(stack.empty()){
                stack.push(last);
            }

            Integer last1=stack.pop();


            return null;

    }

}
