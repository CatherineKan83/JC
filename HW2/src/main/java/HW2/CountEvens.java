package main.java.HW2;
public class CountEvens {
  public static int even(int[]arr) {
        int count = 0;
        for (int i = 0; i <arr.length; i++) {
            if(i % 2 ==0) {
                count++;
            }
        }
    return count;
    }
}
