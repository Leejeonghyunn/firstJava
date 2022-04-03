package me.jeonghyun.javaPractice;

public class Practice620 {
	public static int max(int[] arr) {
		if(arr==null || arr.length==0)  //유효성 체
			return -999999;
		int max = arr[0];     //배열의 첫번째 값으로 최대값을 초기화 한다.
		for (int i = 1; i<arr.length;i++) {    //최대값 max를 배열 첫번째 값으로 초기화 했으므로 첫번째 값은 비교할 필요가 없다.
			if(arr[i]>max)                     //그래서 arr[i]부터 비교. 비교해서 그 값이 max보다 크면 그값을 변수 max에 저장한다.
				max=arr[i];
		}
		return max; //배열의 요소중 가장 큰 값 반
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {3,2,8,9,6};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " +max(data));
		System.out.println("최대값 : " +max(null));
		System.out.println("최대값 : " +max(new int[] {}));  //크기가 0인 배
	}

}
