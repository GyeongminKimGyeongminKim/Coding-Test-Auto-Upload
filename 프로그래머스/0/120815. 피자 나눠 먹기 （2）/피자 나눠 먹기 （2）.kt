class Solution {
    fun solution(n: Int): Int {
        var pizzaNum: Int
        var slice = 6
        if(n%slice == 0) {
            pizzaNum = n/slice
        } else {
            pizzaNum = 1
            while(slice%n != 0) {
                slice += 6
                pizzaNum += 1
            }
        }
        return pizzaNum
    }
}