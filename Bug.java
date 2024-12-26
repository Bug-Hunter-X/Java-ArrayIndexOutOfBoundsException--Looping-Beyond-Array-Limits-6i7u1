public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = i * 10; // This will throw ArrayIndexOutOfBoundsException
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}