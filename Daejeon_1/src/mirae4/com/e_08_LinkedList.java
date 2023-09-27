package mirae4.com;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Dept2{
	int deptno;//기준을 정해줘야
	String dname;
	String loc;
	
	Dept2(int deptno, String dname, String loc){
		this.deptno=deptno;
		this.dname=dname;
		this.loc=loc;
	}
	
	public Integer getDeptno() {
		return Integer.valueOf(deptno);
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String toString() {
		return "부서번호:"+deptno+"부서이름:"+dname+"위치:"+loc;
	}
}
public class e_08_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept2 s1=new Dept2(10,"회계사","서울");
		Dept2 s2=new Dept2(20,"연구원","대전");
		Dept2 s3=new Dept2(30,"판매원","충주");
		Dept2 s4=new Dept2(40,"운영부","부산");
		Dept2 s5=new Dept2(50,"개발부","수원");
		LinkedList<Dept2> a1=new LinkedList<Dept2>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		Iterator<Dept2> itr=a1.iterator();
		while(itr.hasNext()) {
			Dept2 dept2=(Dept2)itr.next();
			System.out.println(dept2);
		}
		LinkedList<Dept2> a12=new LinkedList<Dept2>();
		a12.add(s1);
		a12.add(s2);
		a1.addAll(a12);//리스트를 다른 리스트에 추가
		System.out.println(a12);
		System.out.println(a1);
		a1.remove(0);//10
		a1.removeAll(a12);//있는 것을 다 지움
		System.out.println(a1);
		a1.addFirst(s1);
		a1.addLast(s2);
		System.out.println(a1);
		a1.removeFirst();
		a1.removeLast();
		System.out.println(a1);
		a1.removeFirstOccurrence(s1);//처음 발견되는 데이터
		a1.removeLastOccurrence(s2);// 마지막에 발견있는 데이터
		System.out.println(a1);
		//a1.clear();
		System.out.println("역순으로 출력하기");
		//ascending 오름차순
		//descending 내림차순
		Iterator reverse_iter=a12.descendingIterator();
		while(reverse_iter.hasNext()) {
			Dept2 dept2=(Dept2)reverse_iter.next();
			System.out.println(dept2.deptno+" "+dept2.dname+" "+dept2.loc);
		}
		//generic 자료구조에서는 기본 데이터 타입을 사용할 수 없음
		//사용자가 만든 클래스의 경우  정렬할 때는 기준이 필요 : 클래스에서는 비교를 할 수 있도록 Comparaator를 제공해야 함
		//String,Integer는 이미 존재
		Comparator <Dept2> comp = new Comparator<Dept2>() {
			public int compare(Dept2 u1,Dept2 u2)
			{
				return u1.getDeptno().compareTo(u2.getDeptno());//u1의 depno를 u2의 depno랑 비교하라
			}
		};
		//정렬은 두개의 데이터를 비교
		//클래스 비교 방법을 알려줘야
		Collections.sort(a1,comp);
		int index=Collections.binarySearch(a1, new Dept2(30,null,null),comp);//형식은 class여야 comp비교 함수
			System.out.println("이진검색으로 찾은 인덱스"+index);
			if(index !=-1)
				System.out.println("이진검색으로 찾은 데이터"+a1.get(index));
			else 
				System.out.println("검색한 데이터가 없습니다.");
			a1.get(index).setLoc("대전");
			//50번 데이터를 찾아서 삭제하시오.
		index=Collections.binarySearch(a1, new Dept2(30,null,null),comp);
		if(index !=-1)a1.remove(index);
		else System.out.println("삭제할 데이터가 없습니다.");
		
		
			
	}
	

}
