class Solution {
    fun solution(price: Int): Int {
        return when {
            price >= 500000 -> Math.floor(price-price*0.2).toInt()
            price >= 300000 -> Math.floor(price-price*0.1).toInt()
            price >= 100000 -> Math.floor(price-price*0.05).toInt()
            else -> price
        }
    }
}