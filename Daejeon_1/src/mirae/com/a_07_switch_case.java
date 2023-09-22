package mirae.com;

import java.util.Scanner;

public class a_07_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int day;
		day = input.nextInt();
		day = day%7+1;
		String weekday="";//이거를 만약 안써주면 case마다 println을 일일히 써줘야
		switch (day) {
		case 1: weekday ="월요일"; break;
		case 2: weekday ="화요일"; break;
		case 3: weekday ="수요일"; break;
		case 4: weekday ="목요일"; break;
		case 5: weekday ="금요일"; break;
		case 6: weekday ="토요일"; break;
		case 7: weekday ="일요일"; break;
		
		}
		System.out.println("오늘은"+weekday+"입니다.");
		
		
		//문제 1 정수를 입력받고 학점으로 변환시켜 출력하기
		//90~100 A, 80~89 B, 70~79 C, 60~69 D 그 외는 F

		System.out.println("점수를 입력하세요");

		int score=input.nextInt();
		char grade=' ';// 공백도 문자, char는 초기화 되어야
		
		
		switch(score/10) {
		case 10: //break가 없으면 다음 case로 바로 넘어감
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='E'; 
		}
		System.out.println("귀하의 점수는"+grade+"입니다.");
		
		// 문제 2 년도와 월을 입력하면 결과로 말일이 몇일인지 알고싶다
		// 2월은 년도를 4로 나눠서 떨어진 것= 윤달 중 100으로 나누어서 떨어지면= 윤달아님 400으로 나누어서 떨어지면 윤달
		System.out.println("년도를 입력하세요");
		int year= input.nextInt();
		
		System.out.println("월을 입력하세요");
		int month = input.nextInt();
		int days = 0;
		//1,3,5,7,8,10,12=31일
		//4,6,9,11=30일
		//2월
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			days=31;
		}
		else if(month==2) {
			days=28;
		}
		else {
			days=30;
		}
		switch(days) {
		case 31: break;
		case 28: 
			/*if(year%4==0) {
				if(year%100==0) {
					days=28;
					System.out.println(year+"년도는 윤달이 아니고 이번 달은"+days+"일 입니다.");
				}
				else if(year%100!=0) {
					if(year%400==0) {
						days=29;
						System.out.println(year+"년도는 윤달이고"+days+"일 입니다.");
					}
					else {
						days=28;
						System.out.println(year+"년도는 윤달이 아닙니다"+days+"일 입니다.");
					}
				}
			}//내가 쓴 코드*/
			if(((year%4==0)&&!(year%100==0))||(year%400==0))
				days=29;
			else
				days=28;
			break;
		case 30:
			break;
		default:
			System.out.println("해당 년월은 없습니다.");
		}
		System.out.println(year+"년도"+month +"달은"+days+"입니다.");
		
	
		
	}

}
