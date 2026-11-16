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
}