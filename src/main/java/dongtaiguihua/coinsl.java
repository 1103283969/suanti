package dongtaiguihua;

import javax.security.auth.login.AccountException;

public class coinsl {

    public int[]  arr;

    public coinsl(){
        this.arr=new int[6];
        for ( int i =0 , j=arr.length;i<arr.length;i++,j--){
            arr[i]=j;
        }
    }

    public int minCoin(int index,int aim) {
        int count = 0;
        //基本示例
        if (aim == 0) {
            count = 0;
            return count;
        }

        if (aim < arr[index] && index >= arr.length - 1) {
            return 10000;
        }
        if (aim < arr[index]) {
            count = minCoin(index + 1, aim);
            return count;
        }
        int count1 = 1 + minCoin(index, aim - arr[index]);
        int count2 = minCoin(index + 1, aim);
        count = Math.min(count1, count2);
        return count;
    }

}
