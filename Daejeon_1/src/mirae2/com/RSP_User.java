package mirae2.com;

import java.util.Scanner;

public class RSP_User {
	String temp=" ";//초기화 안한 변수는 쓰레기값이 들어가 에러가 발생
	int input=0;
	Scanner person;
	public RSP_User() {}//생성자는 리턴값이 없읍
	//디폴트 생성자가 있어야 하는 이유 배열에서 필요로 하기 때문에
	public RSP_User(int input) {//오버로딩:함수 이름은 같은데 매개변수 타입이나 매개변수 개수가 다를 때 
		//다른 함수로 인식하는 것이 오버로딩
		//오버로딩 하는 방식: 함수이름은 같게, 매개변수는 타입이 다르거나 개수가 다르게
		this.input=input;
	}
	public int getUser() {
		System.out.println("가위:0 바위:1 보:2중에 입력해주세요 종료는 -1");
		person=new Scanner(System.in);
		temp=person.nextLine();
		if(temp==null||temp.equals("-1")) {
			return -1;
		}
		input=Integer.parseInt(temp);
		input=input%3;
		return input;
	}
}
