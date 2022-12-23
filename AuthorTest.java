package com.exerises.pll;
import com.exercises.bll.Author;
import java.util.Scanner;

public class AuthorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Author bookName[]= new Author[3];
		int length=bookName.length;
			
			
		    Author a1=new Author();
		    Author a2=new Author("Narayana","Murthy");
		    //Author a3=new Author("Denis","Riche",bookName);
		    Author a4;
		    
		     System.out.println("Displaying a2 objects details using getters : ");
			 System.out.println(a2.getFirstName());
			 System.out.println(a2.getLastName());
			
			 System.out.println("\nDisplaying the values of first object using getters : ");
			 System.out.println(a1.getFirstName());
			 System.out.println(a1.getLastName());
			 a4=a2;
			 System.out.println(a4);
			 
			 sc.close();
	
}
}


