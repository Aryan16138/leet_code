public class maximum_sum_subarray {
    public static int maxSubArray(int[] a) {
        int maxAbs = a[0];
        int localMax = 0;
        int i = 0;
        while (i < a.length) {
            localMax = localMax + a[i];
            if (maxAbs < localMax)
                maxAbs = localMax;
            if (localMax < 0)
                localMax = 0;
        }
        return maxAbs;
    }

    public static void main(String args[]) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(a));
    }
}
