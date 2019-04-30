import java.util.*;

public class Driver{
  public static void main(String[] args) {
    int[] ary = new int[] {5,7,8,10,9,11,1,3,456,33,88,12,135,6,419,17,4,8,5,21,62,101,54,76,38,234,71,46,71,23,6,143,71,2,56,2};
    System.out.println(Arrays.toString(ary));
    MyHeap.heapsort(ary);
    System.out.println(Arrays.toString(ary));
  }
}
