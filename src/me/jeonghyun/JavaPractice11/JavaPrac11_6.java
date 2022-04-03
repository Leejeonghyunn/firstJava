package me.jeonghyun.JavaPractice11;

import java.util.Arrays;

public class JavaPrac11_6 {

	public static void main(String[] args) {
		int[]    arr  = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13} , {21,22,23}};
		
		System.out.println(" arr ="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D)); //deepToString :다차원배열 
		
		int [] arr2 = Arrays.copyOf(arr, arr.length);
		int [] arr3 = Arrays.copyOf(arr, 3);
		int [] arr4 = Arrays.copyOf(arr, 7);
		int [] arr5 = Arrays.copyOfRange(arr, 2, 4); //(from=<x<to)
		int [] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2="+ Arrays.toString(arr2));
		System.out.println("arr3="+ Arrays.toString(arr3));
		System.out.println("arr4="+ Arrays.toString(arr4));
		System.out.println("arr5="+ Arrays.toString(arr5));
		System.out.println("arr6="+ Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7,9);
		System.out.println("arr7="+ Arrays.toString(arr7));
		
		Arrays.setAll(arr7,  i -> (int)(Math.random()*6)+1);
		System.out.println("arr7="+ Arrays.toString(arr7));
		
		for(int i : arr7) {                    //for(int x=0; x<arr.length; x++)
			char[] graph = new char[i];        // int i= arr7[x]; 
			Arrays.fill(graph, '*');           // 배열의 요소를 순서대로 꺼내서 i에 집어넣는다.
			System.out.println(new String(graph)+i); //새로운 char[]을 만들고 숫자만큼 *를 채운다.
			                                         //그리고 new String생성자를 통해 문자열로 바꾼다.
		} 
        String[][] str2D  = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
        
        System.out.println("Arrays.deepEquals(str2D,str2D2) = "+Arrays.deepEquals(str2D,str2D2));
		
        char[] chArr = { 'A' , 'D' , 'C' , 'B' , 'E' };
        
        System.out.println("chArr=" + Arrays.toString(chArr));
        System.out.println("index of B ="+Arrays.binarySearch(chArr,'B')); //정렬하지않아서 잘못된 결과가 나온다.
        System.out.println(" = After sorting =");
        Arrays.sort(chArr);         //배열을 정렬  
        System.out.println("chArr="+Arrays.toString(chArr));
        System.out.println("index of B=" + Arrays.binarySearch(chArr, 'B')); //배열에서 지정된 값이 저장된위치(index)를 찾아서 반환한다.
		
		

	}

}
