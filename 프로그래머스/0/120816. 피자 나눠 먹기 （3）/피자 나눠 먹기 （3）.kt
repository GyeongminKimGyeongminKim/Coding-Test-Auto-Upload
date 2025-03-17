class Solution {
    fun solution(slice: Int, n: Int): Int {
        if(n%slice>0) {
            return n/slice+1
        }
        return n/slice
    }
}