import java.util.Arrays;

public class ArraysCustomClass {

  public static void main(String[] args) {

    int a1 = 1;
    int a2 = 2;
    int a3 = 3;

//----------------------
    int[] data;
    String s = "Hi i am vipin ";
    String s1 = "";
    int[][] data1;
//---------------------

    int[] a = new int[5];
    a[0] = 0;
    a[1] = 1;
    a[2] = 2;
    a[3] = 3;
    a[4] = 4;

    for(int i=0;i<5;i++) {
      System.out.print(a[i]);
    }
    System.out.println();
//------------------------

    int[] b = {1,2,3,4,5};
    System.out.println("Printing using the Arrays class : " + Arrays.toString(b));

  }
}
