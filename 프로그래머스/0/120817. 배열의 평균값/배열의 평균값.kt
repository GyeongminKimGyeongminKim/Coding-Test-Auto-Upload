class Solution {
    fun solution(numbers: IntArray): Double {
        var sum: Double = 0.0
        for(i in numbers) {
            sum += i
        }
        return sum/numbers.size
    }
}