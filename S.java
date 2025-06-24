package com.jang.excepitonDemo;

public class S {
	public static void main(String[] args) {
		
		String str=null;
		
		      int len= str.length();
		      //System.out.println(len);
		      try
		      {
		    	  if(len==0)
		    	  {
		    		  str.concat("jang");
		    		 System.out.println(str);
		    	  }
		      }
		      catch(NullPointerException e)
		      {
		    	 // System.out.println(e.getMessage());
		    	  System.out.println(e.toString());
		      }
		      
		      
		      
		      String str1 = "";
		        System.out.println(str1.isBlank());
		 
		        String str2 = "GeeksForGeeks";
		        System.out.println(str2.isBlank());
		      
	}

}
