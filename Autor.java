package com.exerises.bll;

public class Autor {
	
		
		private String firstName;
		private String lastName;
		private String bookName[];
		
		public Author(){
			
		}
		
		public  Author(String firstName,String lastName){
			this.firstName=firstName;
			this.lastName=lastName;
		}
		public Author(String firstName,String lastName,String bookName[]){
			this.firstName=firstName;
			this.lastName=lastName;
			this.bookName=bookName;
		}
		public void setFirstName (String firstName) {
			this.firstName=firstName;
		}
		public void setLastName (String lastName) {
			this.lastName=lastName;
		}
		public void setBookName(String bookName[]) {
			 this.bookName=bookName;
	         
		}

		public String getFirstName() {
			return this.firstName;
		}
		public String getLastName() {
			return this.lastName;
		}
		public String getBookName() {
			return this.bookName;
		}
		
		@Override
		public String toString() {
			 return "\nAuthor Details"+"\nAuthor firstName :"
		+this.firstName+"\nLastName : "+this.lastName+"\nBookName :"+this.bookName;
		}
		
	};
}
