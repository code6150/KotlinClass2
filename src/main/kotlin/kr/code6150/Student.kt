package kr.code6150

class Student(id:Int, name:String, score:Int) {

    // 이 안에서 선언 된 변수는 ( 객체가 생성될 때 함께 생성됨 )
    // kotlin 에서의 접근 제어자
    //  - (public)      -> 어디서든 사용 가능 [ 접근 제어자를 붙이지 않았다면 기본값 ]
    //  - private       -> 클래스 내부에서만 사용가능
    //  - protected     -> 상속받은 클래스 내부에서만 사용가능
    //  - internal      -> 같은 모듈 안에서만 사용 가능

    // 클래스 영역 안에서 만들어지는 함수는 해당 객체가 생성되어야지만 호출이 가능
    // def 함수이름(매개변수[typehint 무조건 와야한다])

    var  = id
    var

    fun printInfo() {
        println("이름 [ $id ] 번호 [ $name ] 점수 [ $score ]")
    }

//    companion object {
//        // 동반 객체
//        fun abc() {
//
//        }
//    }

}