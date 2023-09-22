package mirae.com;

import java.util.Scanner;

public class a_12_while_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		int battle = 0;//전
		int win = 0;//승
		
		String temp="";
		//문제 1 여러번 진행하고 싶을 때, 끝나면 몇점 몇 승 몇 패라고 출력하고 싶습니다.	7번 넘어가면 다음게임
		while(true){//종료 조건
			System.out.println("게임을 하시겠습니까.(시작은 y, 종료는 -1_)");
			temp = sc.nextLine();
			if(temp.isEmpty()||temp.equals("-1")){
				break;
			}
			
			
			int answer=(int) (Math.random()*100)+1;//1~100까지 표시하는 방법 컴퓨터의 선택
			battle+=1;
			int count = 0;
			System.out.println("1~100사이의 숫자를 입력하세요");
			do{
				count++;
				
				input = Integer.parseInt(sc.nextLine());
				if(answer>input) {
					System.out.println("숫자가 너무 작습니다.");
				}
				else if(answer<input){
					System.out.println("숫자가 너무 큽니다.");
				}
				else {
					System.out.println("정답입니다.");
					win+=1;//win=win+1;증가변수
					System.out.println("입력하신 횟수는"+count+"입니다.");
					break;
				}
				
				if(count>7) {
					System.out.println("정해진 횟수를 초과하였습니다.당신은 loser");
					
					break;
				}
			}while(true);
		System.out.printf("%d전 %d 승 %d 패\n", battle, win, battle-win);
		}
	}

}
/*
 * if(answer > input) { System.out.println("숫자가 너무 작습니다."); } else
 * if(answer<input) { System.out.println("숫자가 너무 큽니다."); } else {
 * System.out.println("정답입니다"); System.out.println("입력하신 횟수는"+count+"입니다.");
 * break;
 * 
 * }
 */