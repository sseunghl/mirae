package mirae2.com;

import java.util.Scanner;

public class Student91 {
	Scanner input;
	String temp="";
	String name;
	int user=0;
	int kor,eng,mat,sum,avg;
	int num;
	Student91(){}
	Student91(int num,String name,int kor,int eng,int mat){this.num=num;this.name=name;this.kor=kor;this.eng=eng;this.mat=mat;sumCalc();avgCalc();}
	
//------입력 함수
	public int getUser() {
		input = new Scanner(System.in);
		temp = input.nextLine();
//------종료 조건
		if(temp==null || temp.equals("9")) {
			return 9;
		}		
		user = Integer.parseInt(temp);
		user = user%6;
		return user;
	}
//------출력 함수
	public void print() {
		System.out.printf("이름 : %s/ 국어 점수 :  %3d점/ 영어 점수 : %3d점/ 수학 점수 : %3d점/ 총점 : %3d점/ 평균 : %3d\n",name,kor,eng,mat,sum,avg);
	}

//------수정 함수
	public void update(String name,int kor,int eng, int mat) {
		this.name=name;this.kor=kor;this.eng=eng;this.mat=mat;sumCalc();avgCalc();
	}
//------합계 계산 함수
	public void sumCalc(){
		sum=kor+eng+mat;
	}
//------평균 계산 함수
	public void avgCalc() {
		avg=sum/3;
	}
//------각각의 과목의 점수 가져오고 출력하는 함수
	//국어
	public void setKorean(int korean) {	
		if(kor>100) kor=100;
		this.kor=korean;
		sumCalc();avgCalc();}  
	public int getKorean() {return kor;} 					
	//영어
	public void setEnglish(int english) {
		if(eng>100) eng=100;
		this.eng=english;
		sumCalc();avgCalc();}  
	public int getEnglish() {return eng;} 					
	//수학
	public void setMath(int math) {	
		if(mat>100) mat=100;
		this.mat=math;
		sumCalc();avgCalc();}  
	public int getMath() {return mat;}
//------이름 가져오는 함수	
	public String getName() {return name;}
//------평균 가져오는 함수	
	public int getAvg() {return avg;}
}
