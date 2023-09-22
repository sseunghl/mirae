package mirae.com;

public class a_09_enum {
	//일주일은 7일 : 경우의 수 = 범주라고도 할 수 있음
	//enum 범주를 선언하는 것
	public enum Day{
		Sun,Mon,Tue,Wed,Thu,Fri,Sat// 0,1,2,3,4,5,6이 자동으로 맵핑
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enum 타입
		// enum은 new를 사용하지 않음
		Day day = Day.Mon;
		System.out.println("enum변수에 있는 값은"+day);
		Day[] DayNow = Day.values();//enum의 전체값을 배열로 갖고 와 출력
		System.out.println(DayNow);//배열이기 때문에 주소값이 출력
		String stt="";
		//for(int i=0;i<10;i++) index에러가 많이 남, 배열의 인덱스용으로
		for(Day Now : DayNow) //extended for문 확장된 for문 index에러 방지용 확장 for문은 순차적으로 객체를 리턴한다. collection
		{
			switch (Now) {
			case Sun: stt="Sunday"; break;
			case Mon: stt="Monday"; break;
			case Tue: stt="Tueday"; break;
			case Wed: stt="Wedday"; break;
			case Thu: stt="Thursday"; break;
			case Fri: stt="Friday"; break;
			case Sat: stt="Saturday"; break;
			
			}
			System.out.println(stt);
		}

	}

}
