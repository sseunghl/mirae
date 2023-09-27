package mirae4.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

//[5][5]행렬 만들고 순서대로 행 우선으로 숫자를 입력하시오.

/*class bingo{
	int [][] arr=new int[5][5];
	int num=0;
	public bingo() {};
	public bingo(int num,int arr[][]) {
		this.num=num;
		this.arr=arr;
	};
	public int[][] getArr() {
		return arr;
	}
	public void setArr(int[][] arr) {
		this.arr = arr;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int bingoMake() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=i*5+j;
			}
		}
		return arr[5][5];
	}
}*/
public class e_07_bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();//키로 구성된 자료구조(중복을 불허)!!!!!!!!!!
		// 어떤 데이터가 입력될까
		int [][] board=new int[5][5];
		Random generator= new Random(System.currentTimeMillis());
		for(int i=0;set.size()<25;i++) {//25개의 경우의 수 사이즈를 제한하고 있다 i는 횟수를 제한하고 set.size는 set이 중복이 안되기 때문에 25칸이 다 채워질때까지 반복하는 코드 
			//0~24에 1을 더해 1~25
			set.add(Math.abs(generator.nextInt()%25)+1+"");//""때문에 문자로 데이터가 들어가있음.
		}//0~24
		
		//이 데이터를 board에 채워 보시오
		Iterator it=set.iterator();
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=Integer.parseInt((String)it.next());
				System.out.println((board[i][j]<10?" ":" ")+board[i][j]);
			}
			System.out.println();
		}
		ArrayList<Integer> list= new ArrayList<Integer>(25);//
		for(int i=0;i<25;i++) {
			list.add(i);
		}
		Collections.shuffle(list);//뒤섞다
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		itr=list.iterator();//이터레이터 초기화, 끝까지 커서가 가있는 걸 다시 맨 앞으로 돌리는 작업
		for(int i=0; i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=(int)itr.next();
				System.out.print((board[i][j]<10?"  ":" ")+board[i][j]);
			}
			System.out.println();
		}
	}
	
}
