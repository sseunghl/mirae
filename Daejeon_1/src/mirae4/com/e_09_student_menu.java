package mirae4.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
// grade gd=new grade();
//gd 가 자동으로 g0 g1 g2 이렇게 추가됨
//컴퓨터: 연산자. 제어문(판단문, 반복문)->비교연산자, 논리연산자
//과제 클래스를 만들어 
//문제1: 등수내는 함수->총점 기준으로 정렬 후(내림차순), 등수변수에 1234로 채우면 된다.-> 번호로 다시 정렬?
//문제2:수정할때 이름으로 수정했는데 국수영 점수 수정
// parseInt=>문자열을 형변환 시켜주긴 하지만 숫자로 이루어진 문자열만 받을 수 있고, 아스키코드를 이용한 숫자로 형변환하고 싶다면 int asc=(int)'1'-'0';
class Student{//비교 지정
	public int grade;
	public int no;
	public String name;
	public int kor;
	public int mat;
	public int eng;
	public int total;
	public double average;
	public int ranking;
	public Student() {}
	public Student(int no,String name,int kor,int mat,int eng) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.mat=mat;
		this.eng=eng;
		calcTotal();
		calcAverage();
	}
	public void setNo(int no){
		this.no=no;
	}
	public Integer getNo() {
		return Integer.valueOf(no);//자료구조에서는 기본데이터타입은 안됨
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		calcTotal();
		calcAverage();
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
		calcTotal();
		calcAverage();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		calcTotal();
		calcAverage();
	}
	public Integer getTotal() {
		return Integer.valueOf(total);
	}
	
	public double getAverage() {
		return average;
	}
	public int getGrade() {
		return grade;
	}
	
	public void calcTotal() {
		total=kor+mat+eng;
		
	}
	public void calcAverage() {//static 함수
		average=Math.round(total/3.0*100)/100;
	}
	
	public String toString() {//object 최상위부모 : 자동출력
		return ranking+no+" "+name+" "+kor+" "+mat+" "+eng+" "+total+" "+average;
	}
	public Comparator<Student> stdcompare(){
		Comparator<Student> comp=new Comparator<Student>() {
		public int compare(Student stu1,Student stu2) {
			return stu1.getNo().compareTo(stu2.getNo());//오름차순
		}
	};
		return comp;
	
	}
	public  Comparator<Student> compareTot() {
		Comparator<Student> comp1 =new Comparator<Student>() {
			public int compare(Student stu1,Student stu2) {
				return stu2.getTotal().compareTo(stu1.getTotal());//내림차순
			}
		};
			return comp1;
		
		}
	
	}
	

