package mirae.com;

import java.util.Scanner;

public class a_06_if_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스는 사용자 정의 데이터 타입(멤버변수는 클래스마다 만들어짐, 멤버함수 멤버함수는 클래스 정의할때 한번만 만들어짐)
		Scanner input = new Scanner(System.in);//input에는 주소값이 들어간다
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		System.out.println("홀짝 판정을 위한 숫자를 입력하시오");
		int num =input.nextInt();
		
		if(num % 2 == 0)//%는 나머지 연산자 경우의 수 만들때 
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
		
		//헌형 18세 이상이어야 하고 체중이 50kg 이상이어야 함
		// 헌혈이 가능한 경우, 나이가 미만인경우, 체중이 미만인 경우, 나이와 체중이 미만인 경우
		int age = input1.nextInt();
		int wei = input2.nextInt();
		
		if(age>=18&&wei>=50)
			System.out.println("헌혈이 가능합니다.");
		else if(age<18&&wei>=50)
			System.out.println("나이 18세 미만입니다.");
		else if(age>=18 && wei<50)
			System.out.println("몸무게가 50kg미만입니다");
		else if(age<18 && wei<50)
			System.out.println("나이와 체중이 미달입니다.");
		
		//문제 3번 주급 40시간까지는 시간당 100,000으로 계산하고 
		//40시간 초과인 시간에 대해서는 150,000원으로 계산
		//주 작업시간을 입력하면 계산된 주급을 출력하세요
		
		
		
		int time;
		int money = 0;
		final int basictime=40;
		final int paypertime=100000;
		final int payovertime=1500000;
		
		System.out.println("주 작업시간을 입력하세요");
		time = Integer.parseInt(input.nextLine());
		
		if(time>=basictime) {
			money = basictime *paypertime;
			money+=(time-basictime)*payovertime;
	        System.out.println("money");
		}
	    else{
	    	money=time*paypertime;
	    }
		System.out.printf("당신의 주급은 %d원 입니다.\n"+money);
		input.close();
		
		
			
		
		
		
	}

}
