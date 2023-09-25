package mirae2.com;

import java.util.Scanner;

public class Student90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Student91 std= new Student91();
		Student91[]per = new Student91[3];
		
		while(true) {
			System.out.println("입력[1], 출력[2], 전체 수정[3] 부분 수정[4] 석차 확인[5] 중 선택 | 종료[9]");
			int sel=std.getUser();
//종료(9)을 눌렀을 시	
			if(sel == 9) {
				System.out.println("종료되었습니다."); 	break;
			}
			
//입력(1)을 눌렀을 시
			else if(sel==1) {
				System.out.println("입력 메뉴가 선택되었습니다...");
				for(int i=0;i<per.length;i++) {
					String name=input.nextLine();
					int kor=Integer.parseInt(input.nextLine());
					int eng=Integer.parseInt(input.nextLine());
					int mat=Integer.parseInt(input.nextLine());
					per[i]=new Student91((i+1),name,kor,eng,mat);
				}							
			}
//출력(2)을 눌렀을 시
			else if(sel==2) {
				System.out.println("출력 메뉴가 선택되었습니다...");
				for(int i=0;i<per.length;i++)
					per[i].print();
			}			
//전체 수정(3)을 눌렀을 시			
			else if(sel==3) {
				System.out.println("수정 메뉴가 선택되었습니다...");
				for(int i=0;i<per.length;i++) {
					per[i].print();
				}
				System.out.print("수정 원하시는 이름을 입력하시오 : ");
				String user=input.nextLine();
//수정할 이름 비교
				for(int i=0;i<per.length;i++) {
					if(per[i].getName().equals(user)) {
						System.out.println(per[i].getName()+"의 전체 과목 수정 시작");
						String name=input.nextLine();
						int kor=Integer.parseInt(input.nextLine());
						int eng=Integer.parseInt(input.nextLine());
						int mat=Integer.parseInt(input.nextLine());		
						per[i].update(name, kor, eng, mat);
					}
				}
			}
//부분 수정(4)을 눌렀을 시
			else if(sel==4) {
				System.out.println("부분 수정 메뉴가 선택되었습니다...");
				System.out.print("수정하고 싶은 사람의 이름과 과목을 입력하시오 : ");
				String user=input.nextLine();
				String subject=input.nextLine();
				for(int i=0;i<per.length;i++) {
					if(per[i].getName().equals(user)) {
						System.out.print(per[i].getName()+"의 "+subject+" 과목 수정 시작\n점수를 입력하시오 : ");
						int k=Integer.parseInt(input.nextLine());
//국어 수정
						if(subject.equals("국어")) {
							per[i].setKorean(k);
							System.out.println("국어 : "+per[i].getKorean()+"점");
						}
//영어 수정
						else if(subject.equals("영어")) {
							per[i].setEnglish(k);
							System.out.println("영어 : "+per[i].getEnglish()+"점");
						}
//수학 수정
						else if(subject.equals("수학")) {
							per[i].setMath(k);
							System.out.println("수학 : "+per[i].getMath()+"점");
						}
					}
				}
			}
//석차 확인(5)을 눌렀을 시
			else if(sel==5) {
				System.out.println("석차확인 메뉴가 선택되었습니다...");
				int mm[]=new int [3];
				String rank1="";
				String rank2="";
				String rank3="";
//배열에 평균 저장
				for(int i=0;i<per.length;i++) {
					mm[i]=per[i].getAvg();
				}
//오름차순 정렬
				for(int i=0; i<per.length;i++) {
					boolean changed=false;
					for(int j=0;j<per.length-i-1;j++) {
						if(mm[j]>mm[j+1]) {
							int temp=mm[j];
							mm[j]=mm[j+1];
							mm[j+1]=temp;
							changed=true;
						}			
					}
					if(!changed) break;
				}
//문자열에 등수와 이름 저장
				for(int i=0; i<per.length;i++) {
					if(mm[2]==per[i].getAvg()) {
						rank1="1등 : "+per[i].getName();
					}
					else if(mm[1]==per[i].getAvg()) {
						rank2="2등 : "+per[i].getName();
					}
					else {
						rank3="3등 : "+per[i].getName();
					}
				}
				System.out.println(rank1+"/"+rank2+"/"+rank3);
			}
		}
	}

}