public class e_09_student_menu {
	static Scanner in = new Scanner(System.in);//외부접근 안함
	//ArrayList<Student> stud= new ArrayList<Student>();여기에 쓰려면 앞에 static
	public static void inputinfo(List<Student>list) {
		//데이터를 입력->student class 작성->매개변수로 넘어오는 자료구조에 전달
		Student st=new Student();
		System.out.println("1번을 선택하셨습니다.");
		System.out.println("번호를  입력하세요");
		st.no=Integer.parseInt(in.nextLine());
		System.out.println("이름을 입력하세요");
		st.name=in.nextLine();
		boolean re= false;
		while(!re) {
			re=true;
			do {
				try {
					System.out.println("국어 점수를 입력하시오: ");
					st.setKor(Integer.parseInt(in.nextLine()));
					
				}catch(NumberFormatException e) {
					System.out.println("숫자를 입력해주세요");
					re=false;
				}
			}while(st.kor<0||st.kor>100);//숫자를 0초과 100이하
		}
		System.out.println("수학 점수를 입력하세요: ");
		st.setMat(Integer.parseInt(in.nextLine()));
		//st.mat=Integer.parseInt(in.nextLine());
		System.out.println("영어 점수를 입력하세요:");
		st.setEng(Integer.parseInt(in.nextLine()));
		//st.calcTotal(); setMat이랑 setEng 에서 호출
		//st.calcAverage();
		list.add(st);
		System.out.println("데이터가 입력되었습니다.");
	}
	public static void display(List <Student>list) {
		System.out.println("***입력데이터 출력***");
		System.out.println("번호 이름 국어 수학 영어 총점 평균");//나중에 맞춰주기
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()) {
			Student st= itr.next();
			System.out.println(st);
		}

	}

	
	 public static void displayTot(List<Student>list,int grade) { 
		 System.out.println("*** 등수 출력***");
		 System.out.println("등수 번호 이름 국어 수학 영어 총점 평균");
		 Iterator<Student> itr1=list.iterator();
		 while(itr1.hasNext()) {
			 Student st=itr1.next();
			 System.out.println("%d"+grade+st);
		 }
	}
	 
	public static  void  sort(List<Student>list) {
		Collections.sort(list,list.get(0).stdcompare());
		display(list);
	}
	public static int search(List<Student>list) {
		System.out.println("검색할 번호를 입력해주세요");
		int no=Integer.parseInt(in.nextLine());
		int index=Collections.binarySearch(list,new Student(no,null,0,0,0),list.get(0).stdcompare());
		System.out.println("이진검색으로 찾은 인덱스:"+index);
		if(index!=-1) {
			System.out.println("검색된 데이터");
			System.out.println(list.get(index));
			//수정할때도 사용하기 위해서
			return index;
		}
		else {
			System.out.println("검색된 데이터가 없습니다.");
			return -1;
		}
	}
	public static void delete(List<Student>list) {
		int index = search(list);
		if(index!=-1) {
			list.remove(index);
			System.out.println("데이터가 삭제되었습니다.");
		}
		else {
			System.out.println("검색한 데이터가 없습니다.");
		}
	}
	
	 public static void sortTot(List<Student>list) {
	  Collections.sort(list,list.get(0).compareTot()); 
	  display(list);
	  }
	
	
	public static void edit(List<Student>list) {//이름으로 수정
		System.out.println("** 수정하고자 하는 이름을 입력하시오.");
		String inputValue=in.nextLine();
		Iterator<Student>itr=list.iterator();//for문 index,확장 for문 사이에 존재하는 문법으로 
		//처음 iterator를 얻으면 데이터의 첫번째 데이터를 가리키게 됨==포인터 역할==*point++;
		// for문은 데이터를 인덱스를 다루는 것이고  이터레이터나 확장 for문은 데이터를 직접 가리켜서 저장
		//itrator 인덱스 에러가 없음
		//itrator 대신에 foreach문 사용가능 
		while(itr.hasNext()) {
			Student stu=(Student)itr.next();
			if(inputValue.equals(stu.name)) {
				System.out.println("변경할 이름을 입력하시오");
				String changeValue=in.nextLine();
				stu.setName(changeValue);
			}
		}
		display(list);
		System.out.println("**수정완료**");
	}
	public static void ranking(List<Student>list) {
		sortTot(list
				);//총점으로 정렬
		Iterator<Student> itr=list.iterator();
		int i=0;
		while(itr.hasNext()) {
			Student stu=(Student)itr.next();
			i+=1;
			stu.ranking=i;
			}
		sort(list);

	}
	public static int windowfor(List list) {//메뉴는 무한루프//리스트를 받는 이유는 부모가 자식을 가리킬 수 있어서 링크드 리스트를 받더라도 동작하도록 하려고//프로그램을 일반화 시키는 것//Arraylist도 가능
		while(true) {
			System.out.println("====================성적관리=================");
			System.out.println("------------------------------------------");
			System.out.println("1번 입력 2번 출력 3번 정렬 4번 조회 5번 수정 6번 삭제 7번 등수 9번 종료");
			System.out.println("메뉴를 선택하시오");
			int ch=0;
			try {
				ch=Integer.parseInt(in.nextLine());//입력할때 문자로 받으니까-> 꼬이지 않도록 문자를 변환
			}catch(NumberFormatException e) {
				
			}
			switch(ch) {
			case 1: inputinfo(list);break;
			case 2: display(list);break;
			case 3: sort(list); break;
			case 4: search(list); break;
			case 5: delete(list); break;
			case 6: edit(list);break;
			case 7: ranking(list);break;
			case 9: System.out.println("프로그램을 종료합니다.");
					in.close();//윈도우 자원을 사용하는 객체는 반드시 종료시키기(네트워크,데이터베이스, 입출력객체, 파일객체)->종료 안하면 10번정도 커넥션하고 커넥션이 안됨
					return 0;//함수 자체를 벗어나고 break;는 스위치 문을 벗어나는 것 
			default:
				System.out.println("잘못 선택하였습니다.");
				break;
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Student> stud= new ArrayList<Student>();
		windowfor(stud);
		
	}

}
