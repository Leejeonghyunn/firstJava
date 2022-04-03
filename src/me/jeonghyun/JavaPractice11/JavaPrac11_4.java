package me.jeonghyun.JavaPractice11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
public class JavaPrac11_4 { //최근에 열어본 문서의 목록을 보여주는 기능(최대개수가 정해져있다) 
                            //MAX_SIZE의 값을 변경합으로써 더 많은 명령어 기록을 남길 수 있다.
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;  //Queue에 최대 5개 까지만 저장되도록 한다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner s = new Scanner(System.in); //화면으로부터 라인단위로 입력받는다.
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + " 개 보여줍니다 ");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					save(input); //입력받은 명령어를 저장하고 
					
					LinkedList tmp= (LinkedList)q; //LinkedList의 내용을 보여준다 
					ListIterator it = tmp.listIterator(); // final int Size = int.size();
					                                      // for(int i=0; i<Size; i++)
					while(it.hasNext())                   // System.out.println((i+1)+"."+list.get(i))); //get메서드 이용함
						System.out.println(++i+"."+it.next());
				} else {
					save(input);
					System.out.println(input);
				}
			   
			} catch(Exception e) {
					System.out.println("입력오류입니다.");
				}
			}
		}

    public static void save(String input) {
    	if(!"".equals(input)) //queue에 저장한다 
    		q.offer(input);
    	
    	if(q.size()> MAX_SIZE) //queue의 최대크기를 넘으면 제일 처음 입력된것을 삭제한다.
    		q.remove();
    }
		
		
		

	

}
