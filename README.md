# Java_studying

<br>

********이차원배열
int[][] myNumber = {{1,2,3,4},{5,6,7}}

********for 일정 범위만큼 할라면

for(int i =0; i<10; i++){

}

********for 배열 내 요소 빼올라면

for(int i:arrayname){

}

********이차원 배열 요소 빼내기
for(int i=0; i<myNumber.lenth; i++){
	for (int j=0; j<myNumber[i].lenth; j++){
		System.out.println(myNumber[i][j]);
	}
}

** void
-> 매소드에 리턴값이 없는 경우에 void를 반드시 추가해줘야한다.

** public
-> 외부에서 접근 가능함
** final
-> 생성과 동시에 초기화. 값 변경이 불가하다.
** private
-> 외부에서 접근 불가
(but 클래스 내에서 메소드를 통하여(setABC , getABC) 접근 가능. = 캡슐화. 보안성good )
** default
-> private, public 등 접근 제어자 미사용시 클래스,함수,멤버변수,생성자는 동일패키지에서만
접근 가능
** protected
->  동일패키지 또는 다른패키지의 하위 클래스에서만 접근 가능
** static
-> 매소드,멤버변수에 사용. 클래스에 속하게되며, 객체의 생성없이 바로접근가능.
** abstrack
-> 클래스에 사용시 객체생성 불가능. 오직 다른 클래스가 상속받아서 사용해야함.
(메소드에 사용시 오직 abstract 클래스에서만 abstract매소드 정의 가능 = 객체지향의 추상화)
(슈퍼클래스에서 중괄호없이 abstract class 만 생성  (생성만한다.)  )

** 멤버변수(속성)
->클래스 내부에 선언된 변수

** 생성자
-> 클래스내에서 클래스 이름을 그대로 적고 매개변수를 적는다. (괄호열고 코딩)
생성자에선 멤버변수의 초기화를 하거나 값을 응용해서 초기화를 진행한다.
(메소드처럼 여러개 가질 수 잇다.)

** 다른 패키지의 클래스를 쓰고싶으면 import 이용 !

** 상속은 언제사용?
-> 상속은 코드를 재사용하는데 유용하다. 이미 존재하고 검증된 클래스의 멤버변수와 
매소드를 재사용해서 새로운 클래스를 만들 때 사용한다.

** 인터페이스
-> 인터페이스는 완전한 추상 클래스. (public interface NAME)
-> 모든 매소드들이 abstract처럼 정의만 된다.  몸체( {}  ) 적을 수 없다.
-> 상속은 하나밖에 안되지만, 인터페이스 상속은 여러개가 가능하다.(implements)
-> 최대장점  다중상속 !!!! 자바는 원래 클래스당 1개밖에 상속이 안됨.

** 내부클래스
-> 클래스안에 클래스를 선언한 것. (관리와 파악이 3용이해진다.)
-> 1. 외부클래스의 객체를 생성한다.
-> 2. 생성한 외부클래스 객체를 이용하여 내부클래스 객체 또한 생성한다.
	(외부클래스 NAME = 외부객체.new 내부클래스)

** 열거형
-> 서로 관련있는 상수들을 모아둔 클래스와 비슷한 형식.
-> 다른 클래스 상속 불가
-> 객체 생성 불가
-> 값의 재할당 불가
-> 보통 메소드는 생성하지 않는다.

** ArrayList
-> 배열과 다르게 크기 조정이 가능함. 보통 동일한 데이터타입을 저장할 때 많이 사용.
-> 데이터타입. Integer / String / Boolean / Characther / Float / Double / Byte
arrayList.size()   //  arrayList.get(인덱스번호)
to int => Integer.parseInt
to str => .toString()

** HashMap
-> 키와 값이 1:1저장. 키와 값의 자료형은 달라도됨.  (파이썬의 딕셔너리인듯..?)
hashMap.size() / hashMap.keySet()  (키)  / hashMap.values()  (값)

** Stack
-> 선입 후출 (LiFo)
-> Stack<Integer> Name = new Stack<Integer>()
stack.push(값) / stack.pop() / stack.peek()  (pop하지않고 값만 확인)

** Queue
-> 선입 선출(FiFo)
-> 자바에서는 큐를 클래스로서 직접 제공하지않음. 인터페이스로 큐를 제공.
(큐를 사용하고자 하면, 함수로서 직접 구현을 해야함.)
-> queue.add(값) / queue.poll()

** Stream
-> 단일 방향의 흐름을 의미. (데이터를 입력 : 입력 스트림  // 테이터를 출력 : 출력 스트림)
-> 단방향 이기에 입력과 출력이 동시에 이뤄질 수 없음.

** 쓰레드
-> 한개의 프로그램에서 여러 작업을 가능케 해주는 것
-> 멀티쓰레드 : 여러가지 작업을 동시에 병렬로 진행  ****비동기
 ( ***동기 하나하나의 작업을 처리해가는 방식)

** 싱글톤 패턴
-> 클래스의 인스턴스(객체)가 하나만 생성되도록 하는 개발방법


** 디버그
debug : 버그를 한줄 한줄 찾아내고 체크가 가능
Step over : 한줄씩 코드 실행
Step into : 메소드의 형태를 볼 수 있다.
Step return : 다시 돌아옴
Resume : 디버거 실행
Terminate : 디버거가 끝남

** 입출력
Argument - 프로그램 실행할때 text 정보를 주는 것

** Constructer
다른 클래스를 활용해서 인스턴스를 생성할 수 있으면 constructer을 가지고 있는 것이다.
 PrintWriter      p1     =  new    PrintWriter("result1.txt");
 데이터타입   변수명  =   new         Constructer

메소드는 서로 연관된 코드를 그룹핑해서 이름을 붙힌 정리정돈의 상자다.

클래스는 서로 연관된 변수와 메소드를 그룹핑 한것이다. 그리고 거기에 이름을 붙인것이다. (정리정돈의 상자이다.)\

인스턴스는 하나의 클래스를 복제해서 서로 다른 데이터의 값과 서로 같은 매소드를 가진 복제본이다.
=> new를 이용해서 인스턴스 생성 ( 붕어빵 틀로 만들어낸 붕어빵)

클래스를 인스턴스 
=>객체
=> 이객체를 뼈대로 프로그래밍하는 것이 객체지향프로그래밍(OOP)

public
=> 
private
=> 같은 클래스 내에서만 사용가능

static  - class method    클래스.매소드
=> static은 no static의 변수와, 매소드에 접근 불가.
no static - instance method   인스턴스.매소드
=> no static은 static에도 접근가능

인스턴스가 static 변수를 변경하면 클래스 변수 자체가 변경이된다.
인스턴스가 no static 변수를 변경하면 그 인스턴스에 대한 변수만 변경된다. ( 독립적으로다가 !)


생성자 (constructer)
=> 클래스를 정의할때 클래스랑 똑같은 이름의 매서드를 만든다..... 
=> 이렇게하면 new를 할때 인자를 넘겨줄수있다.

this
=> 클래스가 인스턴스화 되었을 때 해당 인스턴스를 가르키는 것

Interface
=> 매소드 이름, 형식, 파라미터 등은 적지만 매소드 내용은 적지않는다.....
	=> implements 한 클래스가 그 매소드들을 정의해야한다.




