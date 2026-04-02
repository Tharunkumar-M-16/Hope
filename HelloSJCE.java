public class HelloSJCE {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        int[] res = leadArr(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] leadArr(int[] arr) {
        int len = arr.length;
        if (len == 0)
            return new int[0];

        int[] temp = new int[len];
        int max = arr[len - 1];
        temp[0] = max;
        int count = 1;

        for (int i = len - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                temp[count] = max;
                count++;
            }
        }

        int[] res = new int[count];

        for (int i = 0; i < count; i++) {
            res[i] = temp[count - 1 - i];
        }
        return res;
    }
}
