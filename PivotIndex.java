import java.io.IOException;

public class PivotIndex {
    public static void pivotIndex(int[] nums) {
        if (nums.length != 0) {
            int a[] = new int[nums.length];
            a[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                a[i] = a[i - 1] + nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                if ((a[i] - nums[i]) == (a[a.length - 1] - a[i]))
                    System.out.println(i);
            }
        }
        System.out.println(-1);
    }
//
//    public static int pivotIndex(int[] nums, int a) {
//        int s = nums.length - 1;
//        int rsum = nums[0], lsum = nums[s], li = 0, i = 1;
//        while (i <= s) {
//            if (rsum == lsum && (s - li - i) == 2) {
//                return i;
//            } else if (rsum > lsum) {
//                li++;
//                lsum += nums[s - li];
//            } else {
//                rsum += nums[i];
//                i++;
//            }
//        }
//        return -1;
//    }

    public static void main(String args[]) throws IOException {
        int a[]={1,7,3,6,5,6};
        pivotIndex(a);
    }

}
