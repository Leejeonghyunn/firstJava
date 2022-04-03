package me.jeonghyun.firstJava;
import java.util.Scanner;
//자바 배열 연습문제 5-6
public class JavaArray56 {

	public static void main(String[] args) {
		
		String[] words= {"television", "computer","mouse","phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i<words.length; i++) {
			//String을 char[]로 변환
			char[] question = words[i].toCharArray();
			
			//char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
			for(int j = 0; j<question.length; j++) {
				int n = (int)(Math.random()*question.length);
				
				char tmp = question[i];
				question[i]= question[n];
				question[n]= tmp;
			}
			System.out.printf("Q%d. %s의 정답을 입력하세요.>" ,i+1 , 
					new String(question));
			String answer = scanner.nextLine();
			
			//trim()으로 answer의 좌우 공백을 제거한후, equals로 word[i]와 비교
		    if(words[i].equals(answer.trim()))
		    	System.out.printf("맞았습니다.%n%n", args);
		    else
		    	System.out.printf("틀렸습니다.%n%n");
		    
			}
			
		}

	}


