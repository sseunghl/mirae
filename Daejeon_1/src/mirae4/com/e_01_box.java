package mirae4.com;
class Box<T>{//Generic class
	//데이터 타입이 입력되는 자리에 대표 타입으로 대치
	//T자리만 데이터타입(ex-String)등으로 설정\
	//
	private T t; 
	public void add(T t) {
		this.t=t;
	}
	public T get (){
		return t;
	}
}
public class e_01_box {
//Generic function(template-C++)
	//(),{},[],<데이터타입>
	public static <E> void printArray(E[] InputArray) {//E데이터 타입
		for(E element:InputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] IntArray= {1,2,3,4,5};
		Double[] doubleArray= {1.1,2.2,3.3,4.4};
		Character[] charArray= {'H','E','L','L','O'};
		printArray(IntArray);//Integer->컴파일 타임에 결정
		printArray(doubleArray);//double
		printArray(charArray);//String
		
		//구체적인 데이터타입을 지향:기본형, 참조형 //클래스는 참조형데이터
		//compile time에 T를 지정된 데이터 타입으로 변환 사용
		Box<Integer> IntegerBox= new Box<Integer>();//클래스 인스턴스
		Box<String>  StringBox= new Box<String>();
		IntegerBox.add(Integer.valueOf(10));
		StringBox.add(new String("안녕 일반화 프로그램"));
		System.out.printf("정수형:%d\n\n",IntegerBox.get());
		System.out.printf("문자형: %s\n", StringBox.get());
	}
	
	

}
