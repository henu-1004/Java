package step01;

import java.util.Scanner;

/*
 * 날짜 : 2025.07.10
 * 이름 : 서현우
 (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.



(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */
public class Main10 {

	public static void main(String[] args) {
		int a, b,c ,d,e,f;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		c = a*(b%100%10);
		d = a*(b%100/10);
		e = a*(b/100);
		f = c+d*10+e*100;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		sc.close();
		
	}

}
