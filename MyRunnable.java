package com.jang.threaddemo;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i=0; i<=10; i++)
		{
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		
	
	MyRunnable obj = new MyRunnable();
	            
         Thread tt = new Thread(obj);
                tt.start();
		
	}
		
	

}
