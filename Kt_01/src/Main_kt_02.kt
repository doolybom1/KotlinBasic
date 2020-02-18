fun main(args: Array<String>) {

    var sum = 0
    for (num in 1..10){
        sum += num
    }
    println("합계" + sum)

    var arrList = ArrayList<String>()
    arrList.add("대한민국")
    arrList.add("Korea")
    arrList.add("Republic of Korea")

    for (str in arrList){
        println(str)
    }
}