package dongtaiguihua;



/**
 *
 * 题目工-
 * 假设有排成一行的N个位置，记为1~N，N一定大于或等于2
 * 开始时机器人在其中的M位置上(M一定是1~N中的一个)
 * 如果机器人来到1位置，那么下一步只能往右来到2位置;
 * 如果机器人来到N位置，那么下一步只能往左来到N-1位置;
 * 如果机器人来到中间位置，那么下一步可以往左走或者往右走﹔;
 * 规定机器人必须走K步，最终能来到P位置(P也是1~N中的一个)的方法有多少种给定四个参数N、M、K、P，返回方法数。
 *
 */


public class RobotWalk {

      public int[][] dp;
      public int rest;

      public int N;
      public RobotWalk(int N,int rest){
          this.N=N;
          this.rest=rest;
          this.dp=new int[N+1][rest+1];

          for (int i=0;i<N+1;i++){
              for (int j=0;j<rest+1;j++){
                  dp[i][j]=-1;
              }
          }
    }


       public  Integer process(int N,int aim,int rest,int k){

           //递归结束的条件

           if(this.dp[k][rest]!=-1){
               return dp[k][rest];
           }

           int ans=0;

           if(rest==0){
               ans= (k==aim)?1:0;
               this.dp[k][rest]=ans;
               return ans;
           }

           if(k==1){
               ans= process(N,aim,rest-1,k+1);
           }else if (k==N){
               ans= process(N,aim,rest-1, k-1);
           }else {
               ans= process(N,aim,rest-1,k-1) + process(N,aim,rest-1,k+1);
           }

           this.dp[k][rest]=ans;
           return ans;
       }

}
