class Solution {
    fun solution(n: Int): Int {
        val pizzaNum: Int
        if (n%7 == 0) {
            pizzaNum = n/7
        } else {
            pizzaNum = n/7+1
        }
        return pizzaNum
    }
}