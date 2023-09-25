package mirae2.com;

public class c_04_Cartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car [] cars=new Car[3];
		cars[0]=new Car("소나타");//Scanner로 입력받기,데이터는 3인분까지만//Student90클래스명
		cars[1]=new Car("아반테");
		cars[2]=new Car("아우디");
		
		for(int i=0;i<cars.length;i++) {
			cars[i].drive();
		}
		//CRUD:입력, 출력, 수정,삭제
		//메뉴화 하기
		//메뉴 1번 입력
		//메뉴 2 출력
		//메뉴 3 수정
		//9번 종료-> 주말
		
		//팀: 가위바위보게임 {객체}:com(랜덤),player(입력),judge(판단)
		//judge가 게임승패결정
	}

}
