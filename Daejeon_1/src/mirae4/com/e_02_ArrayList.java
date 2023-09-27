package mirae4.com;
import java.util.ArrayList;
public class e_02_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		//int, primitive type은 사용안함
		// 사이즈를 자동으로 조절
		// 배열처럼 랜덤으로 위치 데이터를 접근할 수 있음
		// ArrayList vs Vector(벡터는 동기화가 가능: 동시에 접근하는 경우에 안전)
		//multi thread: 동시에 실행되는 process 단위
		//속도가 빠른 cpu time을 나누어서 실행
		
		//배열처럼 행동하는 리스트로 구성된 배열
		ArrayList<Integer> arr1= new ArrayList<Integer>(n);
		ArrayList<Integer> arr2= new ArrayList<Integer>();//사이즈를 줘도 되고 안줘도 됨
			System.out.println("Array 1:"+arr1);
			System.out.println("Array 2:"+arr2);
		for(int i=1;i<=n;i++) {
			arr1.add(i);//데이터가 차면 자동으로 공간을 늘려서 확보
			arr2.add(i);
		}
		System.out.println("Array 1:"+arr1);
		System.out.println("Array 2:"+arr2);
	}

}
