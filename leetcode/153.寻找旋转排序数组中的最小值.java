/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 *
 * https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/description/
 *
 * algorithms
 * Medium (50.16%)
 * Likes:    140
 * Dislikes: 0
 * Total Accepted:    32.7K
 * Total Submissions: 65.1K
 * Testcase Example:  '[3,4,5,1,2]'
 *
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * 
 * ( 例如，数组 [0,1,2,4,5,6,7]  可能变为 [4,5,6,7,0,1,2] )。
 * 
 * 请找出其中最小的元素。
 * 
 * 你可以假设数组中不存在重复元素。
 * 
 * 示例 1:
 * 
 * 输入: [3,4,5,1,2]
 * 输出: 1
 * 
 * 示例 2:
 * 
 * 输入: [4,5,6,7,0,1,2]
 * 输出: 0
 * 
 */
// @lc code=start
// 二分 与右边相比
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right) {
            int mid = left + (right - left) / 2;
            if(nums[right] > nums[mid]) {
                right = mid;
            } else if(nums[right] < nums[mid]) {
                left = mid + 1; 
            } else { // 此时left == right
                break;
            }
        }
        return nums[left];
    }
}
// @lc code=end

