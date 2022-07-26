package phase1_assisted_practice;

public class Overloading {
Overloading()
{
System.out.println("default is printed");
String s="the values are:";
}
Overloading (int d)
{
	int a=d;
	areasqure(a);
}
Overloading(int l,int b)
{
	int a=l;int c=b;
	arearec(a,c);
}
Overloading (float l)
{
	float a=l;
	areacir(a);
}
void areasqure(int f)
{
	int are=f*f;
	System.out.println("Square:"+are);
	
}
void arearec(int f,int l)
{
	int are=f*l;
	System.out.println("Rectangle:"+are);
}
void areacir(float f)
{
	float are=f*f*3.14f;
	System.out.println("Circle:"+are);
}
void arearob(int r, int s)
{
int are=r*s/2;
System.out.println("Rhombus:"+are);
}
void areatri(float b, float h)
{
	float are=b*h/2;
	System.out.println("Triangle:"+are);
}
public static void main (String[] args)
{
	Overloading s1=new Overloading();
	Overloading s2=new Overloading(5);
	Overloading s3=new Overloading(5,10);
	Overloading s4=new Overloading(4.5f);
	Overloading s5=new Overloading();
	s5.arearob(10, 20);
	s5.areatri(10.0f, 20.0f);
}
}
