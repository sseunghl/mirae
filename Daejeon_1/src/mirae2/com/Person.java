package mirae2.com;
//기능을 검색해서 찾아쓰기
public class Person {
	public String name;
	public int age;
	public Person (String name, int age) {
		this.name=name;//this를 붙여서 위에 name과 구별 thisname은 위에 name = 옆에 있는 name은 person함수 name
		this.age=age;//this는 인스턴스(instance)하고 나서의 자기 자신이다.
	}
	
	public void setName(String name) {//void는 리턴을 하지 않는 경우,
		this.name=name;
	}
	public String getName() {//이름을 가져가는 함수
		return name;
	}
	public void setAge(int age) {//나이를 바꾸는 함수
		if(age>200) {//데이터 보호를 위해 함수로 제한
			age=200;
		}
		this.age=age;
	}
	public int getAge() {//나이를 가져가는 함수
		return age;
	}
	public void print() {
		System.out.println("이름은  "+this.name+"  나이는  "+this.age);
	}
}
