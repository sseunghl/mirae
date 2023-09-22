package mirae2.com;
//기본형 데이터는 값을 복사하고(별도의 공간에 같이 존재) 참조형 변수는 데이터의 주소를 복사한다.(->같은 공간의 데이터를 2개가 동시에 가리키는 형상이다.)
public class b_04_parameter {//파라메타는 매개변수 가매개변수, 실매개변수
	// 함수 이름은 같은데 타입이 다른 것 오버로딩
    public static void m() {}
    public static void m(int i) {i=99;}//int 데이터 타입 기본형- 값을 전달할때 call by value
    public static void m(Integer i) {i=99;}
    public static void m(int [] arr) {arr[0]=99;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m();
		int i=10;
		m(i);//값만 복사
		System.out.println(i);
		Integer val=10;//wrapper 과도기적 언어라 다 클래스로 작동
		m(val);
		System.out.println(val);//orighin값은 불변
		int [] arr= {10,20,30};// 배열은 참조형, 주소를 저장함
		m(arr);//주소를 넘겨줌 **참조형과 기본형의 비교 주소를 넘기는 이유는 메모리를 절약하기 위해 ex 100개의 배열이 복사되면 100개의 배열 메모리 공간이 필요하기 때문
		System.out.println(arr[0]);
		System.out.println(arr.length);
	}

}
