package arrays

class ArrayPrograms {

    // Find Second-Largest Number
    fun secondLargestNumber(nums: IntArray?): Int {
        require(nums != null && nums.size >= 2) {
            "Array must contain at least 2 elements"
        }

        var largest = Int.MIN_VALUE
        var secondLargest = Int.MIN_VALUE

        for (num in nums) {
            if (num > largest) {
                secondLargest = largest
                largest = num
            } else if (num > secondLargest && num < largest) {
                secondLargest = num
            }
        }

        return secondLargest
    }

    // Prefix Sum: Range Sum Query
    fun rangeSumQuery(nums: IntArray?, left: Int, right: Int): Int {
        require(nums != null && nums.isNotEmpty()) {
            "Invalid Input"
        }

        require(left >= 0 && right < nums.size && left <= right) {
            "Invalid Range"
        }

        val prefixSum = IntArray(nums.size + 1)

        for (i in nums.indices) {
            prefixSum[i + 1] = prefixSum[i] + nums[i]
        }

        return prefixSum[right + 1] - prefixSum[left]
    }

    // Two Pointer: Remove Duplicates from Sorted Array
    fun removeDuplicateValues(nums: IntArray) {
        if (nums.isEmpty()) return

        var slow = 0

        for (fast in 1..< nums.size) {
            if (nums[fast] != nums[slow]) {
                slow++
                nums[slow] = nums[fast]
            }
        }

        for (i in 0..slow) {
            println(nums[i])
        }
    }

    // Sliding Window: Find Maximum Sum Subarray of Size K
    fun maxSumSubArraySliding(nums: IntArray?, k: Int): Int {
        require(nums != null && nums.size >= k && k > 0) {
            "Invalid Input"
        }

        var windowSum = 0

        for (i in 0..<k) {
            windowSum += nums[i]
        }

        var maxSum = windowSum

        for (i in k..<nums.size) {
            windowSum = windowSum + nums[i] - nums[i - k]

            if (windowSum > maxSum) {
                maxSum = windowSum
            }
        }

        return maxSum
    }

    // Kadane's Algorithm: Find Maximum Subarray Sum
    fun maxSumSubArrayKadane(nums: IntArray?): Int {
        require(nums != null && nums.isNotEmpty()) {
            "Invalid Input"
        }

        var maxSum = nums[0]
        var currentSum = nums[0]

        for (i in 1..<nums.size) {
            currentSum = maxOf(currentSum + nums[i], nums[i])

            if (currentSum > maxSum) {
                maxSum = currentSum
            }
        }

        return maxSum
    }

    // Hashing: Two Sum
    fun sumTwo(nums: IntArray?, target: Int): IntArray {
        require(nums != null && nums.size >= 2) {
            "Invalid Input"
        }

        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val complement = target - nums[i]

            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }

            map[nums[i]] = i
        }

        throw IllegalArgumentException("No two Sum solution")
    }

    // Prefix Sum + HashMap: Subarray Sum Equals K
    fun prefixSumSubArraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var prefixSum = 0

        val map = HashMap<Int, Int>()
        map[0] = 1

        for (num in nums) {
            prefixSum += num

            val required = prefixSum - k

            count += map.getOrDefault(required, 0)

            map[prefixSum] = map.getOrDefault(prefixSum, 0) + 1
        }

        return count
    }
}