package lab5;

public class LibraryBook implements ILibraryBook, Comparable<Object>{
	
	public Reader chit;
	public String name_book;
	public boolean status;
	
	public LibraryBook(String bn, boolean st)
	{
		this.name_book = bn;
		this.status = st;
	}
	
	public String getNameBook()
	{
		return name_book;
	}
	
	public void setNameBook(String _book_name)
	{
		name_book = _book_name ;
	}
	
	public boolean getStatus()
	{
		return status;
	}
	public void get(Reader rdr)
	{
		chit=rdr;
		status=true;
	}
	public void ret(){
		chit=null;
		status=false;
	}
	public void setStatus(boolean _status)
	{
		status = _status ;
	}
	
	public boolean equals(Object r) 
	{
		if (status == ((LibraryBook) r).status)
			return true;
		else
			return false;
	}
	
	public String toString() 
	{
		String outPut = super.toString();
		return outPut;
	}
	
	public int compareTo(Object o)
	{
		LibraryBook lb=(LibraryBook)o;
		return this.toString().compareTo(lb.toString());
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
