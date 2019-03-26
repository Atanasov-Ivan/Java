package lab5;

import java.util.GregorianCalendar;

class Applicant {

		protected static String name;
		protected static GregorianCalendar date;
		protected static double grades;
		
		public Applicant(GregorianCalendar date, String name, double grades)
		{
			this.name = name;
			this.date = date;
			this.grades = grades;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setName(String _name)
		{
			name = _name; 
		}
		
		public GregorianCalendar getDate()
		{
			return date;
		}
		
		public void setDate(GregorianCalendar _date)
		{
			date = _date;
		}
		
		public double getGrades()
		{
			return grades;
		}
		
		public void setGrades(double _grades)
		{
			grades = _grades;
		}

		public String toString() 
		{
			String outPut = "Name: " + this.name + " " + "Date: " + this.date + " "
					+ "Grades: " + this.grades;
			return outPut;
		}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
