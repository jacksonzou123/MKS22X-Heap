//parent node is (n-1)/2
//child nodes are 2n+1 or 2n+2

import java.util.*;

public class MyHeap{
  private static void pushDown(int[] data, int size, int index) {
    int num = data[index];
    if (2 * index + 2 < size) {
      if (num < data[2 * index + 1] && data[2 * index + 1] > data[2 * index + 2]) {
        data[index] = data[2 * index + 1];
        data[2 * index + 1] = num;
        num = data[2 * index + 1];
        pushDown(data, size, 2 * index + 1);
      }
      else if (num < data[2 * index + 2]) {
        data[index] = data[2 * index + 2];
        data[2 * index + 2] = num;
        num = data[2 * index + 2];
        pushDown(data, size, 2 * index + 2);
      }
    }
    else if (2 * index + 1 < size) {
      if (num < data[2 * index + 1]) {
        data[index] = data[2 * index + 1];
        data[2 * index + 1] = num;
        num = data[2 * index + 1];
        pushDown(data, size, 2 * index + 1);
      }
    }
  }

  private static void pushUp(int[] data,int index) {
    if (n-1 > 0 && data[index] > data[(index - 1)/2]) {
      int num = data[index];
      data[index] = data[(index - 1)/2];
      data[(index-1)/2] = num;
      pushUp(data, (index-1)/2);
    }
  }

  public static void heapify(int[] data) {
    for (int i = data.length / 2; i >= 0; i--) {
      pushDown(data, data.length, i);
    }
  }

  public static void heapsort(int[] data) {
    int size = data.length;
    heapify(data);
    System.out.println(Arrays.toString(data));
    while (size > 0) {
      int large = data[0];
      data[0] = data[size - 1];
      data[size - 1] = large;
      size--;
      pushDown(data,size,0);
      System.out.println(Arrays.toString(data));
    }
  }
}
