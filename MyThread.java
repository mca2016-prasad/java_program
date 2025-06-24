package com.jang.threaddemo;

public class MyThread extends Thread{
	

	  public  void run()
	     {
	    	 System.out.println("starting executeing thread!!");
	     }
	  
	  
	  public static void main(String[] args) {
		MyThread t = new MyThread();
		         t.start();
	}
}
