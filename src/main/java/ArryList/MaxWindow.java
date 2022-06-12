package ArryList;

import java.util.ArrayList;

public class MaxWindow {

    public ArrayList<Integer> arr;

    public MaxWindow(){
        this.arr=new ArrayList<>();
    }

    public ArrayList<Integer> getMaxWindow(Integer w){

        ArrayList<Integer> rel=new ArrayList<>();

        for(int index=w-1;index<arr.size();index++){
            ArrayList<Integer> temp =new ArrayList<>();
            for(int i=0;i<w;i++){
                temp.add(arr.get(index-i));
            }
            temp.sort(Integer::compareTo);
            rel.add(temp.get(w-1));
        }
        return rel;
    }


}
