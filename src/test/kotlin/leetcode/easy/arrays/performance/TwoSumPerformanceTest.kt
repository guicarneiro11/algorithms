package leetcode.easy.arrays.performance

import com.guicarneirodev.leetcode.easy.arrays.TwoSum
import kotlin.test.Test

private fun Any.contentToString(): String = when (this) {
    is IntArray -> java.util.Arrays.toString(this)
    else -> this.toString()
}

class TwoSumPerformanceTest {
    private val solution = TwoSum()

    @Test
    fun `compare solutions performance`() {
        // Vamos testar com diferentes tamanhos de input
        val inputSizes = listOf(100, 1000, 10000, 100000)

        inputSizes.forEach { size ->
            println("\nTesting with array size: $size")

            // Criar array de teste
            val nums = IntArray(size) { it }  // [0,1,2,3,...,size-1]
            val target = size - 2  // Procurar soma que dá size-2

            // Testar solução força bruta
            println("\nBrute Force Solution:")
            val bruteForceResult = measurePerformance(
                { solution.twoSum(nums, target) },
                size
            )
            bruteForceResult.printMetrics()

            // Testar solução otimizada
            println("\nOptimized Solution:")
            val optimizedResult = measurePerformance(
                { solution.twoSumOptimized(nums, target) },
                size
            )
            optimizedResult.printMetrics()
        }
    }

    private fun <T> measurePerformance(
        function: () -> T,
        inputSize: Int
    ): PerformanceMetrics<T> {
        // Warm up JVM
        repeat(100) { function() }

        System.gc() // Tenta limpar memória antes de medir

        val startTime = System.nanoTime()
        val startMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()

        val result = function()

        val endTime = System.nanoTime()
        val endMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()

        return PerformanceMetrics(
            result = result,
            executionTimeMs = (endTime - startTime) / 1_000_000.0, // Convertendo para millisegundos
            memoryUsedKB = (endMemory - startMemory) / 1024.0, // Convertendo para KB
            inputSize = inputSize
        )
    }
}

data class PerformanceMetrics<T>(
    val result: T,
    val executionTimeMs: Double,
    val memoryUsedKB: Double,
    val inputSize: Int
) {
    fun printMetrics() {
        println("Input Size: $inputSize")
        println("Execution Time: $executionTimeMs ms")
        println("Memory Used: $memoryUsedKB KB")
        println("Result: ${result?.contentToString()}")
    }
}