# LeetCode Solutions in Kotlin

This repository contains my solutions to LeetCode problems, implemented in Kotlin. Each solution includes unit tests and performance analysis.

## 🚀 Project Structure

```
src/
├── main/kotlin/
│   ├── datastructures/    # Data structure implementations
│   ├── algorithms/        # Core algorithms
│   └── leetcode/         # LeetCode solutions
│       └── easy/
│           └── arrays/
│               └── TwoSum.kt
└── test/kotlin/
    └── leetcode/
        └── easy/
            └── arrays/
                ├── TwoSumTest.kt
                └── TwoSumPerformanceTest.kt
```

## 📝 Solved Problems

### Arrays and Hashing

#### 1. Two Sum (Easy)
- **Problem**: [LeetCode - Two Sum](https://leetcode.com/problems/two-sum/)
- **Solutions**:
  - Brute Force (O(n²))
  - Optimized with HashMap (O(n))
- **Performance**:
  - Detailed runtime analysis
  - Memory usage comparison
  - [View Solution](src/main/kotlin/leetcode/easy/arrays/TwoSum.kt)

## 🔍 Running Tests

```bash
# Run all tests
./gradlew test

# Run tests for a specific problem
./gradlew test --tests "leetcode.easy.arrays.TwoSumTest"

# Run performance tests
./gradlew test --tests "leetcode.easy.arrays.performance.TwoSumPerformanceTest"
```

## 📊 Performance Analysis

Each solution includes:
- Performance tests with different input sizes
- Time and space complexity analysis
- Comparison between different approaches
- Runtime distribution visualization

## 🛠️ Tech Stack

- Kotlin 1.9.0
- JUnit 5
- Gradle

## 📌 Coding Standards

Each solution includes:
- Documentation with time/space complexity
- Unit tests
- Performance tests
- Multiple approaches (when relevant)

## 🎯 Next Problems

- [ ] Valid Parentheses
- [ ] Climbing Stairs
- [ ] Binary Search
- [ ] Reversed Linked List
- [ ] Palindrome Number
- [ ] Contains Duplicate
- [ ] Valid Anagram
- [ ] Maximum Subarray

## 🤝 Contributing

Feel free to:
1. Suggest improvements to existing solutions
2. Propose new solutions
3. Report bugs
4. Add more test cases

## 📖 Study Resources

- [LeetCode Patterns](https://github.com/seanprashad/leetcode-patterns)
- [Coding Interview Patterns Guide](https://hackernoon.com/14-patterns-to-ace-any-coding-interview-question-c5bb3357f6ed)
- [Algorithm Complexity](https://www.bigocheatsheet.com/)
