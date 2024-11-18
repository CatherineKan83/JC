package main.java.HW2;
public class Identical {
  public static boolean identNull(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && arr[i+1] == 0) {
                return true;
            }
        }
        return false;
    }
}
