package lab5;

import java.util.GregorianCalendar;

class Student extends Applicant implements Comparable  {

	private String f_nom;
	
	public Student(String name, String f_nom){
		super(new GregorianCalendar(), name, 0.0);
		this.f_nom = f_nom;
	}
	
	public Student(GregorianCalendar date, String name, double grades, String f_nom) 
	{
		super(date, name, grades);
		this.f_nom = f_nom;
		
	}
	
	public String toString() 
	{
		String outPut = super.toString() + ", Faculty number: " + this.f_nom;
		return outPut;
	}
	
	public int compareTo(Object stud)
	{
		return f_nom.compareTo(((Student)stud).f_nom);
	}
	
	public String getFN()
	{
		return f_nom;
	}
	
	public void setFN(String _fnom)
	{	
		f_nom = _fnom ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
