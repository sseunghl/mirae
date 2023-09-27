package mirae4.com;

import java.util.ArrayList;
import java.util.ListIterator;

//Student 21
//int rollno,String name,int age
//ArrayList 3인분을 입력하고, 출력해 보시오
//출력 방식은 4가지(for,for:iterater,foreach문)
class Student21{
	public int rollno;
	public String name;
	public int age;
	public Student21() {};
	public Student21(int rollno,String name, int age) {
		super();
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {//toString 없으면 주소값이 뜬다->문자열 출력관련 
		return "번호: "+rollno+"이름: "+name+"나이: "+age;
	}
}
public class e_04_Student_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student21 stu1=new Student21(1,"이승희",27);
		Student21 stu2=new Student21(2,"윤지민",23);
		Student21 stu3=new Student21(3,"홍성윤",25);
		
		ArrayList<Student21> students= new ArrayList<Student21>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		System.out.println("Array 출력방법 for문 1\n");
		
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i));
		}
		System.out.println(students);//toString 있어서 됨
		System.out.println("Array 출력방법 확장 for문2\n");// 한개의 객체 사이즈 재는 법
		for(Student21 stu:students) {
			System.out.println(stu);
		}
		System.out.println("Array 출력방법 iterator3\n");
			ListIterator<Student21> listIterator=students.listIterator();
			while(listIterator.hasNext()) {
				System.out.println(listIterator.next());
				Student21 st=(Student21)listIterator.next();
				System.out.println(st.rollno+" "+st.name+" "+st.age);
			}
		System.out.println("Array 출력방법 foreach4\n");
		students.forEach(a1->{System.out.println(a1.rollno+" "+a1.name+" "+a1.age);});
	}

}
