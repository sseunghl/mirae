package mirae.com;

import java.util.Scanner;

public class a_11_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~100사이의 숫자를 입력하세요");
		int answer=(int) (Math.random()*100)+1;//1~100까지 표시하는 방법 컴퓨터의 선택
		int input = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			input = sc.nextInt();
			
			if(answer > input) {
				System.out.println("숫자가 너무 작습니다.");
			}
			else if(answer<input) {
				System.out.println("숫자가 너무 큽니다.");
			}
			else {
				System.out.println("정답입니다");
				System.out.println("입력하신 횟수는"+count+"입니다.");
				break;
			
			}
			
			if(count>7) {
				System.out.println("정해진 점수를 초과하였습니다.당신은 loser");
				break;
			}
		}while(true);//무한루프
	//문제 1 여러번 진행하고 싶을 때, 끝나면 몇점 몇 승 몇 패라고 출력하고 싶습니다.	7번 넘어가면 다음게임
		
	
	}

}
