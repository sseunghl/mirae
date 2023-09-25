package mirae2.com;

public class c_02_Student {
//클래스에서는 초기화하지 않으면 자동으로 0으로 초기화해준다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student("대한이",100,100,90);
		Student st2=new Student("민국이",90,90);
		Student st3=new Student("만세");
		st1.print();
		st2.print();
		st3.print();
	//문제 1: 민국이의 영어점수를 88점으로 세팅, 만세의 국어99 영어88 수학77로 점수를 세팅
		//대한이의 국어 점수를 80점으로 변경 대한이의 수학점수를 출력해보시오
		
		st1.setKoreansc(80);
		System.out.print("대한이의 수학점수는 "+st1.mathsc+"\n");
		System.out.print(st1.getMathsc());
		st2.setEnglishsc(88);
		st3.setKoreansc(99);
		st3.setEnglishsc(88);
		st3.setMathsc(77);
		
		st1.print();
		st2.print();
		st3.print();
	}

}
