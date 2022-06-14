package dongtaiguihua;

public class LongestStringOfSubroutines {

    public char[] s1;

    public LongestStringOfSubroutines(char[] s1){
        this.s1=s1;
    }

    public int  process(int i,int j){

        if(i==j){
            return 1;
        }

        int count1=0;
        int count2=0;
        int count3=0;

        if(s1[i]==s1[j]){
            count1=process(i-1,j-1);
        }

        count2=process(i-1,j);

        count3=process(i,j-1);

        return Math.max(Math.max(count1,count2),Math.max(count1,count3));

    }

}
