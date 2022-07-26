package access2;

import Access_specifiers.M;
import Access_specifiers.N;
import Access_specifiers.P;
public class Class_Z {
	public static void main(String args[])
	{
		Class_X obj=new Class_X();
		obj.printnoX();
		M objM=new M();
		N objN=new N();
		P objP=new P();
		objM.printno();
		objN.printnoN();
		objP.printnoN();
		
	}
}
