package lab5;

import java.util.GregorianCalendar;

class Reader extends Student implements IReader, Comparable {

	public Reader(String nm,String fn){
		super(name, fn);
	}
	
	public Reader(GregorianCalendar date, String name, double grades, String f_nom)
	{
		super(date, name, grades, f_nom);
	}
	
	public String getFN()
	{
		return super.getFN();
	}
	
	public void setFN(String fn)
	{
		
		super.setFN(fn);
	}
	
	public String toString() 
	{
		String outPut = super.toString();
		return outPut;
	}
	
	public int compareTo(Object stud)
	{
		return super.compareTo(stud);
	}
	
	public void get(ILibraryBook lb)
	{	
		lb.get(this);
	}
	
	public void ret(ILibraryBook lb)
	{
		lb.ret();
	}
	
}
