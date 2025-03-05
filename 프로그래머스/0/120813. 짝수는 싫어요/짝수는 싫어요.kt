class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var temp = 1
        for(i in 0 .. (n-1)/2) {
            answer = answer.plus(temp)
            temp += 2
        }
        return answer
    }
}