package mirae2.com;

import java.util.Scanner;

public class team_Student {
	
	Scanner input;

	String temp="";

	String name;

	int user=0;

	int kor,eng,mat,sum,avg;

	public team_Student(){}

	team_Student(int kor,int eng,int mat,int sum,int avg){this.kor=kor;this.eng=eng;this.mat=mat;this.sum=sum;this.avg=avg;}

	

	public int getUser() {

		System.out.println("---------메뉴------------");
		System.out.println("1번: 입력 2번: 출력 3번: 수정 9번: 종료\n");
//------메뉴판 출력	

		input = new Scanner(System.in);

		temp = input.nextLine();

		if(temp==null || temp.equals("9")) {

			return 9;

		}		

		user = Integer.parseInt(temp);

		user = user%4;

		return user;

	}



	public void setName(String name) {	

		this.name=name;

		sumCalc();avrCalc();}  

	public String getName() {return name;}

	

	public void setKorean(int korean) {						

		this.kor=korean;

		sumCalc();avrCalc();}  

	public int getKorean() {return kor;} 					

	

	public void setEnglish(int english) {						

		this.eng=english;

		sumCalc();avrCalc();}  

	public int getEnglish() {return eng;} 					

	

	public void setMath(int math) {						

		this.mat=math;

		sumCalc();avrCalc();}  

	public int getMath() {return mat;}	

	

	public void sumCalc(){

		sum=kor+eng+mat;

	}

	public void avrCalc() {

		avg=sum/3;

	}

	public void print() {

		System.out.println("이름 : "+this.name+" 국어 점수 : "+this.kor+" 점/ 영어 점수 : "+this.eng+"점/ 수학 점수 : "+this.mat+" 점/ 총점 : "+sum+"/ 평균 : "+avg);

	}


	
	
}
