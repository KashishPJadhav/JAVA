package MyMath;

public class Stat {

    public int min(int[] arr) {
        int minVal = arr[0];
        for (int num : arr) {
            if (num < minVal) {
                minVal = num;
            }
        }
        return minVal;
    }

    public int max(int[] arr) {
        int maxVal = arr[0];
        for (int num : arr) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return maxVal;
    }

    public int count(int[] arr) {
        return arr.length;
    }

    public int sum(int[] arr) {
        int sumVal = 0;
        for (int num : arr) {
            sumVal += num;
        }
        return sumVal;
    }

    public double average(int[] arr) {
        return sum(arr) / (double) count(arr);
    }
}
