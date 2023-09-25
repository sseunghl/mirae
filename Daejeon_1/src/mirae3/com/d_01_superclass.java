package mirae3.com;

//inheritance(상속)
//부모클래스(super class)+자식클래스(sub class)
//공통부분을 정의한 부모-자식이 공용
//부모는 자식을 가리킬 수 있다. (제약사항: 부모에 있는 것만 가리킬 수 있음)
// 자식이 추가한 내용을 가리킬 때는 downcasting 필요(자식으로 환원한다.)
// overriding 재정의
// 함수 이름도 같고 매개변수 타입이나 개수가 같은데 재정의를 통해 다른 일을 함
class Super_class{
	int num=20;
	public void display() {
		System.out.println("슈퍼클래스에서 출력");
	}
}
// 부모의 함수를 재정의해도 부모의 함수가 사라지는 것은 아니다.
// 다만 자식의 입장에서 자신의 재정의 함수가 우선한다.

//부모의 멤버변수는 재정의하지 않는 것으로 한다.

public class d_01_superclass extends Super_class {// superclass가 자식 Super_class가 부모

	int num =10;//부모 꺼를 재정의, 멤버변수 재정의
	public void display() {//오버라이딩, 메소드 재정의
		System.out.println("서브클래스에서 출력");
	}
	
	public void my_method() {
		d_01_superclass sub= new d_01_superclass();// 자식 클래스 인스턴스
		sub.display();//자식 호출
		super.display();//부모의 함수
		display();//자식 호출
		System.out.println("자식의 변수: "+sub.num);
		System.out.println("부모의 변수:"+super.num);//부모를 호출할 땐 super를 붙여준다
		System.out.println("자식의 변수:"+ num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d_01_superclass obj= new d_01_superclass();//자식 클래스 인스턴스
		obj.display();//자식 클래스의 함수가 실행이 됨
		obj.my_method();//
	}

}
