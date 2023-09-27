package mirae4.com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class MemberDto{
	public static int hab;//static 변수는 딱한번만 만들어짐 인스턴스될때마다 만들어지는 것이 아님, 공용변수라 함
	//성적프로그램에서는 학교나 학생수를 저장
	public int num;
	public String name;
	public String addr;
	public MemberDto() {}
	public MemberDto(int num,String name, String addr) {//클래스는 기본적으로 object를 상속받음:clone,equals(==):주소 비교,toString:참조형으로 클래스를 관리 하기 위해
		super();//부모 생성자 호출을 습관으로
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String toString() {
		return "번호: "+num+"이름: "+name+"주소: "+addr;
	}
}
public class e_03_ArrayList_Class {

	public static void main(String[] args) {
		//List와 ArrayList 데이터 타입이 다름->부모 자식관계여야
		//List가 ArrayList으 ㅣ부모
		//부모가 대신 가리킬 때는 부모에 있는 내용만 가능
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<String>();//String 자체는 클래스,
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		for(int i= 0; i<names.size();i++) {
			String tmp=names.get(i);
			System.out.println(tmp);
		}
		for(String tmp:names) {//확장 for문
			System.out.println(tmp);
			
		}
		MemberDto dto1=new MemberDto(1,"김일","둔산동");
		MemberDto dto2=new MemberDto(2,"해골","행신동");
		MemberDto dto3=new MemberDto(3,"","상도동");
		ArrayList<MemberDto> members=new ArrayList<MemberDto>();
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		System.out.println("ArrayList 출력");
		System.out.println("\t"+members);
		
		for(int i=0;i<members.size();i++) {
			System.out.println(members.get(i));
		}
		//첫 번째 데이터를 가리키는 포인터를 알려줌
		ListIterator<MemberDto> listIterator2=members.listIterator();
		while(listIterator2.hasNext()) {//다음이 있느냐: 확인하는 함수
			System.out.println(listIterator2.next());//next는 데이터를 선택
		}
		/*다음 데이터가 없어서? 출력이 안됨
		 * while(listIterator2.hasNext()) {//다음이 있느냐: 확인하는 함수
		 * System.out.println(listIterator2.next());//next는 데이터를 선택 }
		 */
		System.out.println("이터레이터를 거꾸로 운영");
		while(listIterator2.hasPrevious()) {//이전이 있느냐: 확인하는 함수
			System.out.println(listIterator2.previous());//previous 이전 것이 있느냐
		}
		System.out.println("이터레이터를 다시 순서대로 운영");
		while(listIterator2.hasNext()) {//다시 원래 순서대로 출력
			System.out.println(listIterator2.next());//next는 데이터를 선택
		}
		listIterator2=members.listIterator();//처음을 가리킴
		while(listIterator2.hasNext()) {//다시 원래 순서대로 출력
			System.out.println(listIterator2.next());//next는 데이터를 선택
		}
		//구조적 프로그래밍->객체지향프로그래밍->일반화 프로그래밍(generic)->함수화프로그래밍
		//함수화 프로그래밍의 매개변수로는 함수가 옴
		//함수화 프로그래밍은 명시적으로 for문이 없음 
		//자바에서는 함수하나를 만들려고 해도 class를 만들어야 함
		//예외로 람다함수{간단한 함수: 무명함수}를 사용->함수 이름이 없어서 무명함수라 함,화살표함수(C#)라고도 함
		//다시 호출할 일이 없음(쓰고 버리는 놈)
		//void process(a1) {System.out.println(a1.num+" ")};
		members.forEach(a1->{System.out.println(a1.num+" "+a1.name+" "+a1.addr);});//for문 역할을 하면서 데이터를 함수에 던져줌
		
		//
		int hab=0;
		for(int i=0;i<members.size();i++) {
			hab+=members.get(i).num;
		}
		System.out.println("인덱스를 이용한 번호의 합은="+hab);
		//foreach문을 이용해서 num의 합계를 출력해 보시오.
		//static 변수가 필요
		//forEach문을 사용할 때는 클래스 안에 static int hab을 선언해줘야
		MemberDto.hab=0;
		//클래스 내부의 변수나 static 변수 
		
		members.forEach(a1->{MemberDto.hab+=a1.num;});
		System.out.println("반복자를 이용한 번호의 합은= "+MemberDto.hab);
	}

}
