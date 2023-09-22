package mirae2.com;

public class b_01_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//함수: 중복을 방지하고 알고리즘을 재사용하기 위해 
		//함수: 입력 출력 맵핑하는 것
		//자바에서는 메소드라 함 c에서는 함수라 함
		//method: 클래스에서 정의되어야 함
		System.out.println(100+300);
		/*
		 * int num1=100; int num2=200; int result=num1+num2;
		 */
		
		System.out.println("덧셈결과: "+add(100,200));
		/*
		 * num1=200; num2=400; result=num1+num2;
		 */
		System.out.println("덧셈결과: "+add(200,400));//200과 400이 실매개변수
		add(100,200);//함수 호출 방법
		add(200,400);
//		add(200.0f,400.0f);/float형 
		add(200.0f,400.0f);
		add(200.0,400.0);
		multiply(2,3);
		//subtract(400,200);
		int result=subtract(400,200);
		System.out.println(subtract(400,200));
		System.out.println(result);
		
	}
	//사용자 정의 함수
	//static :함수는 class 내에서 선언, 인스턴스하고 사용
	//static을 붙이면 인스턴스하지 않고 사용 가능, 정적 메소드, 인스턴스는 new를 사용한다는 소리
	//이름이 같으면서 다른 데이터 타입으로 만들 수 있는 것: 오버로딩
	//호출 할때 
	//오버로딩: 함수 이름은 같은데 데이터 타입이 다르거나 매개변수 개수가 다르면 다른 함수로 인식한다.
	public static int add(int n1, int n2)//가매개변수//만약에 public이 없으면 클래스 내에서만 사용가능한 메소드가 된다

	{
		int result=n1+n2;
		System.out.println("\n덧셈결과: "+result);
		return result;
	}
	public static float add(float n1,float n2) {
		float result=n1+n2;
		System.out.print("\n덧셈결과: "+result);
		return result;
	}
	public static double add(double n1,double n2) {
		double result=n1+n2;
		System.out.print("\n덧셈결과: "+result);
		return result;
	}
	//문제 1 두 수를 입력받고, 곱해서 리턴하는 함수 작성

	public static int multiply(int n1, int n2) {
		int result=n1*n2;
		return result;
	}
	public static int subtract(int n1, int n2) {
		int result=n1-n2;
		return result;
	}
	public static double divide(int n1,int n2) {
		double result=n1/n2;
		return result;
	}
}
