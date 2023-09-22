package mirae2.com;

import java.util.Scanner;

public class b_06_teamwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		//                 0           1      2
		String[] judge= {"이겼습니다.","졌습니다.","비겼습니다."};
		int result =0;
		int count=0; int win=0; int draw=0;
		int lose=0;
		while(true) {
			
			System.out.println("가위:0 바위:1 보:2 중에 하나를 입력해주세요(종료:9)");
			int person=Integer.parseInt(input.nextLine());
			if(person==9) break;
			count+=1;
			int com =(int)(Math.random()*100)%3;
			switch(jud(person,com)) {
			case 0: win+=1; break;
			case 1: lose+=1; break;
			case 2: draw+=1; break;
			}
			System.out.println("게임결과:"+judge[result]);
			
		}
		System.out.println("----- 게임결과:"+ count+"전"+win+"승"+draw+"비김"+lose+"패.-----\n");
	}
	
	public static int jud(int person,int com) {
		int result=0;
		if(com==person) {
			result=2;
		}
		else if((com+1)%3==person) {
			result=1;
		}
		else {
			result=0;
		}
		
		return result;
	}
}
