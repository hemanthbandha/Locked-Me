package com.companylockers;
import java.util.*;
import java.io.*;
public class Lockedme {

	public static void main(String[] args) throws IOException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To LockedMe Application");
		System.out.println("Developer Name:Banda Naga Sai Surya Hemanth");
		System.out.println(
				("This Application is useful in:\n#Sorting files in a directory \n#Adding file to a directory\n#Deleteing a file in a directory\n#Searching a file in a directo"
						+ "ry\n"));

		while(true) 				
		{	System.out.println("*******Main Menu***********");
			System.out.println("I.Generic Features \n 0.Sort Files\nII.Bussiness Level \n 1.Add File 2.Delete File 3.Search File 4.Exit Menu 5.Exit Program");
			System.out.println("--->Enter the choice");
			int c=sc.nextInt();
			switch(c)
			{
			case 0: Ascorder();
			
					break;
			case 1: System.out.println("enter file name:");
					String s=sc.next();
					Addfile(s);
					break;
			case 2:	System.out.println("enter file name:");
					String s1=sc.next();
					Delfile(s1);
					break;

			case 3:System.out.println("enter file name:");
				String s2=sc.next();
				int r=searchfile(s2);
				if(r==1)
					System.out.println("File Found");
				else
					System.out.println("Not found");
				break;
			case 4:System.out.println("Returning to Main Menu");
					break;	
					
			case 5:System.exit(0);
					break;
					
			default:System.out.println("Wrong choice!!! Please select the listed choices");
					break;
			
			}
			
			}
			
			}
	
	private static void Ascorder() 
	{
		File f=new File("E:/Lockedme.com/");
		String[] files = f.list();
		Arrays.asList(files);
		Arrays.sort(files);
		System.out.println("The Sorted files are:");
		for(String i:files) {
			System.out.println(i);
		}
		
	}
	private static void Addfile(String s)
	{
		File f=new File("E:\\Lockedme.com\\"+s);
		try {
			if(f.createNewFile())
				System.out.println("File created with name:"+s);
			else
				System.out.println("File already exists");
		} catch (IOException e) {
		
		}
		

	}
	 
	private static void Delfile(String s) {
		File f=new File("E:\\Lockedme.com\\"+s);
		int r=searchfile(s);
		if(r==1)
			{
			f.delete();
			System.out.println("File deleted with name:"+s+"\n");
			}
		else
			System.out.println("File not exists\n");
		
		
	}

	private static int searchfile(String s) {
		File f=new File("E:/Lockedme.com/");
		String[] files = f.list();
		for(String file : files)
			{if(file.equals(s))
		            return 1;}
		return 0;
	}

}
