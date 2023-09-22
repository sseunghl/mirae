package mirae2.com;

import java.util.Scanner;

public class b_03_box {//클래스는 참조형변수, 반드시 new를 해줘야-static이 붙은 것들은 예외

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 : 밑변, 넓이, 높이를 입력받아 부피를 계산하는 함수를 작성하고 
		//밑변: 10 넓이: 20, 높이: 30인 박스의 부피를 계산하시오.
		Scanner input= new Scanner(System.in);
		b_03_box mt= new b_03_box();// 주소값은 힙
		//mt는 스택 mt의 스택에 주소값이 들어있고 주소값으로 들어가면 데이터가 있다
		System.out.println("밑변, 넓이, 높이를 입력하시오");
		int width=input.nextInt();
		int column=input.nextInt();
		int height=input.nextInt();
		System.out.println("부피는 계산 결과는 ="+mt.vol(width,column,height));//vol이 mt에 있다고 알려줘야->인스턴스
		System.out.println("정삼각형 넓이 계산 결과는="+tot(width,height));
         // 인스턴스: 클래스가 필요한 데이터의 공간을 heap에 확보하는 일
	}
	// static 없을 때 인스턴스 
   public int vol(int a,int b, int c) {
		int result;
		result= a*b*c;
		return result;
	}
   
   //정삼각형 넓이를 구하는 함수 만들기
   public static int tot(int width , int height ) {
	   int result=(int)width*height/2;
	   return result;
   }

}
