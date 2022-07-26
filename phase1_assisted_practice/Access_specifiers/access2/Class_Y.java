package access2;
import Access_specifiers.M;
import Access_specifiers.N;


public class Class_Y extends Class_X{
	public static void main(String args[])
	{
	Class_X obj=new Class_X();
	obj.printnoX();
	M objM=new M();
	N objN=new N();
	objM.printno();
	objN.printnoN();
	}

}
