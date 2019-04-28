//parent node is (n-1)/2
//child nodes are 2n+1 or 2n+2

public class MyHeap{
  private static void pushDown(int[] data, int size, int index) {
    int num = data[index];
    if (2 * index + 2 < size) {
      if (num < data[2 * index + 1]) {
        data[index] = data[2 * index + 1];
        data[2 * index + 1] = num;
        num = data[2 * index + 1];
      }
      if (num < data[2 * index + 2]) {
        data[index] = data[2 * index + 2];
        data[2 * index + 2] = num;
        num = data[2 * index + 2];
      }
    }
    else if (2 * index + 1 < size) {
      if (num < data[2 * index + 1]) {
        data[index] = data[2 * index + 1];
        data[2 * index + 1] = num;
        num = data[2 * index + 1];
      }
    }
  }

  private static void pushUp(int[] data,int index) {

  }

  public static void heapify(int[] data) {

  }

  public static void heapsort(int[] data) {

  }
}
