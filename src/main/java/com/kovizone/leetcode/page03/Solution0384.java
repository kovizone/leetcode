package com.kovizone.leetcode.page03;

/**
 * <a href="https://leetcode.cn/problems/shuffle-an-array/">384. 打乱数组</a>
 *
 * @author KV
 * @since 2023/02/06
 */
public class Solution0384 {

    int[] nums;
    int[] res;

    public Solution0384(int[] nums) {
        this.nums = nums;
        this.res = new int[nums.length];
        System.arraycopy(nums, 0, res, 0, res.length);
    }

    public int[] reset() {
        return this.nums;
    }

    public int[] shuffle() {
        for (int i = 0; i < nums.length; i++) {
            int random = (int) (Math.random() * nums.length);
            int temp = this.res[i];
            this.res[i] = this.res[random];
            this.res[random] = temp;

        }
        return this.res;
    }
}
