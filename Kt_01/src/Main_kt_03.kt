fun main(args: Array<String>) {
    println("나는 main 입니다")
    cases(1)
    cases("Hello")
    cases(System.currentTimeMillis())
    cases(5)
    cases("hello")
    cases(Main_01())
}



fun cases(obj : Any){
    when(obj){
        1 -> println("숫자1")
        "Hello" -> println("문자열 ${obj}")
        is Int -> println("정수형 숫자 ${obj}")
        is Long -> println("실수형 숫자 ${obj}")
        !is String -> println("${obj}는 문자열이 아님")
        else -> println("기타 ${obj}")
    }
}