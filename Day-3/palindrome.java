public class palindrome {
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}