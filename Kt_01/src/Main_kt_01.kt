fun main(args: Array<String>) {
    println("나는 코틀린 입니다")

    var intNum = 3
    var strName = "홍길동"

    println("숫자 :" + intNum)
    println("이름 :" + strName)

    var intSum = 0
    var strNum1 = ""

    // 원칙적으로 null값으로도 변수를 선언할 수 없다
    var strName2 = null

    // 명시적으로 변수 타입을 결정할 수 있다
    var intNum2 : Int = 0
    var intNum3 : Int = 3
    var intNum4 : String = "대한민국"

    println("숫자 :" + intNum2)
    println("이름 :" + strName2)

    // 명시적으로 변수 type을 결정하고 ? 를 표기하면 변수 초기화를 지연시켜서 나중에 값을 할당할 수 있다
    var intNum5 : Int?

    println("숫자 :" + intNum2)
    println("이름 :" + strName2)
}