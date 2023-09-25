package mirae2.com;

import java.util.Scanner;

public class User {
	
	
	int user;
	
	
	public User() {}
	public int RandUser() {// 사용자로부터 숫자를 입력받는다.
		Scanner sc=new Scanner(System.in);
		user=Integer.parseInt(sc.nextLine());
		return user;
	}
	public void print() {
		System.out.println("가위:0 바위:1 보:2 종료:9 중에서 입력해주세요");
	}

}
