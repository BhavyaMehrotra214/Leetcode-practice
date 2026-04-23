import java.util.*;

class Q5Mergesortedarray {
    public static void merge(int[] nums1, int o, int[] nums2, int n) {
        int i = o - 1;
        int j = n - 1;
        int k = o + n - 1;

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

        System.out.print("Enter o: ");
        int o = sc.nextInt();

        int[] nums1 = new int[o + 100]; 

        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < o; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums2 = new int[n];

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, o, nums2, n);

        System.out.println("Merged Array:");
        for (int i = 0; i < o + n; i++) {
            System.out.print(nums1[i] + " ");
        }

        sc.close();
    }
}