import java.util.*;

class Solution {

    // Merge function (made static so no object needed)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input m
        System.out.print("Enter m: ");
        int m = sc.nextInt();

        int[] nums1 = new int[m + 100]; // extra space

        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input n
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums2 = new int[n];

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Call merge
        merge(nums1, m, nums2, n);

        // Output result
        System.out.println("Merged Array:");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }

        sc.close();
    }
}