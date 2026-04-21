import java.util.*;

class Q4Removeduplicate1 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int a = sc.nextInt();

        int[] nums = new int[a];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < a; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nNew length: " + k);

        sc.close();
    }
}