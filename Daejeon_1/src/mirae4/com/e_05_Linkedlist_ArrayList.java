package mirae4.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//LinkedList 삽입삭제가 빈번한 경우
public class e_05_Linkedlist_ArrayList {
	public static long add1(List list) {//메소드 파악하려면 파라미터 먼저보기
		//1970년도 1월 1일부터 밀리세컨드로 표현된 수치를 리턴
		long start = System.currentTimeMillis();//milisecond 1/1000초
		for(int i=0;i<100000;i++) {
			list.add(i+"");
		}
		long end =System.currentTimeMillis();
		return end-start;// 경과시간
	}
	public static long add2(List list) {//메소드 파악하려면 파라미터 먼저보기
		//1970년도 1월 1일부터 밀리세컨드로 표현된 수치를 리턴
		long start = System.currentTimeMillis();//milisecond 1/1000초
		for(int i=0;i<1000;i++) {
			list.add(500,"X");
		}
		long end =System.currentTimeMillis();
		return end-start;// 경과시간
	}
	public static long remove1(List list) {// 전체삭제
		long start=System.currentTimeMillis();
		for(int i=list.size()-1;i>0;i--) {
			list.remove(i);
		}
		long end =System.currentTimeMillis();
		return end-start;
	}
	public static long remove2(List list) {// 중간삭제
		long start=System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			list.remove(i);
		}
		long end =System.currentTimeMillis();
		return end-start;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList a1 = new ArrayList();
		 LinkedList l1=new LinkedList(); //변수명: 엘원
		 
		 System.out.println("=순차적으로 추가하기=");
		 System.out.println("Array List :"+add1(a1));//순차적으로 처리시 배열이 더 빠름
		 System.out.println("LinkedList: "+add1(l1));
		 System.out.println();
		 System.out.println("= 중간에 추가하기=");
		 System.out.println("Array List:"+add2(a1));// 삽입삭제는 링크드 리스트가 빠름
		 System.out.println("LinkedList:"+add2(l1));
		 System.out.println();
		 System.out.println("= 중간에서 삭제하기 =");
		 System.out.println("Array List: "+remove2(a1));
		 System.out.println("Linked List:"+remove2(l1));
		 System.out.println("=순차적으로 삭제하기 =");
		 System.out.println("Array List:"+remove1(a1));
		 System.out.println("Linked List"+remove1(l1));

	}

}
