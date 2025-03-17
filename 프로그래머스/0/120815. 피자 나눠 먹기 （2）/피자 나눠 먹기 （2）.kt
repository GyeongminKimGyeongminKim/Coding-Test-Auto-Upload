class Solution {
    fun gcd(a: Int, b: Int): Int {
        var x: Int = a
        var y: Int = b
        while(y != 0) {
            val temp = y
            y = x%y
            x = temp
        }
        return x
    }
    
    fun solution(n: Int): Int {
        val pizza = gcd(n, 6)
        return n*6/pizza/6
    }
}