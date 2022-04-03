package me.jeonghyun.javaPractice;

public class Practice616 {
	
	  public static void change(String str) {
		  str=str+"456";
	  }
      public static void main(String[] args) {
    	  String str = "ABC123";
    	  System.out.println(str);
    	  change(str);
    	  System.out.println("After change:" + str);
      }
}
