package dongtaiguihua;

public class Lcse {

    char[] s1;
    char[] s2;

    public Lcse(char[] s1,char[] s2){
        this.s1=s1;
        this.s2=s2;
    }
    public int  countNum(int i,int j,char[] s1,char[] s2){

        //base case
        if(i==0&&j!=0){
           for(int k=0;k<s2.length;k++){
               if (s2[k]==s1[0]) {
                   return 1;
               }
               return 0;
           }
        }

        if(i!=0&&j==0){
            for(int k=0;k<s1.length;k++){
                if (s1[k]==s2[0]) {
                    return 1;
                }
                return 0;
            }
        }

        if(i==0&&j==0){
            if(s1[0]==s2[0]){
                return 1;
            }
            return 0;
        }

        int count1=countNum(i,j-1,s1,s2);
        int count2=countNum(i-1,j,s1,s2);
        int count3=0;

        if(s1[i]==s2[j]){
            count3=countNum(i-1,j-1,s1,s2);
        }

       return  Math.max(Math.max(count1,count2),Math.max(count3,count1));
    }
}
