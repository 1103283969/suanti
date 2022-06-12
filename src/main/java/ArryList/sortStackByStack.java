package ArryList;

import java.util.Stack;

public class sortStackByStack {

    public Stack<Integer> stack;
    public Stack<Integer>  help;

    public sortStackByStack(){
        this.stack=new Stack<>();
        this.help=new Stack<>();
    }

    public void sort(){

        while(!stack.empty()){

            Boolean k =false;
            int temp=stack.pop();

            if(help.empty()){
                help.push(temp);
            }else if(temp<=help.peek()){
                help.push(temp);
            }else{
                while(temp>help.peek()){
                    int temp2=help.pop();
                    if(help.empty()){
                        help.push(temp);
                        k=true;
                    }
                    stack.push(temp2);
                }

                if(k==true){
                    help.push(temp);
                }

            }
        }

        while(!help.empty()){
            stack.push(help.pop());
        }

    }


}
