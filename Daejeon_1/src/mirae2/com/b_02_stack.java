package mirae2.com;

public class b_02_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작 첫 함수 호출");
	    staticMethod1();
	    staticMethod1();
	    
	    System.out.println("메인으로 복귀");
	    System.out.println(fun(3));
	    System.out.println(fun1(2,4,2,1));
	    System.out.println("종료합니다.");
	}
	public static void staticMethod1() {
		int a=10;
		System.out.println("첫 함수 진입");
		staticMethod2();
		System.out.println("첫 번째 함수 호출 종료");
	}
	public static void staticMethod2() {
		System.out.println("두 번째 함수 진입");
		System.out.println("두번째 함수 종료");
	}
	//2x^2+4x+1 수학함수 만들기
	//ax^2+bx+c 함수 만들기
	//
	public static int fun(int x) {
		int ret = (int)(2*Math.pow(x, 2)*(4*x)+1);
		return ret;
	}
	public static int fun1(int a, int b,int x,int c) {
		int ret1 = (int)(a*Math.pow(x, 2)*(b*x)+c);
		return ret1;
	}
}//다 끝나고 나면 메모리에서 main도 사라짐
