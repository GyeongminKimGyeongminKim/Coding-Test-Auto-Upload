fun main() {
    val n = readLine()!!.toInt() // 첫 줄: 총 입력 줄 수
    val numbers = mutableListOf<Int>() // 최종 숫자 저장할 리스트
    var result = 0
        
    repeat(n) {
        val num = readLine()!!.toInt()
        if (num != 0) {
            numbers.add(num)
        } else {
            // 0을 만나면, 현재까지 저장된 것을 출력하거나 따로 처리
            numbers.removeAt(numbers.size-1)
        }
    }
    
    for(i in 0 until numbers.size) {
        result += numbers[i]
    }
    
    println(result)
}
