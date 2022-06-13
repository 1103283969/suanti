package dongtaiguihua;

import ArryList.MaxWindow;

public class MinPathSum {

    public int[][] m;


    public int x;
    public int y;

    public  MinPathSum(int x,int y){

        this.x=x;
        this.y=y;
        this.m=new int[1000][1000];
        for (int i=0;i<1000;i++){
            for (int j=0;j<1000;j++){
                m[i][j]=i;
            }
        }
    }


    public int minSum(int i, int j,int x,int y){


        int dp[][]=new int[6][6];


        if (i==x&&j!=y){
            return m[i][j] + minSum(i,j+1,x,y);
        }
        if (j==x&&i!=y){
            return m[i][j] + minSum(i+1,j,x,y);
        }
        if (j==x&&i==y){
            return m[i][j];
        }
        return m[i][j]+ Math.min(minSum(i+1,j,x,y),minSum(i,j+1,x,y));

    }

}
