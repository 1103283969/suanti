package ArryList;


public class MaxWindowTest {

    public static void main(String[] args) {
              MaxWindow maxWindow =new MaxWindow();

              for(int i = 0; i<10; i++){
                  maxWindow.arr.add(i);
              }

              System.out.println(maxWindow.arr);

              System.out.println(maxWindow.getMaxWindow(9));
    }
}
