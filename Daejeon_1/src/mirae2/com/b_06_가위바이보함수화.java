package mirae2.com;

import java.util.Scanner;

public class b_06_가위바이보함수화 {
	public static int doif(int com,int person) {
		int result=0;
		if(person==0) {
			if(com==0) {
				System.out.println("컴퓨터:가위\n");
				result= 2;
			}
			else if(com==1){
				System.out.println("컴퓨터:바위\n");
				result= 1;
			}
			else {
				System.out.println("컴퓨터:보\n");
				result= 0;
			}
		}
		else if(person==1) {
			if(com==0) {
				System.out.println("컴퓨터:가위\n");
				result= 0;
			}
			else if(com==1){
				System.out.println("컴퓨터:바위\n");
				result= 2;
			}
			else {
				System.out.println("컴퓨터:보\n");
				result= 1;
			}
		}
		else {
			if(com==0) {
				System.out.println("컴퓨터:가위\n");
				result= 1;
			}
			else if(com==1){
				System.out.println("컴퓨터:바위\n");
				result= 0;
			}
			else {
				System.out.println("컴퓨터:보\n");
				result= 2;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		//                 0           1      2
		String[] judge= {"이겼습니다.","졌습니다.","비겼습니다."};
		int result =0;
		//person         com
		//              0   1	2
		//           0  2   1   0
		//           1  0   2   1
		//			 2  1   0   2
		int count=0; int win=0; int draw=0;
		int lose=0;
		
		while(true) {
			System.out.println("가위:0 바위:1 보:2 중에 하나를 입력해주세요(종료:9)");
			int person=Integer.parseInt(input.nextLine());
			if(person==9) break;
			int com =(int)(Math.random()*100)%3;
			doif(com,person);
			switch(result) {
			case 0: win+=1; break;
			case 1: lose+=1; break;
			case 2: draw+=1; break;
			}
			System.out.println("게임결과:"+judge[result]);
			}
		System.out.println("----- 게임결과:"+ count+"전"+win+"승"+draw+"비김"+lose+"패.-----\n");
	}

}
