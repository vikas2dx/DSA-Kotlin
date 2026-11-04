package basic
class BasicProgram {

    fun isPrimeNumber(number: Int): Boolean {
        if (number <= 1) return false

        for (i in 2..number / 2) {
            if (number % i == 0) return false
        }

        return true
    }

    fun isPalindrome(num: Int): Boolean {
        var temp = num
        var reverse = 0

        while (temp != 0) {
            val digit = temp % 10
            reverse = reverse * 10 + digit
            temp /= 10
        }

        return num == reverse
    }

    fun fibonacciNumber(num: Int) {
        var a = 0
        var b = 1

        println(a)
        println(b)

        for (i in 0..<num) {
            val c = a + b
            println(c)

            a = b
            b = c
        }
    }

    fun isArmStrongNumber(num: Int): Boolean {
        if (num < 0) return false

        var temp = num
        var sum = 0

        val digits = num.toString().length

        while (temp != 0) {
            val digit = temp % 10
            var power = 1

            for (i in 0..<digits) {
                power *= digit
            }

            sum += power
            temp /= 10
        }

        return sum == num
    }

    fun factorialRecursion(num: Int): Int {
        require(num >= 0) {
            "Factorial is not defined for negative numbers"
        }

        if (num == 0 || num == 1) return 1

        return num * factorialRecursion(num - 1)
    }

    fun factorial(num: Int): Int {
        require(num >= 0) {
            "Factorial is not defined for negative numbers"
        }

        if (num == 0 || num == 1) return 1

        var result = 1

        for (i in 2..num) {
            result *= i
        }

        return result
    }

    fun isPalindrome(text: String): Boolean {
        var left = 0
        var right = text.length - 1

        while (left < right) {
            if (text[left] != text[right]) return false

            left++
            right--
        }

        return true
    }

    fun isLeapYear(year: Int): Boolean {
        return year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)
    }

    fun countDigits(num: Int): Int {
        var number = kotlin.math.abs(num)

        if (number == 0) return 1

        var count = 0

        while (number != 0) {
            number /= 10
            count++
        }

        return count
    }

    fun gcd(a: Int, b: Int): Int {
        var x = a
        var y = b

        while (y != 0) {
            val remainder = x % y
            x = y
            y = remainder
        }

        return x
    }

    fun isMirrorArray(nums: IntArray?): Boolean {
        if (nums == null) return false

        var left = 0
        var right = nums.size - 1

        while (left < right) {
            if (nums[left] != nums[right]) return false

            left++
            right--
        }

        return true
    }

    fun countCharacter(text: String?, target: Char): Int {
        if (text == null) return 0

        var count = 0

        for (i in text.indices) {
            if (text[i] == target) {
                count++
            }
        }

        return count
    }
}
