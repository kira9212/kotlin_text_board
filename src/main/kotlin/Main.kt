fun main() {


    var arr : MutableList<Int> = mutableListOf<Int>();

    while(true) {
        print("숫자 입력 : ")
        var number : Int = readLine()!!.trim().toInt();

        if (number == 0) {
            println("프로그램 종료")
            break
        }

        arr.add(number);

    }

    for (x in 0.. arr.size-1) {
        println("입력한 숫자 : " + arr[x])
    }
    // 자바 System.out.println();
}

class Main {

}