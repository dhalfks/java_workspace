package day06;

import java.util.Scanner;

public class 주사위게임 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6까지 랜덤수
		 * ex)
		 * 주사위 : 3
		 * 3칸 이동 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 이동 => ??칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동 횟수 : 8번 완주
		 * */
		//랜덤값 (주사위 값 1~6까지 생성)
		//목표값=30, sum=합산거리, count=이동횟수
		Scanner scan = new Scanner(System.in);
		int random=0;
		int sum=0;
		int count=0;
		int last = 30;
		
		while(sum < last) { //true 값이 되어야 반복
			//random 수 생성
			System.out.println("주사위를 던지려면 Enter를 누르세요.");
			scan.nextLine();
			random = (int)(Math.random()*6)+1;
			sum+= random; //거리합산
			count++;
			System.out.println("주사위:"+random+"칸 이동 => "+(last-sum)+"칸 남았습니다.");
		}
		System.out.println("완주~!!, 총이동횟수: "+count);
		scan.close();

	}

}
