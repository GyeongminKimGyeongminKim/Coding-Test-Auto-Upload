class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = numbers
        for (i in 0 until answer.size) {
            answer[i] = answer[i] * 2
        }
        return answer
    }
}