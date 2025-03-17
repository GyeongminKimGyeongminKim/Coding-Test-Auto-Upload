class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var temp: Int = 0
        var answer: IntArray = intArrayOf()
        for(i in photo.indices) {
            for(j in photo[i].indices) {
                for(k in name.indices) {
                    if(photo[i][j]==name[k]) {
                        temp += yearning[k]
                    }
                }
            }
            answer = answer.plus(temp)
            temp = 0
        }
        return answer
    }
}