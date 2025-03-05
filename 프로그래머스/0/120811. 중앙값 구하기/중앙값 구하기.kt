class Solution {
    fun solution(array: IntArray): Int {
        array.sort()
        val index = array.size / 2
        return array[index]
    }
}