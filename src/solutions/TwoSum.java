package solutions;

import java.util.Arrays;
public class TwoSum {
    public int[] twoSum(int[] nums,int target ){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Kiểm tra với mảng không có cặp nào thỏa mãn
        int[] nums1 = {1, 2, 3, 4};
        int target1 = 10;
        testTwoSum(nums1, target1, solution);

        // Kiểm tra với mảng có số âm
        int[] nums2 = {-1, 2, 3, 5};
        int target2 = 4;
        testTwoSum(nums2, target2, solution);

        // Kiểm tra với mảng có số trùng lặp
        int[] nums3 = {2, 2, 4, 5};
        int target3 = 4;
        testTwoSum(nums3, target3, solution);

        // Kiểm tra với target = 0
        int[] nums4 = {0, 4, 0, 5};
        int target4 = 0;
        testTwoSum(nums4, target4, solution);
    }

    // Phương thức kiểm tra và in kết quả
    private static void testTwoSum(int[] nums, int target, TwoSum solution) {
        int[] result = solution.twoSum(nums, target);
        System.out.println("Mảng: " + Arrays.toString(nums) + ", Target: " + target);
        if (result.length == 0) {
            System.out.println("Không tìm thấy cặp số nào.\n");
        } else {
            System.out.println("Chỉ số: " + result[0] + ", " + result[1] + "\n");
        }
    }
}

