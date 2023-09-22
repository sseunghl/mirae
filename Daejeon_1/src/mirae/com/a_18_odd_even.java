package mirae.com;

import java.util.Scanner;

public class a_18_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int count=0; int win=0; int loss=0;
		for(;;) {
			int com=(int)(Math.random()*2);//0,1
			
			System.out.println("0 (짝), 1(홀)을 입력하세요");
			int person=Integer.parseInt(scan.nextLine());
			if(person==9) break;
			count+=1;
			if(person%2==com) {
				win+=1;
				System.out.println("맞추었습니다.");
			}
			else {
				loss+=1;
				System.out.println("틀렸습니다.(오백원)");
			}
		}
		System.out.println("총게임횟수는"+count+"전:"+win+"승:"+loss+"패 입니다.");
		//가위바위보게임
		String [] result= {"이겼습니다.","졌습니다.","비겼습니다."};
		
		for(;;) {
			
		}
	}

}
