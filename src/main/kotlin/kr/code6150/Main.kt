package kr.code6150

import sun.security.jgss.GSSToken.readInt
import javax.management.remote.SubjectDelegationPermission

//fun main() {
//
//    // Kotlin 에서의 변수
//    //  - primitive type 이 없다.
//    //  - Int, Double, Float, Short, Byte, Long, Char, Boolean
//    //  - Class 로 변경됨.
//    //  - 모든 class 는 heap 에 생성됨.
//    //  - 해당 변수가 있는 메모리의위치에 바로 값을 쓴다.
//
//    // fun -> function ( 함수 )
//    //  - 함수 안에서 만들어진 변수는 stack 메모리에 저장이 되었다가, 함수가 끝나면 해당 메모리를 해제한다.
//
//    // class -> 클래스
//    //  - 클래스 안에서 만들어진 변수는 heap 메모리에 저장이 되어있다고, 클래스가 사라지면 해당 메모리를 해제 한다.
//
//
//    // 확장 함수
//    // 문자열 -> String
//
//    // 연산자 오버라이딩이 가능하다.
//    val s1 = "ㅎㅇ."
//
//    println("-" * 20)
//
//}
//
//operator fun String.times(number:Int): String{
//    var result = this
//    for (i in 0 until number){
//        result = result + this
//    }
//
//    return result
//}

// 학생들의 성적을 관리하는 프로그램
// Student
//  - id : 학번 (int 0,1,2,3,4 ...n)
//  - name : 이름 (string)
//  - score : 성적 (int 0~100)
fun main() {

    // print, read

    // 3명의 학생 데이터를 입력을 받고,
    // 해당 데이터를 출력하는 기능
    // list, set, tuple, dict, set -> python
    // [] , List, Set, Map          -> java

    // 변경 가능한 경우 ( mutable )
    //  MutableList, ArrayList, HashSet
    //  HashMap, MutableSet, MutableMap -> kotlin
    val list = List(3) {
        print("이름 : ")
        val number = readln().toInt()
        print("번호 : ")
        val name = readln()
        print("점수 : ")
        val score = readln().toInt()
        Student(number, name, score)
    }

    for (i in list) {
        i.printInfo()
    }

    list.forEach { s ->

    }
    // 변경 불가능한 경우 ( immutable )
    //  List, Map, Set ...              -> kotlin


    // kotlin 은 lambda 와 아주 가까운 관계의 언어

    val a:(Int,Int) -> Int = { x, y -> x + y }

    println(a(10,20))
}
