package mirae4.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class e_06_sort_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist=new ArrayList<String>();
		System.out.println("데이터 한개를 입력하시오");
		Scanner scan=new Scanner(System.in);
		arraylist.add(scan.nextLine());
		arraylist.add("천안");
		arraylist.add("천안");
		arraylist.add("대전");
		//삽입: 인덱스 위치에 입력
		arraylist.add(2,"오리");
		arraylist.add("서울");
		//정렬
		//lterator->Collections->List->ArrayList
		//인터페이스 Iterator에서 List까지는 인터페이스
		//인터페이스 : 약속->sort 함수를 반드시 구현해야 하기 때문에
		System.out.println(arraylist.get(1));
		Collections.sort(arraylist);//함수가 원본 데이터에 직접 작업
		//도수:몇개 있냐
		System.out.println(arraylist.get(1));
		//검색(바이너리 검색을 통해: 전체 조검- 정렬)
		System.out.println(Collections.frequency(arraylist,"천안"));
		System.out.println("검색"+Collections.binarySearch(arraylist, "오리"));
		System.out.println(arraylist);//정렬이 되어 있음
		//삭제
		arraylist.remove("천안");
		System.out.println(arraylist);//처음 만나 천안 한개만 삭제
		// 수정
		arraylist.set(1, "대전");//인덱스 첫번째 것을 대전으로 바꿔라
		System.out.println(arraylist);
	}

}
