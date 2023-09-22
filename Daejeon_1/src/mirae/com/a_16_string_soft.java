package mirae.com;

public class a_16_string_soft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str11="Hello";
		String str21="Hello";
		String str31="World";
		System.out.println("str1.compareTo(str2)?"
				+str11.compareTo(str21));//0 compareTo는 비교
		System.out.println("str1.compareTo(str3)?"
				+ str11.compareTo(str31));//뒤에것이 크면 -가 나옴
		System.out.println("str1.compareTo(str1)?"
				+ str31.compareTo(str11));
		
		//정렬하기
String[] strarray= {"대한","민국","만세","한국","대전"};
		
		for(int i=0;i<strarray.length;i++) {
			boolean changed = false;
			for(int j=0;j<strarray.length-i-1;j++) {//-1은 마지막 칸 앞까지 계산하라는 소리,-i는 마지막 칸엔 이미 정렬된 값이 들어가기 때문
				
				/*
				 * System.out.println(""+strarray[i].compareTo(strarray[j])); int
				 * a=Integer.parseInt(strarray[i]); int b=Integer.parseInt(strarray[0]); if(b>a)
				 * { String temp= strarray[j]; strarray[j]=strarray[j+1]; strarray[j+1]=temp; }
				 */
				
				if(strarray[j].compareTo(strarray[j+1])>0) {//>는 오름차순 <는 내림차순
					String temp=strarray[j];
					strarray[j]=strarray[j+1];
					strarray[j+1]=temp;
					changed=true;
				}
			}
			if(!changed) break;
		}
		for(int i=0;i<strarray.length;i++) {
			System.out.print(strarray[i]+" ");
		}
		System.out.println("\n");
	}

}
