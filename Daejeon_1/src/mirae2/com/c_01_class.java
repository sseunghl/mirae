package mirae2.com;
//자바 규칙: 하나의 파일에 하나의 클래스만 존재해야
// 클래스 이름하고 파일 이름이 동일해야
// 아래 person클래스는 이 파일 안에서만 사용가능{학습용으로 이렇게 한번 실습해보겠다}
//자바 디폴트는 private
/*class Person{
	//멤버 변수, 멤버 함수, 생성자(초기화용)
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
	}//메모리가 사용되지 않고 이렇게 쓸 것이다 선언하는 것 꼴을 만들어놓는 것을 클래스 템플레이트
}
//클래스는 사용자 정의 데이터 타입
//함수는 한번만 정의되고 데이터는 인스턴스 할때마다 공간을 확보하게 됨
*/public class c_01_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pe1=new Person("대한이",21);//데이터 타입 person을 pe1으로 만들고 대한이와 21로 초기화해라
		Person pe2=new Person("민국이",19);
		Person pe3=new Person("만세",18);
		
		pe1.print();
		pe2.print();
		pe3.print();
		
		
		Person [] pe_dim=new Person[4];//주소가 4개 입력될 공간이 확보= 주소공간 4개를 확보
		pe_dim[0]=new Person("대한이",10);//실제 데이터를 가진 공간 
		pe_dim[1]=new Person("민국이",11);
		pe_dim[2]=new Person("대한",12);
		pe_dim[3]=new Person("김종호",40);
		for(Person pe:pe_dim) {
			pe.print();
		}
		
		String st_arr[]= {"대한이","민국이","만세"};
		int age_arr[]= {10,11,12};
		
		Person [] pe_arr= new Person[st_arr.length];
		for(int i=0; i<st_arr.length;i++) {
			pe_arr[i]= new Person(st_arr[i],age_arr[i]);
		}
		for(Person pe:pe_arr) {
			pe.print();
		}
	}

}
