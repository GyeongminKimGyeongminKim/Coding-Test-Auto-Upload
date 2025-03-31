class Solution {
    fun solution(my_string: String, letter: String): String {
        val answer = my_string.replace(letter, "")
        return answer
    }
}