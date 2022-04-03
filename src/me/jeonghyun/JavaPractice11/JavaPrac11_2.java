package me.jeonghyun.JavaPractice11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class JavaPrac11_2 {

	public static void main(String[] args) {
		Stack st = new Stack();     // 클래스 
		Queue q = new LinkedList(); // Queue인터페이스의 구현체인 LinkedList를 사
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
        System.out.println(" = Stack = ");
        while(!st.empty()) {  
        	System.out.println(st.pop());  // 무한반복문을 통하여 스택에서 요소 하나씩 꺼내서 출력 
        }	
        System.out.println(" = Queue = ");
        while(!q.isEmpty()) {
        	System.out.println(q.poll());  // 무한반복문을 통하여 큐에서 요소 하나씩 꺼내어 출력 
        }
        
        
		
		

	}

}
