/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 *
 * https://leetcode-cn.com/problems/move-zeroes/description/
 *
 * algorithms
 * Easy (59.15%)
 * Likes:    503
 * Dislikes: 0
 * Total Accepted:    111.2K
 * Total Submissions: 186.6K
 * Testcase Example:  '[0,1,0,3,12]'
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 
 * 示例:
 * 
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 
 * 说明:
 * 
 * 
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * 
 * 
 */

// @lc code=start
// 暴力
class Solution {
    public void moveZeroes(int[] nums) {
        // 两层循环 找到0则后移 
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                int flag = 0; //判断后移过程中是否全为0
                for(int j=i+1; j<nums.length; j++) {
                    if(nums[j] != 0) flag = 1;
                    nums[j-1] = nums[j];
                }
                nums[nums.length-1] = 0;
                if(flag == 0) return; //全为0 则后移结束
                if(nums[i]==0 && i!=nums.length-1) i--;
            }
        }
    }
}
// @lc code=end

