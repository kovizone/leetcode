package com.kovizone.leetcode.page00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/permutations-ii/">47. 全排列 II</a>
 *
 * @author KV
 * @see Solution0046Permutations
 * @since 2022/08/24
 */
public class Solution0047Permutations2 {

    public List<List<Integer>> sdf(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        sdf(nums, new boolean[nums.length], ans, 0, new ArrayList<>());
        return ans;
    }

    public void sdf(int[] nums,
                    boolean[] vis,
                    List<List<Integer>> ans,
                    int idx,
                    List<Integer> perm) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (vis[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1]) {
                continue;
            }
            perm.add(nums[i]);
            vis[i] = true;
            sdf(nums, vis, ans, (idx + 1), perm);
            vis[i] = false;
            perm.remove(idx);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution0047Permutations2().sdf(new int[]{1, 1, 2, 2, 3}));
    }
}