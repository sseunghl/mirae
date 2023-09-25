package mirae2.com;

//문제: 이름, 국어, 영어, 수학 점수를 저장하는 클래스를 작성해주세요
//생성자 구현
//get,set함수 구현
//이름, 국어, 영어, 수학 점수를 출력하는 함수를 만들어주세요
//클래스는 대문자로 시작, 두단어 합칠때 앞에는 대문자, 뒤에는 소문자, 함수는 소문자
// 문제: 총점-total, 평균-average 멤버점수를 추가하시고, 데이터가 세팅될때 자동으로 총점과 평균을 계산하도록 수정해보기
public class Student {
	public String name;
	int koreansc;
	int englishsc;
	int mathsc;
	int total;
	int average;
	public Student(String name, int koreansc, int englishsc,int mathsc){
		this.name=name;
		this.koreansc=koreansc;
		this.englishsc=englishsc;
		this.mathsc=mathsc;
		totCalc();
		avrCalc();
	}
	public Student(String name) {
		this.name=name;
	}
	public Student(String name, int koreansc,int mathsc) {//자동으로 0으로 초기화
		this.name=name;
		this.koreansc=koreansc;
		this.mathsc=mathsc;
	}
	public void setName(String name) {
		this.name=name;
	
	}
	public String getName() {
		return name;
	}
	public void setKoreansc(int koreansc) {
		this.koreansc=koreansc;
		totCalc();
		avrCalc();
	}
	public int getKoreansc() {
		return koreansc;
	}
	public void setEnglishsc(int englishsc) {
		this.englishsc=englishsc;
		totCalc();
		avrCalc();
	}
	public int getEnglishsc() {
		return englishsc;
	}
	public void setMathsc(int mathsc) {
		this.mathsc=mathsc;
		totCalc();
		avrCalc();
	}
	public int getMathsc() {
		return mathsc;
	}
	public void totCalc() {
		total= koreansc+englishsc+mathsc;
	}
	
	public void avrCalc() {	
		average=total/3;
	}
	public void print() {
		System.out.println("이름은  "+this.name+"  국어점수  "+this.koreansc+"  영어점수  "+this.englishsc+" 수학점수"+this.mathsc+" "+total+" "+average);
	}
}
