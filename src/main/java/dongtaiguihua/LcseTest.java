package dongtaiguihua;

public class LcseTest {

    public static void main(String[] args) {

        String str2="wui";
        String str1="whudwdhwidwdoif";

        Lcse lcse=new Lcse(str1.toCharArray(),str2.toCharArray());

        int count=lcse.countNum(lcse.s1.length-1,lcse.s2.length-1,lcse.s1,lcse.s2);

        System.out.println(count);

    }
}
