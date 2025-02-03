package leetcode.easy.arrays

import com.guicarneirodev.leetcode.easy.arrays.TwoSum
import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class TwoSumTest {
    private val solution = TwoSum()
    // Brute Force
    @Test
    fun `example 1 from leetcode brute`() {
        // Input: nums = [2,7,11,15], target = 9
        val result = solution.twoSum(intArrayOf(2, 7, 11, 15), 9)
        // Output: [0,1]
        assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun `example 2 from leetcode brute`() {
        // Input: nums = [3,2,4], target = 6
        val result = solution.twoSum(intArrayOf(3, 2, 4), 6)
        // Output: [1,2]
        assertArrayEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun `example 3 from leetcode brute`() {
        // Input: nums = [3,3], target = 6
        val result = solution.twoSum(intArrayOf(3, 3), 6)
        // Output: [0,1]
        assertArrayEquals(intArrayOf(0, 1), result)
    }

    // Optimized
    @Test
    fun `example 1 from leetcode opt`() {
        // Input: nums = [2,7,11,15], target = 9
        val result = solution.twoSumOptimized(intArrayOf(2, 7, 11, 15), 9)
        // Output: [0,1]
        assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun `example 2 from leetcode opt`() {
        // Input: nums = [3,2,4], target = 6
        val result = solution.twoSumOptimized(intArrayOf(3, 2, 4), 6)
        // Output: [1,2]
        assertArrayEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun `example 3 from leetcode opt`() {
        // Input: nums = [3,3], target = 6
        val result = solution.twoSumOptimized(intArrayOf(3, 3), 6)
        // Output: [0,1]
        assertArrayEquals(intArrayOf(0, 1), result)
    }
}