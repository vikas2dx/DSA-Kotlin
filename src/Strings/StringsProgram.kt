package Strings

class StringsProgram {

    //Traversal
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

    //Two pointers
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

    //Two pointers
    fun reverseString(str: String): String {
        val chars = str.toCharArray()

        var left = 0
        var right = chars.size - 1

        while (left < right) {
            // Swap characters
            val temp = chars[left]
            chars[left] = chars[right]
            chars[right] = temp

            left++
            right--
        }

        return String(chars)
    }


    //Frequency map
    fun findFirstNonRepeatingChar(str: String): Char? {
        val frequencyMap = HashMap<Char, Int>()

        // Step 1: Build frequency map
        for (ch in str) {
            frequencyMap[ch] = frequencyMap.getOrDefault(ch, 0) + 1
        }

        // Step 2: Find first character with frequency 1
        for (ch in str) {
            if (frequencyMap[ch] == 1) {
                return ch
            }
        }

        return null
    }

    /**
     * Finds the length of the longest substring without duplicate characters
     * using the Sliding Window technique with a HashMap.
     */
    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        var maxLength = 0

        var lastSeenIndex = HashMap<Char, Int>()

        for (right in s.indices) {
            val currentChar = s[right]

            // If the character was already seen inside the current window,
            // jump the left pointer just past its previous occurrence
            if (currentChar in lastSeenIndex) {
                val prevIndex = lastSeenIndex[currentChar]!!

                if (prevIndex >= left) {
                    left = prevIndex + 1
                }
            }

            lastSeenIndex[currentChar] = right

            maxLength = maxOf(maxLength, right - left + 1)
        }


        return maxLength
    }
}