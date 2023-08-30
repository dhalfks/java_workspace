package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/* 5자리의 숫자를 입력 받아서 입력받은 숫자를 거꾸로 출력
		 * 각 자리의 합계 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1
		 * ex) 19547 => 74591 => 7+4+5+9+1
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("5자리 숫자를 입력해주세요.");
		int num = scan.nextInt();  //11456
		int arr[] = new int[5];
		
		// 나누기(/), 나머지(%)
		//12345 => % 10 => 5 => 배열에 저장
		//값을 나눈 몫만 다시 나눌값으로 지정
		// 12345 / 10 => 정수만 저장
		//1234 => % 10 => 4 => 배열에 저장
		//123 => % 10 => 3 => 배열에 저장...
		int sum=0;
		int i=0;
		
		while(num > 0) { //입력받은 num가 0보다 작아지면 false
			int b = num % 10; //마지막 자리를 나머지로 받기
			arr[i] = b;
			sum += b;
			num = num / 10;  //몫 저장 => 정수 / 정수 = 정수
			System.out.println(arr[i]);
			i++;
		}
		System.out.println("sum:"+sum);
		
//		String s = "12345";
//		String s1[] = new String[5];
//		
//		s1 = s.split(""); //특정 문자를 기준으로 나누기
//		int sum = 0;
//		for(int i=0; i<s1.length; i++) {
//			System.out.println(s1[4-i]);
//			sum += Integer.parseInt(s1[i]); //문자를 숫자로 바꾸기
//		}
//		System.out.println(sum);
		
		
		scan.close();

	}

}
