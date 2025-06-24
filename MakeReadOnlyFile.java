package com.jang.array;

import java.io.File;

public class MakeReadOnlyFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\ReferenceCard.pdf");
		//boolean status =   file.setReadOnly();
		if(file.exists())
		{
			boolean status =   file.setReadOnly();
			if(status)
			{
				System.out.println("file is now read only!!");
			}
			else
			{
				System.out.println("fail to make read only!!");
			}
		}
		else
		{
			System.out.println("file does't exist");
		}
	}
}
