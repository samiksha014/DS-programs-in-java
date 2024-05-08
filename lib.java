import java.util.Scanner;

class Library {

	int no_of_books;
	int members;
	String emailid;
	String idno;
	


//-------------- Inner class for describing the availability of books-------------------//

class BooksAvail {

	int avail_books;
	int noavail_books;
	int max_limit;
	
	public BooksAvail(int avail_books , int noavail_books , int max_limit)
	{
		this.avail_books = avail_books;
		this.noavail_books = noavail_books;
		this.max_limit = max_limit;
	}
	
	public void display()
	{
	
		books_avail b = new books_avail(3000,1000,3);
		System.out.println("Total Books available : "+ b.avail_books);
		System.out.println("Total Books not available : "+ b.noavail_books);
		System.out.println("Maximum limit to isse the book : "+ b.max_limit);
	}
}

//--------------- Inner class describing the specific details of the book issued---------------//
			
class BookDetails {

	private String author;
	private String title;
	private int book_no;
	
	BookDetails(String author, String title, int book_no)
	{
		this.author = author;
		this.title = title;
		this.book_no = book_no;
	}
	
	public void display()
	{
		
		System.out.println("Author:- "+author);
		System.out.println("Title:- "+title);
		System.out.println("Book No:- "+book_no);
		
	}
		
	
}

//----------------------- Inner class describing the details of the valid members----------------------------//

class Members  {

	String name;
	String emailid;
	
	public void details()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Name of the member");
		 name = scanner.nextLine();
		
		System.out.println("IDno of the member");
		 idno = scanner.nextLine();
		
		System.out.println("Emailid of the member");
		 emailid = scanner.nextLine();
		System.out.println("\n");
		
	}
	
	
	public void display() {
 	   members sub1 = new members();
	    sub1.details();

	    String[] valid_id_no = {"BCS", "BIT", "BEC", "BEL", "BIN", "BCH", "BTT", "BPE", "BCH", "BME"};

	    System.out.println("Name:- " + sub1.name);

	    String subString = sub1.idno.substring(4,7);
	    
	    int found=0;
	    
	    for(int i=0;i<valid_id_no.length;i++){
	    	if(valid_id_no[i].equals(subString))
	    	{
	    		System.out.println("IDNO :- "+sub1.idno);
	    		found=1;
	    		break;
	    	}
	    	
	  
	    }
	    
	    if(found != 1)
	    {
	    	System.out.println("INVALID ID NO");
	    	System.out.println("Please give a valid idno!!!!");

	    }
	    
	    else{    
	    	System.out.println("Email id :- "+sub1.emailid);	    
	   }
	   
	 }
	 
      }
      
      
//---------------------------------- Inner class showing the email part to be send after issue------------------//
class BookIssue  {
	
	String date_of_issue;
	String date_of_due;
	String book_name;
	int serial_no;  
	String emailid;
	String idno;

	 BookIssue(int serial_no , String date_of_issue, String date_of_due , String book_name , String emailid, String idno)
	{
		this.serial_no = serial_no;
		this.date_of_issue = date_of_issue;
		this.date_of_due = date_of_due;
		this.book_name = book_name;
		this.emailid = emailid;
		this.idno = idno;
		
	}
	
	void display()
	{
		//email is send to the specific member of the given id no
		System.out.println("To :- "+emailid);
		System.out.println("Registration No :- "+idno);
		System.out.println("Book Name :- "+book_name);
		System.out.println("Serial no :- "+serial_no);
		System.out.println("Date of issue :- "+date_of_issue);
		System.out.println("Date of overdue :- "+date_of_due);
	}
	
			

}


//------------------------------------ Inner class showing total balance remained after the issue----------------------//
class Balance {
	
	int total_balance = 3;
	int no_of_book_issued;
	int total;
	
	void balance()
	{
		//this method will show the total balance remaining 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the total number of book issued ");
		no_of_book_issued = scanner.nextInt();
		
		System.out.println();
		System.out.println("Total number of book issued : "+no_of_book_issued);
		
		total=total_balance-no_of_book_issued;
		
		if(total > total_balance)
		{	
			System.out.println("Limit Reached!!");
			
		}
		
		else{
			System.out.println(" balance :- "+total);
		}
		
		System.out.println("The email has been send!!!");
		
	}
		
}

public static void main(String args[])
{
	Library lib = new Library();
	
	//using inner classes 
	
	Library.BooksAvail bookAvail = lib.new BooksAvail(3000,1000,3);
	bookAvail.display();
	System.out.println("\n");
	
	Library.BookDetails bookDetails = lib.new BookDetails("CHARLES DUHIGG","THE POWER OF HABIT",12);
	bookDetails.display();
	System.out.println("\n");
	
	Library.Members members = lib.new Members();
	members.details();
	members.display();
	System.out.println("\n");
	
	Library.BookIssue bookIssue = lib.new BookIssue(12,"13/04/2024","28/04/2024","THE POWER OF HABITS","2022bit014@sggs.ac.in","2022bit014");
	System.out.println("The book has been issued to "+bookIssue.emailid+", the due date of the book is given in the information below");
	bookIssue.display();
	System.out.println("\n");
	
	Library.Balance balance = lib.new Balance();
	balance.balance();

}

}
	


//--------------------------------------------------------------end------------------------------------------------//	

	
	

			
	
