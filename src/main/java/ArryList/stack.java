package ArryList;

import lombok.Data;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 设计一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。
 *
 * 1. pop. push、getMin操作的时间复杂度都是O(1)。
 * 2．设计的栈类型可以使用现成的栈结构。
 */

@Data
public class stack {

    private Stack<Integer>  stackData;
    private  Integer  stackMin;

    public stack(){
        this.stackData=new Stack<Integer>();
    }

    public void  push(Integer num){
        if(stackData.empty()){
            stackData.push(num);
            this.stackMin=num;
        }else{
            if(num<stackMin){
                stackMin=num;
            }
            stackData.push(num);
        }
    }

    public Integer pop(){
        return stackData.pop();
    }

    public Integer getMin(){
        if (stackData.empty()){
            throw new RuntimeException("栈为空");
        }
        return this.stackMin;
    }


}
