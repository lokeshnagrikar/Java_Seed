package assignment;

public class FiboNacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0,n2=1,n3,num=15;
		System.out.println( " "+n1+"\n" + " "+n2); // print 1st two fibonacci numbers
		
		//now loop start from 2
		for(int i=2;i<=num;i++)
		{
			n3= n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
		}
		
	}

}
