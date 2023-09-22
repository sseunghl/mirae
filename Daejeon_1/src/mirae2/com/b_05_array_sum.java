package mirae2.com;

public class b_05_array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[]= {10,20,30,40};
		int temp2[]= {100,200,300,400,500};
		//문제 배열 데이터를 받아서 합계를 낸 다음 리턴하는 함수를 작성하시오.
		
		
		
		System.out.print("배열의 합계"+tot(temp));
		System.out.println("\n");
		System.out.print("배열의 합계"+tot(temp2));
	}
	public static int tot(int arr []) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			
			res+=arr[i];
		}
		return res;//return 까먹지 않기
	}

}
