//I. Да се състави клас Color, имплементиращ интерфейс Comparable:
//Скрити член променливи
// - съставни елементи по основните цветове ( RGB ) long и
// - общ (смесен) цвят, образуван от основните по формула: 256*256*RValue+256*GValue+1*BValue

class Color 
{
	private long RValue, GValue, BValue, NValue;
	
	//1) Подразбиращ се: public Color() {}
	public Color()
	{
		RValue = 0;
		GValue = 0;
		BValue = 0;
	}
	
	// 2) Експлицитен -	по общ цвят: public Color(long c)
	public Color(long c)
	{
		c = 256 * 256 * RValue + 256 * GValue + 1 * BValue;
	}
	
	//3) четене/запис –за съставните цветове по 3 get/set 
	public long getRValue ()
	{
		return RValue;
	}
	
	public long getGValue ()
	{
		return GValue;
	}
	
	public long getBValue ()
	{
		return BValue;
	}
	
}


public  class ColorRectangle extends Color implements Comparable
{
	private int iX1, iY1, iX2, iY2;
	
	public ColorRectangle()
	{
		iX1 = iY1 = iX2 = iY2 = 0;
	}
	
	public ColorRectangle(int x1, int y1, int x2, int y2)
	{
		iX1 = x1;
		iY1 = y1;
		iX2 = x2;
		iY2 = y2;
	}
	
	public int getIX1()
	{
		return iX1;
	}
	
	public int getIX2()
	{
		return iX2;
	}
	
	public int getIY1()
	{
		return iY1;
	}
	
	public int getIY2()
	{
		return iY2;
	}
	
	public int calcArea()
	{
		return (Math.abs(iX2-iX1))*(Math.abs(iY2-iY1));
	}
	
	public int compareTo(ColorRectangle r)
	{
		if(this.calcArea() < r.calcArea())
			return 1;
		else if(this.calcArea() > r.calcArea())
			return -1;
		else return 0;
	}
	
	public boolean equals(ColorRectangle r)
	{
		return (this.calcArea() == r.calcArea());
	}
	
	public void translateY(int iPoints)
	{
		iY1 += iPoints;
		iY2 += iPoints;
	}
	
	public void translateXY(int iPoints)
	{
		iX1 += iPoints;
		iX2 += iPoints;
		iY1 += iPoints;
		iY2 += iPoints;
	}
	
	public void translateX(int iPoints)
	{
		iX1 += iPoints;
		iX2 += iPoints;
	}
	
	public boolean isInside(int ptX, int ptY )
	{
		return (iX1 > ptX && ptX < iX2 && iY1 > ptY && ptY < iY2);
	}
	
	public String toString(){
		return "X1: " + iX1 + ", X2:"+iX2+", Y1:"+ iY1 + ", Y2:"+iY2;
	}
	
	public ColorRectangle unionRect(ColorRectangle r) 
	{
		ColorRectangle rec = new ColorRectangle();
		if(this.iX1 < r.iX1)
		{
			rec.iX1 = this.iX1;
			rec.iX2 = r.iX2;
		}
		else
		{
			rec.iX1 = r.iX1;
			rec.iX2 = this.iX2;
		}
		if(this.iY1 < r.iY1)
		{
			rec.iY1 = this.iY1;
			rec.iY2 = r.iY2;
		}
		else
		{
			rec.iY1 = r.iY1;
			rec.iY2 = this.iY2;
		}
		return rec;
	}
	
	public static void main(String[] args) 
	{
		ColorRectangle r1 =  new ColorRectangle(2, 2, 4, 4);
		ColorRectangle r2 = new ColorRectangle(5, 5, 7, 7);
		System.out.println(r1.toString() + "\n");
		System.out.println(r2.toString() + "\n");
		r2.translateXY(2);
		ColorRectangle r3 = r1.unionRect(r2);
		System.out.println(r3.toString() + "\n");
	}


	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}