class Rectangle
{
    private double length;
    private double width;
    public Rectangle()
    {

    }
    public Rectangle( double length, double width)
    {
        this.length=length;
        this.width=width;

    }
    public double getlength()
    {
        return length;
    }
    public void setlength(double length)
    {
        this.length=length;
    }
    public double getwidth()
    {
        return width;
    }
    public void setwidth(double width)
    {
        this.width=width;
    }
    public double getarea()
    {
        return width*length;
    }
    public double getperimeter()
    {
        return (width+length)/2;
    }
}
public class Entry {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4, 5);
		System.out.println("Area: " + r.getarea());
		System.out.println("Perimeter: " + r.getperimeter());
		r.setlength(2);
		r.setwidth(3);
		System.out.println("Area: " + r.getarea());
		System.out.println("Perimeter: " + r.getperimeter());
	}
}