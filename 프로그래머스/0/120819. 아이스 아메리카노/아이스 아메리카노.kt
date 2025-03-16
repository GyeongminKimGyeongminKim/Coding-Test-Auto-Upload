class Solution {
    fun solution(money: Int): IntArray {
        val americano = money/5500
        val extraMoney = money%5500
        return intArrayOf(americano, extraMoney)
    }
}