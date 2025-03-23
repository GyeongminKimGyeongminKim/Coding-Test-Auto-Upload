class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        for(i in num_list.size-1 downTo 0) {
            answer.add(num_list[i])
        }
        return answer.toIntArray()
    }
}