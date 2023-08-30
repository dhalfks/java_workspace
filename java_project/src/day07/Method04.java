package day07;

public class Method04 {

	public static void main(String[] args) {
		/* 메서드 : 기능을 하기위한 코드 조각
		 * 
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 코드;
		 * return;
		 * .... (실행X)
		 * }
		 * 
		 * return : 메서드에서 전달해야하는 값을 전달하는 역할
		 * 메서드에서 return을 만나면 리턴 타입의 값을 전달하고, 메서드를 종료
		 * */
		
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
		 * 3. 배열의 정수 5개와 평균을 출력하는 메서드 (출력)
		 * 
		 * 메인에서는 연산식이 있으면 안됨.
		 * 메서드간의 데이터 전달 및 호출만 있어야 함.
		 * 
		 * 카페에 제출
		 * */
		
		//랜덤 생성 메서드 호출
//		int arr[] = random();
//		double avg = average(arr);
//		print(arr, avg);
		
		//메서드들 간의 호출
		average();
		
	}
	
	/* 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
	 * 리턴타입 : 정수 배열 => int[]
	 * 매개변수 : X 
	 * 메서드명 : random
	 * */
	public static int[] random() {
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	/* 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
	 * 리턴타입 : 평균을 리턴 => double
	 * 매개변수 : 배열 => int arr[] 
	 * 메서드명 : average
	 * */
	public static double average(int arr[]) { //랜덤수를 생성한 배열이 이미 있다.
		//계산만..
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return (double)sum / arr.length;
	}
	
	/* 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
	 * 매개변수 : x
	 * 리턴타입 : x
	 * 메서드명 : average
	 * */
	//메서드 오버로딩 : 같은 메서드명을 쓰더라도, 매개변수의 종류나, 개수가 다르면 사용가능함.
	public static void average() {
		//랜덤을 호출해와라
		int arr[] = random();  //랜덤 배열 생성
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;
		
		//print 호출하여 출력
		print(arr, avg);
		
	}
	
	
	
	/* 배열의 정수 5개와 평균을 출력하는 메서드 (출력)
	 * 리턴타입 : void 없음
	 * 매개변수 : 정수배열, 평균 => int arr[], double avg
	 * 메서드명 : print
	 * */
	public static void print(int arr[], double avg) {
		System.out.println("5개의 랜덤 정수 값 > ");
		//System.out.println(arr); //주소만 출력
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();//줄바꿈
		System.out.println("평균 : "+avg);
	}

}
