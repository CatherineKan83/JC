package main.java.HW2;
public class DiffMinMax {
  public static int diff(int[]arr) {
        Arrays.stream(arr).sorted();
        return arr[arr.length -1] - arr[0];
    }
}
