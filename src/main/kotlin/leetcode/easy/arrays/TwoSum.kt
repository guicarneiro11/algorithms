package com.guicarneirodev.leetcode.easy.arrays

/**
 * Problem 1: Two Sum
 * https://leetcode.com/problems/two-sum/
 *
 * Approach:
 * - Use HashMap to store complements
 * - Single pass solution
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }

    fun twoSumOptimized(nums: IntArray, target: Int): IntArray {
        val numMap = HashMap<Int, Int>()

        nums.forEachIndexed { index, num ->
            numMap[target - num]?.let { return intArrayOf(it, index) }
            numMap[num] = index
        }

        return intArrayOf()
    }
}